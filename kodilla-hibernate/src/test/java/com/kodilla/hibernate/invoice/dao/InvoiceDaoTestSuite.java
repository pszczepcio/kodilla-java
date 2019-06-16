//package com.kodilla.hibernate.invoice.dao;
//
//import com.kodilla.hibernate.invoice.Invoice;
//import com.kodilla.hibernate.invoice.Item;
//import com.kodilla.hibernate.invoice.Product;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import java.math.BigDecimal;
//import java.util.List;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class InvoiceDaoTestSuite {
//    @Autowired
//    private InvoiceDao invoiceDao;
//    @Autowired
//    private ProductDao productDao;
//
//    @Test
//    public void testInvoiceDaoSave(){
//        //Given
//        Product melon = new Product("Melon");
//        Product apple = new Product("Apple");
//        Product carrot = new Product("Carrot");
//        Product orange = new Product("Orange");
//
//        Item item = new Item(new BigDecimal(100),10,new BigDecimal(1000));
//        Item item2 = new Item(new BigDecimal(10),10,new BigDecimal(100));
//        Item item3 = new Item(new BigDecimal(2),20,new BigDecimal(40));
//        Item item4 = new Item(new BigDecimal(1),10,new BigDecimal(10));
//        Item item5 = new Item(new BigDecimal(3),5,new BigDecimal(15));
//
//        productDao.save(melon);
//        productDao.save(apple);
//        productDao.save(carrot);
//        productDao.save(orange);
//
//        melon.getItems().add(item);
//        melon.getItems().add(item2);
//        apple.getItems().add(item3);
//        carrot.getItems().add(item4);
//        orange.getItems().add(item5);
//
//        item.setProduct(melon);
//        item2.setProduct(melon);
//        item3.setProduct(apple);
//        item4.setProduct(carrot);
//        item5.setProduct(orange);
//
//        Invoice invoice1 = new Invoice("Invoice1");
//        invoice1.getItems().add(item);
//        invoice1.getItems().add(item2);
//        invoice1.getItems().add(item3);
//        invoice1.getItems().add(item4);
//        invoice1.getItems().add(item5);
//
//        item.setInvoice(invoice1);
//        item2.setInvoice(invoice1);
//        item3.setInvoice(invoice1);
//        item4.setInvoice(invoice1);
//        item5.setInvoice(invoice1);
//        //When
//        invoiceDao.save(invoice1);
//        List<Invoice> readInvoice = invoiceDao.findById(invoice1.getId());
//        System.out.println("size" + readInvoice.size());
//
//        //Then
//        //Assert.assertEquals(invoice1.getId(),readInvoice );
////        Assert.assertNotEquals(0,invoice1.getId());
////        Assert.assertNotEquals(0,item.getId());
////        Assert.assertNotEquals(0,apple.getId());
//
//        //CleanUp
//         invoiceDao.delete(invoice1.getId());
//         productDao.delete(melon.getId());
//         productDao.delete(apple.getId());
//         productDao.delete(carrot.getId());
//         productDao.delete(orange.getId());
//    }
//}