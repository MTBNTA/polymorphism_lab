import models.Building;
import models.Bungalow;
import models.LettingAgency;
import models.Office;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LettingAgencyTest {

    LettingAgency lettingAgency;
    Office office;
    Building building;

    @BeforeEach
    public void setUp(){
        lettingAgency = new LettingAgency();
    }

    @Test
    public void canAddBuilding(){
        Bungalow bungalow = new Bungalow(6, LocalDate.of(1986,04,17), true);
        lettingAgency.addBuilding(bungalow);
        assertThat(lettingAgency.countBuildings()).isEqualTo(1);
    }

    @Test
    public void canRentBuilding(){
        Office office = new Office(8, LocalDate.of(2013,01,01),"BNTA Offices");
        lettingAgency.rentBuilding(office, building);
        assertThat(office.canRent(building)).isEqualTo("We need office space!");
    }



}
