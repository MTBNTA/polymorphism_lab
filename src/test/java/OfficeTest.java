import models.Office;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OfficeTest {

    Office office;

    @BeforeEach
    public void setUp(){
        office = new Office(6, LocalDate.of(1987,10,17), "BNTA");
    }

    @Test
    public void canHireEmployee(){
        assertThat(office.hireEmployee(LocalDate.of(2024,07,01))).isEqualTo("Congratulations, you're hired! You start on 2024-07-01");
    }

    @Test
    public void canHireEmployeeOverloaded(){
        assertThat(office.hireEmployee(true, LocalDate.of(2024, 05, 17))).isEqualTo("Interview status: true. Your interview date is 2024-05-17");
    }


}
