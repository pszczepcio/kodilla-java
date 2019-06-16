package com.kodilla.stream.forum.invoice.simple;

import com.kodilla.stream.invoice.simple.SimpleInvoice;
import com.kodilla.stream.invoice.simple.SimpleItem;
import com.kodilla.stream.invoice.simple.SimpleProduct;
import org.junit.Assert;
import org.junit.Test;

public class SimpleInvoiceTestSuite {
    @Test
    public void testGetValueToPay(){
        //Given
        SimpleInvoice innvoice = new SimpleInvoice();
        //When
        innvoice.addItem(new SimpleItem(new SimpleProduct("Product 1", 17.28),2.0));
        innvoice.addItem(new SimpleItem(new SimpleProduct("Product 2", 11.99),3.5));
        innvoice.addItem(new SimpleItem(new SimpleProduct("Product 3", 6.49),5.0));
        Assert.assertEquals(108.975,innvoice.getValueToPay(),0.001);
    }
}
