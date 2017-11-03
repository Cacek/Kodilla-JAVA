package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest

public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    //ItemDao itemDao;
    //InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        Product product1 = new Product("Produkt 1");
        Product product2 = new Product("Produkt 2");
        Product product3 = new Product("Produkt 3");

        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);


//
//        product1.getItems().add(item1);
//        product2.getItems().add(item2);
//        product3.getItems().add(item3);
//
//
//
//        Invoice invoice = new Invoice("2017/11/01");
//
//        Item item1  = new Item(new BigDecimal("1"), 1, new BigDecimal("1"));
//        Item item2  = new Item(new BigDecimal("2"), 1, new BigDecimal("2"));
//        Item item3  = new Item(new BigDecimal("3"), 5, new BigDecimal("15"));
//
//
//
//        item1.setProduct(product1);
//        item2.setProduct(product2);
//        item3.setProduct(product3);
//
//
////        invoice.getItems().add(item1);
////        invoice.getItems().add(item2);
////        invoice.getItems().add(item3);
////
////        invoiceDao.save(invoice);
//
//
//
    }
}
