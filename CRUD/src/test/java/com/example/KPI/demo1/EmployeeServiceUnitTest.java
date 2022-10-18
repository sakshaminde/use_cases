package com.example.KPI.demo1;
import org.junit.Assert;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceUnitTest {
	
	 @Autowired
	    private EmployeeService empService;
	 
	@Test
	    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
	        List<EmployeeEntity> emp = empService.getSample();

	        Assert.assertEquals(emp.size(), 5);
	      // Assert.assertEquals(emp.toString(),"Mahesh");
	 }

}
