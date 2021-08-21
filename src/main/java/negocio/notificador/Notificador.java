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

    public void notificar(String email, String asunto, String mensaje) throws IOException {
        Email desde = new Email(FROM_EMAIL);
        Email para = new Email(email);

        Content contenido = new Content("text/plain", mensaje);

        Mail mail = new Mail(desde, asunto, para, contenido);

        SendGrid sg = new SendGrid(API_KEY);
        Request request = new Request();

        request.setMethod(Method.POST);
        request.setEndpoint("mail/send");
        request.setBody(mail.build());

        sg.api(request);
    }

}
