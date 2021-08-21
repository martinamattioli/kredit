package negocio.notificador;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

import java.io.IOException;

public class Notificador {

    private static String FROM_EMAIL = "techbuydds@gmail.com";
    private static String API_KEY = "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";

    public void notificar(String email, String subject, String mensaje) throws IOException {
        Email from = new Email(FROM_EMAIL);
        Email to = new Email(email);

        Content content = new Content("text/plain", mensaje);

        Mail mail = new Mail(from, subject, to, content);

        SendGrid sg = new SendGrid(API_KEY);
        Request request = new Request();

        request.setMethod(Method.POST);
        request.setEndpoint("mail/send");
        request.setBody(mail.build());

        sg.api(request);
    }

}
