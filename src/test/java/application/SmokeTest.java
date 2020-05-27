package application.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import application.inventory.controller.InventoryController;

@RunWith(SpringRunner.class)
@WebMvcTest(InventoryController.class)
public class SmokeTest {

    @MockBean
    private InventoryController inventoryController;

    @Test
	public void contexLoads() throws Exception {
		assertThat(inventoryController).isNotNull();
    }
    
}
