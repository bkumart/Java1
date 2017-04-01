package Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import javax.mail.*;
import org.eclipse.jetty.websocket.api.Session;

public class Snippet {
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\BHARATH\\Practise\\Framework\\src\\Java\\bharath.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		
	try {
		 
		/*Properties sysProps = System.getProperties();
		
		sysProps.setProperty("mail.store.protocol", "imaps");
		
		Session session = Session.getInstance(sysProps);
		 
		Store store = session.getStore();
		 
		store.connect(hostName, username, password);
		 
		Folder emailInbox = store.getFolder("INBOX");
		 
		emailInbox.open(Folder.READ_ONLY);
 
	    int unreadMsgCount = emailInbox.getUnreadMessageCount();
		 
		Message emailMessage = emailInbox.getMessage(0);
		 
		System.out.println("Email Subject: " + emailMessage.getSubject());
		
		emailInbox.close(true);
		 
		store.close();*/
	}finally {
		
	}
	}
}
