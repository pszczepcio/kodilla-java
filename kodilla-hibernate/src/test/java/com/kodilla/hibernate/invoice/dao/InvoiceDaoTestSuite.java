package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
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
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product melon = new Product("Melon");
        Item item = new Item(new BigDecimal(100),10,new BigDecimal(1000));
        Item item2 = new Item(new BigDecimal(10),10,new BigDecimal(100));

        melon.getItems().add(item);
        melon.getItems().add(item2);
        item.setProduct(melon);
        item2.setProduct(melon);

        Invoice invoice1 = new Invoice("Invoice1");
        invoice1.getItems().add(item);
        invoice1.getItems().add(item2);

        item.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        //When
        invoiceDao.save(invoice1);
        int id = invoice1.getId();

        //Then
        Assert.assertNotEquals(0,id);

        //CleanUp
        invoiceDao.delete(id);



    }
}
