package SOLID2.UsaCase;

import SOLID2.Interfaces.SendEmailNotification;
import SOLID2.OrderDetails;

public class EmailNotificationUseCase implements Process {

    private final SendEmailNotification emailNotif;

    public EmailNotificationUseCase(SendEmailNotification emailNotif) {
        this.emailNotif = emailNotif;
    }

    @Override
    public void execute(OrderDetails details) {
        if (details.getEmail() != null && !details.getEmail().isEmpty()) {
            emailNotif.sendEmailNotification(details.getEmail());
        }
    }
}
