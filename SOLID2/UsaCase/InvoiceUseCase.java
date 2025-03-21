package SOLID2.UsaCase;

import SOLID2.Interfaces.GenerateInvoice;
import SOLID2.OrderDetails;

public class InvoiceUseCase implements Process {

    private final GenerateInvoice invoice;

    public InvoiceUseCase(GenerateInvoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public void execute(OrderDetails details) {
        if (details.getFileName() != null && !details.getFileName().isEmpty()) {
            invoice.generateInvoice(details.getFileName());
        }
    }
}
