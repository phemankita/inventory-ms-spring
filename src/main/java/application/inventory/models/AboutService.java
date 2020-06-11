package application.inventory.models;

import org.springframework.stereotype.Service;

@Service
public class AboutService {
	
public About getInfo(){
		
		/* for testing the provider end. This service will be mocked */
	    About abt = new About("Inventory Service", "Storefront", "Stores all the inventory data");
		return abt;
	}

}
