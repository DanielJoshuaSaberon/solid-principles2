package SOLID2.ConcreteClasses;

import SOLID2.Interfaces.SendEmailNotification;

public class EmailNotification implements SendEmailNotification {
    @Override
    public void sendEmailNotification(String email) {
        System.out.println("Email notification sent to: " + email);
    }
}
