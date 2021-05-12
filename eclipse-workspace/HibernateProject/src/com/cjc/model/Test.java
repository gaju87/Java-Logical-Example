package com.cjc.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {

public static void main(String[] args) {
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		MetadataSources mds = new MetadataSources(registry);
		Metadata md = mds.getMetadataBuilder().build();
		SessionFactory sessionf = md.getSessionFactoryBuilder().build();
		
		Session sess = sessionf.openSession();
		
		Student Stu = new Student();
		Stu.setRollno(111);
		Stu.setName("Gajuu");
		Stu.setAddr("Mumbai");
		sess.save(Stu);
		sess.beginTransaction().commit();
	}
}
