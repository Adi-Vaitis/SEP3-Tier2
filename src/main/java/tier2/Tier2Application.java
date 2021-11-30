package tier2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tier2.services.communication.ClientConnection;
import tier2.services.communication.SocketClient;

@SpringBootApplication
public class Tier2Application
{

	public static void main(String[] args) {
		SocketClient client = new ClientConnection();
		client.startClient();
		SpringApplication.run(Tier2Application.class, args);
	}

}
