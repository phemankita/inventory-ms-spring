package application.inventory.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import application.inventory.models.About;
import application.inventory.models.AboutService;
import application.inventory.models.Inventory;
import application.inventory.repository.InventoryRepo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * REST Controller to manage Inventory database
 *
 */
@RestController("inventoryController")
@Api(value="Inventory API")
@RequestMapping("/")
public class InventoryController {
	
	Logger logger =  LoggerFactory.getLogger(InventoryController.class);

	@Autowired
	@Qualifier("inventoryRepo")
	private InventoryRepo itemsRepo;
	
	private AboutService abtService; 
	
	/**
	 * @return all items in inventory
	 */
	@ApiOperation(value = "About")
	@GetMapping("/about")
	public  ResponseEntity<String> aboutInventory() {
		return new ResponseEntity<>(abtService.getInfo().toString(), HttpStatus.OK);
	}

	/**
	 * @return all items in inventory
	 */
	@ApiOperation(value = "View a list of available items")
	@GetMapping("/inventory")
	@ResponseBody 
	public Iterable<Inventory> getInventory() {
		return itemsRepo.findAll();
	}

}