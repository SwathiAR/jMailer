import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

/**
 * Created by swathi on 3/21/2016.
 */
public interface GoogleMailer {

    public  void Send(final String username, final String password, String recipientEmail, String title, String message)throws AddressException, MessagingException;

    public  void Send(final String username, final String password, String recipientEmail, String ccEmail, String title, String message)throws AddressException, MessagingException;

}