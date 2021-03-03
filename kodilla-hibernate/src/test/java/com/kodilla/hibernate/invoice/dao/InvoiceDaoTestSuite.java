package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.util.Optional;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;

    private static final String PRODUCT_NAME = "first product";
    private static final String PRODUCT_NAME1 = "second product";

    @Test
    void testInvoiceDaoSave() {

        //Given
        Invoice invoice = new Invoice("2323");
        Product product1 = new Product(PRODUCT_NAME);
        Product product2 = new Product(PRODUCT_NAME1);

        Item item1 = new Item(new BigDecimal(53), 42, new BigDecimal(2));
        Item item2 = new Item(new BigDecimal(60), 76,new BigDecimal(5));
        Item item3 = new Item(new BigDecimal(26), 2, new BigDecimal(6));

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product2);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        productDao.save(product1);
        productDao.save(product2);
        invoiceDao.save(invoice);
        itemDao.save(item1);
        itemDao.save(item2);

        //Then
        int id = invoice.getId();
        Optional<Invoice> readInvoice = invoiceDao.findById(id);
        Assert.assertTrue(readInvoice.isPresent());

        //CleanUp
        productDao.deleteAll();
        itemDao.deleteAll();
        invoiceDao.deleteAll();






    }


}
