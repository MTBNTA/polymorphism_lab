import models.Building;
import models.Bungalow;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BungalowTest {

    Bungalow bungalow;

    @BeforeEach
    public void setUp(){
         bungalow = new Bungalow(5, LocalDate.of(1993,01,14), false);
    }

    @Test
    public void canCountRooms(){
        assertThat(bungalow.numberOfRooms).isEqualTo(5);
    }

    @Test
    public void canRent(){
        String result = bungalow.rent("BNTA Bungalow");
        assertThat(result).isEqualTo("Building rented successfully!");
    }


}
