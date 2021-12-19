package SartenMango_5;


import SartenMango_5.interfaces.InterfaceOrder;
import SartenMango_5.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import SartenMango_5.interfaces.InterfaceCookware;


@Component
@SpringBootApplication

/**
**
*/
public class SartenMango_5Application implements CommandLineRunner {
	@Autowired
	private InterfaceCookware interfaceSupplements;
	@Autowired
	private InterfaceUser interfaceUser;
	@Autowired
	private InterfaceOrder interfaceOrder;
	public static void main(String[] args) {
		SpringApplication.run(SartenMango_5Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		interfaceSupplements.deleteAll();
		interfaceUser.deleteAll();
		interfaceOrder.deleteAll();
	}

}