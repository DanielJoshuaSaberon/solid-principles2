package SOLID2.ConcreteClasses;

import SOLID2.Interfaces.CalculateTotal;

public class Total implements CalculateTotal {
    @Override
    public double calculateTotal(double price, double quantity) {
        return (price * quantity);
    }
}
