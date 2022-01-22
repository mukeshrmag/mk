package sample.StudentDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import sample.StudentDemo.Service.StudentImplDAO;
import sample.StudentDemo.entites.StudentDemoModel;

public class StudentImplDAOTest {
	@Test
	public void test() {
		StudentImplDAO studenttest = new StudentImplDAO();
		StudentDemoModel test1=new StudentDemoModel();
		test1.setId(62071);
		test1.setAge(21);
		test1.setName("mukesh");
		test1.setCourse("java");
		test1.setPassword(6207121);
		String status=studenttest.ModelTest(test1);
		assertEquals("success",status);		
	}

}
