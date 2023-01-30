package com.BikkadIT.DI.BeanScope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.DI.BeanScope.model.Student;

@SpringBootApplication

public class BeanScopeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BeanScopeApplication.class, args);
		
		Student student = run.getBean(Student.class);
		System.out.println(student.hashCode());
		System.out.println("Scope is singleton : "+run.isSingleton("student"));
		System.out.println("Scope is prototype : "+run.isPrototype("student"));
		
		Student student2 = run.getBean(Student.class);
		System.out.println(student2.hashCode());
		System.out.println("Scope is singleton : "+run.isSingleton("student"));
		System.out.println("Scope is prototype : "+run.isPrototype("student"));
	}

}
