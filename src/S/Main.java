package S;

public class Main {
    public static void main(String[] args) {
        Registration registration = new Registration();
        EmailService emailService = new EmailService();
        registration.register();
        emailService.sendEmail();
    }
}
