package com.psl.client;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernetUtil {

	
	private static SessionFactory sessionFactory=null;
	
	public static SessionFactory  getSessionfactory(){
		
		
		if(sessionFactory==null){
			
			Configuration cfg=new Configuration();
			cfg.configure();
			sessionFactory=cfg.buildSessionFactory();
			
		}
		
		return sessionFactory;
		
	}
	
	
     
	
	
	
	
}
