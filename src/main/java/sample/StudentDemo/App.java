package sample.StudentDemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sample.StudentDemo.Service.StudentImplDAO;
import sample.StudentDemo.entites.StudentDemoModel;

/**
 * Hello world!
 *
 */
public class App 
{

	public static void main( String[] args )
    {
		Scanner sc=new Scanner(System.in);
		App a =new App();
//    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dbInfo");
//       EntityManager em = emf.createEntityManager();
//       EntityTransaction et=em.getTransaction();
//        StudentDemoModel stu= em.find(StudentDemoModel.class,4);
//        et.begin();
//        System.out.println(stu);
//        et.commit();
		while (true) {
		System.out.println("Enter 1 or 2");
		System.out.println(" 1-go to student portal or 2-exit");
		System.out.println("3.forgetten password");
		int n =sc.nextInt();
		
		switch(n) {
		case 1 :{
				
		System.out.println("--------------------------");
		System.out.println("WELCOME TO STUDENT PORTAL");
		System.out.println("--------------------------");
		System.out.println("Enter your ID NO:");
		int id =sc.nextInt();
		int count =0;
		while (true) {
		System.out.println("Enter your password");
		int password =sc.nextInt();
		Captcha ct =new  Captcha();
		String input1=ct.getcaptcha();
		System.out.println(input1);
		System.out.println("Enter Captcha :");
		String input =sc.next();
				if(input1.equals(input))
		{
				StudentDemoModel StudentDemoModel1=new StudentDemoModel();
		StudentImplDAO StudentImplDAO1 =new StudentImplDAO ();
		try
		{			StudentDemoModel1=StudentImplDAO1.getUserLogin(id, password);
			int v1=StudentDemoModel1.getId();
			int v2=StudentDemoModel1.getPassword();
			  if((v1==id)&& (v2==password))
  		  {
  			  System.out.println("Welcome "+StudentDemoModel1.getName()+"!!");
  			  studentinfo(StudentDemoModel1);
  		  }
  		  else
  		  {
  			  System.out.println("Invalid credentials..Please check and login again!!");
  			  break;
  		  }
		  }
		  catch(Exception e)
		  {

			  System.out.println("Invalid credentials..Please check and login again!!");
			  break;
		  }
		}
		else {
			count++;
			System.out.println("your Captcha Is Invalid.. ");
			System.out.println("ONLY YOU HAVE 3 CHANCES OTHEWISE "
					+ "ITS EXIT AUTOMATICALLY  ");
			if(count==3) {
				System.exit(0);}}}
		break;
				}
		
		case 2 :{

			System.out.println(".....THANK YOU.....");
			System.out.println("...................");
			System.exit(0);
			break;
		}
		case 3:{
			
				Scanner jk =new Scanner (System.in);
				StudentDemoModel Modeljk=new StudentDemoModel();
				StudentImplDAO Model=new StudentImplDAO();
				System.out.println("Enter Your ID :");
				int q=jk.nextInt();
				System.out.println("Enter Your Age  :");
				int w=jk.nextInt();
				System.out.println("Enter Your name :");
				String r = jk.next();
				
				try
				{	Modeljk=Model.Checkmethod(q,w,r);
					int v1=Modeljk.getId();
					int v2=Modeljk.getAge();
					String v3=Modeljk.getName();
					  if((v1==q)&& (v2==w)&&(v3.equals(r)))
		  		  {
		  			  System.out.println("Welcome "+Modeljk.getName()+"!!");
		  			  System.out.println("Enter Your New Password:");
		  			 int  l= jk.nextInt();
		  		      Model.transferdata(v1,l);
		  			 System.out.println("Your Password Changed Successfuly....");
		  		  }
				
		  		  else
		  		  {
		  			  System.out.println("Invalid credentials..Please check and login again!!");
		  		  }}
				
				catch(Exception e)
					  {

						  System.out.println("Invalid credentials..Please check and login again!!");
					  }
				break;

				  		}
		default:
		{
			System.out.println("Enter correct number");
		  
		}
		}
		}}


	public static void studentinfo(StudentDemoModel studentDemoModel1) {
		while(true) {
		System.out.println("Enter Your option");
		System.out.println("1.STUDENT PROFILE");
		System.out.println("2.RESULT");
		System.out.println("YOU HAVE FACING ANY ISSUES GOTO OPTION 3");
		System.out.println("3.CHATBOT");
		System.out.println("4.exit");
		Scanner st=new Scanner(System.in);
		StudentImplDAO StudentImplDAO2 =new StudentImplDAO ();
		int m=st.nextInt();
		switch (m) {
		case 1:{
			System.out.println(studentDemoModel1);
			break;
		}
		case 2:{
			System.out.println(studentDemoModel1.getResult());
			break;
		}
		case 3:{
			getquerys();
		}
		case 4:{
			
			System.out.println(".....THANK YOU.....");
			System.out.println("...................");
			System.exit(0);
			break;
		}
		default:{
			System.out.println(" your  option is invalid plz check it  ");
			break;
		}
		}
		}
		
	}

	private static void getquerys() {
		System.out.println("Dear Student...");
		Scanner mk =new Scanner (System.in);
		while(true) {
			System.out.println("1.your result doesnt showing.. ");
			System.out.println("2.HTTP Error 304 ");
			System.out.println("3.HTTP Error 500 ");
			System.out.println("4.HTTP Error 403 ");
			System.out.println("5.OTHER querys");
			System.out.println("6.exit");
			System.out.println("1. ");
		System.out.println("Enter option:");
		int l =mk.nextInt();
		
		switch (l) {
		case 1:{
			System.out.println("---->Refresh Your Webpage By Pressing F5 Key");
			System.out.println("---->Clear Your Browser Cache");
			break;
		}
		case 2:{
			System.out.println("---->the website youre requesting hasnt been updated since the last time you accessed it");
			break;
		}
		case 3:{
			System.out.println("---->reload the web page...");
			System.out.println("---->Clear Your Browser Cache..");
			System.out.println("---->delete Your Browser Cookies..");
			System.out.println("---->contacting the website is another option....");
			System.out.println("---->Come back later...");
			break;
		}
		case 4:{
			System.out.println("---->HTTP 403 Forbidden responce status code indicates that TEH SERVER UNDERSTANDS TH EREQUEST BUT REFUSES TO AUTHORIZE IT");
			break;
		}
		case 5:{
			System.out.println("---->contact to our support team");
			System.out.println("---->contact num :6543987845");
			System.out.println("---->contact num : 044-250789");
			System.out.println("---->Email ID : supportteam1234@gmail.com");
			break;
		}
		case 6:{
			System.out.println(".....THANK YOU.....");
			System.out.println("...................");
			System.exit(0);
		}
		
		default:{
			System.out.println("your opton is invalid ");
			break;
		}
		}
		}
		
	}
	}	



