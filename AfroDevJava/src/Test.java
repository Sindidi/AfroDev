

import javax.naming.*;
import com.afrodev.entities.User;
import com.afrodev.session.ImplementationRemote;



public class Test {

	public static void main(String[] args) {
		try {
			Context ctx = new InitialContext();
			ImplementationRemote remote = (ImplementationRemote) ctx.lookup("AfroDevEJB/Implementation!com.afrodev.session.ImplementationRemote");
			
			User user1 = new User("Sindidi", "Diop", "Sindidi_job", "sindididiop@gmail.com", "12345", "ma_photo");
			remote.addUser(user1);
			User user2 = new User("Fall", "js", "Fall_js", "falljs@gmail.com", "12345", null);
			remote.addUser(user2);
				
		} catch (NamingException e) {
			e.printStackTrace();
		}

	}

}
