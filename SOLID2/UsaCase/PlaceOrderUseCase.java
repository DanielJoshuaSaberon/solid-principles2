package SOLID2.UsaCase;

import SOLID2.Interfaces.PlaceOrder;
import SOLID2.OrderDetails;

public class PlaceOrderUseCase implements Process{

    private final PlaceOrder order;

    public PlaceOrderUseCase(PlaceOrder order) {
        this.order = order;
    }

    @Override
    public void execute(OrderDetails details) {
        order.placeOrder(details.getCustomerName(), details.getAddress());
    }
}
