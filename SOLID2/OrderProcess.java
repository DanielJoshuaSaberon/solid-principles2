package SOLID2;

import SOLID2.UsaCase.*;
import SOLID2.Interfaces.*;


public class OrderProcess {

    private final CalculateTotalUseCase totalProcessor;
    private final PlaceOrderUseCase orderPlacer;
    private final InvoiceUseCase invoiceGenerator;
    private final EmailNotificationUseCase emailSender;

    public OrderProcess(PlaceOrder order, GenerateInvoice invoice,
                        SendEmailNotification emailNotif, CalculateTotal total) {

        this.totalProcessor = new CalculateTotalUseCase(total);
        this.orderPlacer = new PlaceOrderUseCase(order);
        this.invoiceGenerator = new InvoiceUseCase(invoice);
        this.emailSender = new EmailNotificationUseCase(emailNotif);
    }

    public void processOrder(OrderDetails details) {
        totalProcessor.execute(details);
        orderPlacer.execute(details);
        invoiceGenerator.execute(details);
        emailSender.execute(details);
    }
}
