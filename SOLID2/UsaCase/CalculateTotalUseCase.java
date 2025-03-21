package SOLID2.UsaCase;

import SOLID2.Interfaces.CalculateTotal;
import SOLID2.OrderDetails;

public class CalculateTotalUseCase implements Process {
    private CalculateTotal total;

    public CalculateTotalUseCase(CalculateTotal total) {
        this.total = total;
    }

    @Override
    public void execute(OrderDetails details) {
        double sum = total.calculateTotal(details.getAmount(), details.getQuantity());
        System.out.println("Order total: $" + sum);
    }
}
