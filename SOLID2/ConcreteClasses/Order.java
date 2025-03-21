package SOLID2.ConcreteClasses;

import SOLID2.Interfaces.PlaceOrder;

public class Order implements PlaceOrder {
    @Override
    public void placeOrder(String customerName, String address) {
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}
