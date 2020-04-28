package application.inventory.models;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("inventoryRepo")
@Transactional
public interface InventoryRepo extends CrudRepository<Inventory, Long> {

}