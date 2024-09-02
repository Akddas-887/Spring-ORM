package com.springOrm.springOrm;

import com.springOrm.springOrm.dao.StudentDao;
import com.springOrm.springOrm.entities.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SpringOrmApplication {

	public static void main(String[] args) {
		/*SpringApplication.run(SpringOrmApplication.class, args);*/
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao=context.getBean("studentDao" , StudentDao.class);
		/*Student student=new Student(232,"Ankush","Indore");
		int r=studentDao.insert(student);
		System.out.println("Done"+r);*/

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean go=true;
		while(go){
			System.out.println("PRESS 1 FOR ADD:");
			System.out.println("PRESS 2 FOR GET ALL STUDENTS:");
			System.out.println("PRESS 3 FOR GET SINGLE STUDENT:");
			System.out.println("PRESS 4 FOR DELETE STUDENT:");
			System.out.println("PRESS 5 FOR UPDATE:");
			System.out.println("PRESS 6 FOR EXIT:");

			try{
				int input=Integer.parseInt(br.readLine());
				switch (input):
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					go=false;
					break ;
			}catch (Exception e){
				System.out.println("Invailid one");
				System.out.println(e.getMessage());
			}
			System.out.println("see u soon");
		}
	}

}
