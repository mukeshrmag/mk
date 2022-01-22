package sample.StudentDemo.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import sample.StudentDemo.entites.StudentDemoModel;
import sample.StudentDemo.repository.StudentImpl;

public class StudentImplDAO implements StudentImpl{
	public StudentDemoModel getStudentById(int id) {
		
		try
		{
			
		}
		catch(Exception e)
		{
			
		}
		
		return null;
	}

	public StudentDemoModel getUserLogin(int id, int password1) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbInfo");
		EntityManager em=emf.createEntityManager();
		StudentDemoModel Model =new StudentDemoModel();

		try
		{
			 Model=(StudentDemoModel)em.createQuery("from StudentDemoModel where id='"+id+"' and Password='"+password1+"'").getSingleResult();	
		
		if(Model!=null)
		{
			em.close();
			return Model;
		}
		else
		{
			em.close();
			
		}
		}
		catch(Exception e)
		{
			//e.printStackTrace();
		}
		
		return Model;
	}

	public StudentDemoModel Checkmethod(int id, int age, String name) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbInfo");
		EntityManager em=emf.createEntityManager();
		StudentDemoModel Model =new StudentDemoModel();

		try
		{
	 Model=(StudentDemoModel)em.createQuery("from StudentDemoModel where id='"+id+"' and age='"+age+"'and name='"+name+"'").getSingleResult();	
		
		if(Model!=null)
		{
			em.close();
			return Model;
		}
		else
		{
			em.close();
			
		}
		}
		catch(Exception e)
		{
			//e.printStackTrace();
		}
		
		return Model;
	}

	public StudentDemoModel transferdata(int v,int pass) {
		// TODO Auto-generated method stub
		try
    	{
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbInfo");//will create the entitymanager(connection with db)
			EntityManager e=emf.createEntityManager();//(accessing the entitymanager)or(accessing the connection created)
			StudentDemoModel dummy=e.find(StudentDemoModel.class, v);//JPQL
			EntityTransaction et=e.getTransaction();
			et.begin();
			dummy.setPassword(pass);
			et.commit();
			e.close();
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
        System.out.println("Update Completed");

		return null;
	}

	public String ModelTest(StudentDemoModel m1) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbInfo");
		EntityManager em=emf.createEntityManager();
		StudentDemoModel Model =new StudentDemoModel();

		try
		{
			 Model=(StudentDemoModel)em.createQuery("from StudentDemoModel where id='"+m1.getId()+"' and age='"+m1.getAge()+"'and name='"+m1.getName()+"'and course='"+m1.getCourse()+
					 "'and Password='"+m1.getPassword()+"'").getSingleResult();	
		
		if(Model!=null)
		{
			em.close();
			return "success";
		}
		else
		{
			em.close();
			
		}
		}
		catch(Exception e)
		{
			//e.printStackTrace();
		}
		
		return "null";
	}

	}

		
	




