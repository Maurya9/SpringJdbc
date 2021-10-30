package com.SpringJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.dao.StudentDao;
import com.spring.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext con=new AnnotationConfigApplicationContext(JavaConfig.class);
       StudentDao student=con.getBean("studentDao",StudentDao.class);
       
		/*
		 * Student stu=new Student(); stu.setId(103); stu.setName("faizan");
		 * stu.setCity("kalyan");
		 * 
		 * int result= student.insert(stu);
		 * 
		 * System.out.println(result);
		 */
       
		/*
		 * Student st=new Student(); st.setId(102); st.setName("umar");
		 * st.setCity("tilak nagar");
		 * 
		 * int ss= student.change(st);
		 * 
		 * System.out.println(ss);
		 */
       
     
       
		/*
		 * int result=student.delete(101); System.out.println(result);
		 */
		/*
		 * Student result=student.getStudent(101); System.out.println(result);
		 */
       
       List<Student>ss=student.getAllStudent();
       for(Student s:ss) {
    	   System.out.println(s);
       }
       
     
        
    }
    
}
