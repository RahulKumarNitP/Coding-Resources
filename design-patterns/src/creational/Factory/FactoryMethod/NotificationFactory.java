package creational.Factory.FactoryMethod;

public class NotificationFactory {
    public Notification createNotification(NotificationType type) {
        switch (type) {
            case SMS:
                return new SMSNotification();
            case EMAIL:
                return new EmailNotification();
            case WHATSAPP:
                return new WhatsAppNotification();
            default:
                throw new RuntimeException("Not supported");
        }
    }
}
