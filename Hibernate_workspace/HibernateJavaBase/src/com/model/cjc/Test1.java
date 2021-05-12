package com.model.cjc;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class Test1 {
	
	
	public  static void main(String [] arg)
	{
		
		
		Map<String, Object> m = new HashMap();
		m.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		m.put(Environment.URL, "jdbc:mysql://localhost:3306/test123");
		m.put(Environment.USER, "root");
		m.put(Environment.PASS, "root");
		m.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		m.put(Environment.HBM2DDL_AUTO, "update");
		m.put(Environment.SHOW_SQL, "true");
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(m).build();
		MetadataSources mds = new MetadataSources(registry);
		mds.addAnnotatedClass(Student.class);
		Metadata md = mds.getMetadataBuilder().build();
		SessionFactory sessf = md.getSessionFactoryBuilder().build();
		Session sess = sessf.openSession();
//		Student stu = new Student();
//		stu.setRollno(112);
//		stu.setName("Mayuri");
//		stu.setAddr("Lokmanya");
//		sess.save(stu);
//		sess.beginTransaction().commit();
		
//		Student stu = sess.delete(Student.class,112);
		
//		Student stu = sess.load(Student.class, 112);
//		System.out.println(stu.getRollno());
//		System.out.println(stu.getName());
//		System.out.println(stu.getAddr());
		
	}


}
