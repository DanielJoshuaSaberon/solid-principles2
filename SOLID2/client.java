package SOLID2;

import SOLID2.ConcreteClasses.*;
import SOLID2.Interfaces.*;

public class client {
    public static void main(String[] args) {

        PlaceOrder order = new Order();
        GenerateInvoice invoice = new Invoice();
        SendEmailNotification emailNotif = new EmailNotification();
        CalculateTotal total = new Total();
        //
        OrderProcess orderProcess = new OrderProcess(order, invoice, emailNotif, total);
        OrderDetails orderDetails1 = new OrderDetails();


        orderDetails1.setCustomerName("John Doe");
        orderDetails1.setAddress("123 Main St");
        orderDetails1.setAmount(10.0);
        orderDetails1.setQuantity(3);
        orderDetails1.setFileName("invoice_123.pdf");
        orderDetails1.setEmail("johndoe@example.com");
        //
        orderProcess.processOrder(orderDetails1);

        OrderDetails orderDetails2 = new OrderDetails();
        orderDetails2.setCustomerName("Jane Smith");
        orderDetails2.setAddress("456 Oak Ave");
        orderDetails2.setAmount(20.0);
        orderDetails2.setQuantity(2);
        orderDetails2.setEmail("janesmith@example.com");
        //
        System.out.println();
        orderProcess.processOrder(orderDetails2);

        OrderDetails orderDetails3 = new OrderDetails();
        orderDetails3.setCustomerName("Jane Smith");
        orderDetails3.setAddress("456 Oak Ave");
        orderDetails3.setAmount(20.0);
        orderDetails3.setQuantity(2);
        //
        System.out.println();
        orderProcess.processOrder(orderDetails3);
    }
}
