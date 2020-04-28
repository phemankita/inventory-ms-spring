package application.inventory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import application.inventory.models.Inventory;
import application.inventory.models.InventoryRepo;

/**
 * REST Controller to manage Inventory database
 *
 */
@RestController("inventoryController")
@RequestMapping("/")
public class InventoryController {
	
	Logger logger =  LoggerFactory.getLogger(InventoryController.class);

	@Autowired
	@Qualifier("inventoryRepo")
	private InventoryRepo itemsRepo;

	/**
	 * @return all items in inventory
	 */
	@GetMapping("/inventory")
	@ResponseBody Iterable<Inventory> getInventory() {
		return itemsRepo.findAll();
	}

}