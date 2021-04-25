package com.gaju.db;
import java.util.*;

import com.gaju.models.Batch;
import com.gaju.models.Course;
import com.gaju.models.Faculty;
import com.gaju.models.Student;

public class OperationInterfaceimpl implements OperationInterfaceI {
	
	Scanner sc = new Scanner(System.in);
	List<Course> curl = new ArrayList<Course>();
	List<Faculty>facl = new ArrayList<Faculty>();
	List<Batch>bacl = new ArrayList<Batch>();
	List<Student>stul = new ArrayList<Student>();
	
	@Override
	public void addCourse() 
	{
		System.out.println("Enter the Number Of Course You want Add:");
		int crsize =sc.nextInt();
		for (int i = 0; i < crsize; i++) {
			Course c=new Course();
			System.out.println("Enter the Course Id");
			c.setCid(sc.nextInt());
			System.out.println("Enter the Course Name");
			c.setCname(sc.next());
			curl.add(c);
		}	
	}

	@Override
	public void viewCourse() 
	{
		System.out.println("********Course Details**********");
		System.out.println();
		System.out.println("Course Id"+"   "+"Course Name");
		for(Course crs:curl) {
			System.out.println(" "+crs.getCid()+"		"+crs.getCname());
			
		}
		System.out.println();
		System.out.println("************************************");
		
	}

	@Override
	public void addFaculty() {
		System.out.println("Enter How much Faculty You Want ?");
		int facsize = sc.nextInt();
		
		for (int i = 0; i < facsize; i++) {
			Faculty f=new Faculty();
			System.out.println("Enter the Faculty Id");
			f.setFid(sc.nextInt());
			System.out.println("Enter the Faculty Name");
			f.setFname(sc.next());
			viewCourse();
			System.out.println("Assign course ID  to Faculty");
			int cid=sc.nextInt();
			Iterator<Course> crItr = curl.iterator();
			while(crItr.hasNext())
			{
				Course c =crItr.next();
				if(cid==c.getCid())
				{
					f.setCrs(c);
					System.out.println("Course Assign To Facullty Succefully");
				}
			}
			facl.add(f);
		}	
	}

	@Override
	public void viewFaculty() 
	{
		System.out.println("**********************Faculty details****************************");
		System.out.println();
		System.out.println(" Faculty ID " + "  "+"  Faculty Name  " + "  "+"   Course ID   " +"	   "+ "  Course Name  ");
		for(Faculty fac: facl)
		{
			System.out.println("  "+fac.getFid()+"		    "+fac.getFname()+"		"+fac.getCrs().getCid()+"		"+fac.getCrs().getCname());
		}
		
		System.out.println();
		System.out.println("*******************************************************************");
	}
	
	
	@Override
	public void addBatch() {
//		Batch b=new Batch();
		
		System.out.println("Enter How Much Batch You Want To Add");
		int basize = sc.nextInt();
		for (int i = 0; i < basize; i++) {
			Batch b=new Batch();
			System.out.println("Enter the Batch Id");
			b.setBid(sc.nextInt());
			System.out.println("Enter Batch Name");
			b.setBname(sc.next());
			viewFaculty();
			System.out.println("Assign Faculty Id To Batch");
			int fid= sc.nextInt();
			
			for (Faculty ftr : facl) {
				
				if(fid == ftr.getFid())
				{
					b.setFac(ftr);
					System.out.println("Faculty assign Successfully");
				}
				
			}
			bacl.add(b);
		}
	}

	@Override
	public void viewbatch() {
		System.out.println("*********************************Batch Betails************************************");
		System.out.println();
		System.out.println(" Batch ID "+" "+" Batch Name "+"    "+" Faculty ID "+"  "+" Faculty Name "+"  "+" Course ID "+"  "+"Course Name");
		for(Batch batl:bacl)
		{   
			System.out.println("  "+batl.getBid()+"           "+batl.getBname()+"           "+batl.getFac().getFid()+"          "+batl.getFac().getFname()+"          "+batl.getFac().getCrs().getCid()+"           "+batl.getFac().getCrs().getCname());
			
		}
		System.out.println();
		System.out.println("***********************************************************************************");
	}

	@Override
	public void addStudent() {

		System.out.println("Add Number of Student to Given Batch");
		int stsize=sc.nextInt();
		for (int i = 0; i < stsize; i++) {
			Student s = new Student();
			System.out.println("Enter the Student Id");
			s.setSid(sc.nextInt());
			System.out.println("Enter Student Name");
			s.setSname(sc.next());
			viewbatch();
			System.out.println("Assign Batch To Student");
			int bid= sc.nextInt();
			
			
			Iterator<Batch> btr = bacl.iterator();
			while(btr.hasNext())
			{
				
					Batch bb = btr.next();
					if(bid == bb.getBid())
					{
						s.setBach(bb);
						System.out.println(" Assign Student to Faculty Succefully");
					}
			}
			stul.add(s);
		}
		
		
	}

	@Override
	public void viewStudent() {
		System.out.println("***********************************************************************************Student Details****************************************************************************");
		System.out.println();
		System.out.println("Student ID "+"     "+"Student Name"+"      "+"Batch ID"+"      "+"Batch Name"+"     "+"Faculty ID "+"  "+"Faculty Name "+"  "+"Course ID"+"   "+"Course Name");
		for(Student stu : stul)
		{
			System.out.println("    "+stu.getSid()+"             "+stu.getSname()+"            "+stu.getBach().getBid()+"           "+stu.getBach().getBname()+"               "+stu.getBach().getFac().getFid()+"             "+stu.getBach().getFac().getFname()+"           "+stu.getBach().getFac().getCrs().getCid()+"            "+stu.getBach().getFac().getCrs().getCname());
		}
		System.out.println();
		System.out.println("********************************************************************************************************************************************************************************");
	}

}
