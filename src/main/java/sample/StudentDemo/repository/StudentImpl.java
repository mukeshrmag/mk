package sample.StudentDemo.repository;

import sample.StudentDemo.entites.StudentDemoModel;

public interface StudentImpl {
	StudentDemoModel  getStudentById(int Id);
	StudentDemoModel getUserLogin(int id ,int password1);
	StudentDemoModel Checkmethod(int id ,int age,String name);
	StudentDemoModel  transferdata(int v1,int pass);
	String ModelTest(StudentDemoModel m1);
	
}
