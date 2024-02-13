import models.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleTest {

    Vehicle vehicle;

    @BeforeEach
    public void setUp(){
        vehicle = new Vehicle(4, true, "BMW",13700.27);
    }

    @Test
    public void canRent(){
        String result = vehicle.rent("Car rental");
        assertThat(result).isEqualTo("BMW was rented for 13700.27");
    }


}
