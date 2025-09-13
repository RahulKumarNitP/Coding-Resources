package creational.Factory.FactoryMethod;

public class Demo {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        Notification smsNotification = factory.createNotification(NotificationType.SMS);
        smsNotification.notifyUser();
        Notification emailNotification = factory.createNotification(NotificationType.EMAIL);
        emailNotification.notifyUser();
        Notification whatsAppNotification = factory.createNotification(NotificationType.WHATSAPP);
        whatsAppNotification.notifyUser();
    }
}
