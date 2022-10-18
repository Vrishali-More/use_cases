package CRUD.example.CRUD;

import org.junit.jupiter.api.Test;
import java.util.List;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest

class EmployeeServiceTest {
	    @Autowired
	    private EmployeeService esp;

	    @Test
	    public void contextLoads() {
	        List<EmployeeEntity> employee = esp.getSample();

	        Assert.assertEquals(employee.size(), 9);
	    }
}
