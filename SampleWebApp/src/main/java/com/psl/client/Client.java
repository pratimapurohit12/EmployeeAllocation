package com.psl.client;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.psl.bean.Course;
import com.psl.bean.Employee;
import com.psl.bean.Project;
import com.psl.bean.Question;
import com.psl.bean.Training;

public class Client {

	public static void main(String[] args) {
		// To	DO Auto-generated method stub

		
	SessionFactory sessionfactory= HibernetUtil.getSessionfactory();
	Session session=sessionfactory.openSession();
		
		Transaction tx=session.beginTransaction();
		
//		Project p1=new Project();
//		p1.setProjectId(101);
//		p1.setProjectName("IBM");
//
//		p1.setEmpRequirement(10);
//		p1.setSkill("java");
//		p1.setStatus("not allocated");
//		
//		session.save(p1);
		
		
		/*Training training=new Training();
		training.setTrainingId(201);
		training.setTrainingName("Java");
		
		session.save(training);
	*/
	/*	Question question=new Question();
		session.save(question);
		*/
		
		/*Course course=new Course();
	
		session.save(course);*/
		
		
		Employee employee=new Employee();
		employee.setEmpId(101);
		session.save(employee);
		
		System.out.println("successfully table created");
		
		tx.commit();
		session.close();
		

		System.out.println("Helloo");
		
	}

}
