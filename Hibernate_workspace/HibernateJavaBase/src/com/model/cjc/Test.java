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


@SuppressWarnings("unused")
public class Test {
	
	public static void main(String[] args) {
		
		Session sess = HibernateUtil.getSessionFactory().openSession();
//		Student stu = sess.load(Student.class, 111);
		
		Student stu = sess.get(Student.class, 111);
		
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddr());
		
	}

}



//public class Test{
//	
//	
//	public  static void main(String [] arg)
//	{
//		
//		
//		Map<String, Object> m = new HashMap();
//		m.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
//		m.put(Environment.URL, "jdbc:mysql://localhost:3306/test123");
//		m.put(Environment.USER, "root");
//		m.put(Environment.PASS, "root");
//		m.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
//		m.put(Environment.HBM2DDL_AUTO, "update");
//		m.put(Environment.SHOW_SQL, "true");
//		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(m).build();
//		MetadataSources mds = new MetadataSources(registry);
//		mds.addAnnotatedClass(Student.class);
//		Metadata md = mds.getMetadataBuilder().build();
//		SessionFactory sessf = md.getSessionFactoryBuilder().build();
//		Session sess = sessf.openSession();
//		Student stu = sess.load(Student.class, 111);
//		System.out.println(stu.getRollno());
//		System.out.println(stu.getName());
//		System.out.println(stu.getAddr());
//		
//	}
//}