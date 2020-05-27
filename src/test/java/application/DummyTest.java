package application;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import application.inventory.controller.InventoryController;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@WebMvcTest(InventoryController.class)
public class DummyTest {
    @MockBean
    private InventoryController inventoryController;

    @Test
    public void testGetInventory() {
        System.out.println("here : " + inventoryController.getInventory());
    }


    // @Test
    // public void testHealthEndpoint() {
    //     final ResponseEntity<String> entity = this.restTemplate.getForEntity("/actuator/health", String.class);
    //     assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
    //     assertThat(entity.getBody()).contains("\"status\":\"UP\"");
    // }

    // @Test
    // public void testLivenessEndpoint() {
    //     final ResponseEntity<String> entity = this.restTemplate.getForEntity("/actuator/liveness", String.class);
    //     assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
    //     assertThat(entity.getBody()).contains("\"status\":\"UP\"");
    // }

    // @Test
    // @SuppressWarnings("unchecked")
    // public void testMetricsEndpoint() {
    //     testLivenessEndpoint(); // access a page

    //     @SuppressWarnings("rawtypes")
    //     final ResponseEntity<Map> entity = this.restTemplate.getForEntity("/actuator/metrics", Map.class);
    //     assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);

    //     final Map<String, Object> body = entity.getBody();
    //     assertThat(body).containsKey("names");
    //     assertThat((List<String>) body.get("names")).contains("jvm.buffer.count");
    // }

    // @Test
    // public void testPrometheusEndpoint() {
    //     testLivenessEndpoint(); // access a page

    //     final ResponseEntity<String> entity = this.restTemplate.getForEntity("/actuator/prometheus", String.class);
    //     assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
    //     assertThat(entity.getBody()).contains("# TYPE jvm_buffer_count_buffers gauge");
    // }
}
