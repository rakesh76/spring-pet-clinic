package sanghvi.springframework.springpetclinic;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = SpringPetClinicApplicationTests.class)
public class SpringPetClinicApplicationTests {

    @Test
    public void contextLoads() {
    }

}

