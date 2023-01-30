package com.BikkadIT.DI.BeanScope.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("Singleton") //by default scope is singleton
@Scope("prototype")

//Singleton : if we take scope as singleton then it will take a ready made object. We can use that object when we required.
 // 			Constructor called before before use of object.
//Prototype : if we take the scope as prototype then it object will be created only when we use it.
//				Constructor call just before calling object.

public class Student {

	public Student() {
		super();
		System.out.println("Student Class Constructor");
	}

}
