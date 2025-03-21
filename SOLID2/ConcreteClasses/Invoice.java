package SOLID2.ConcreteClasses;

import SOLID2.Interfaces.GenerateInvoice;

public class Invoice implements GenerateInvoice {
    @Override
    public void generateInvoice(String fileName) {
        System.out.println("Invoice generated: " + fileName);
    }
}
