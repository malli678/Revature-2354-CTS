package com.reflection.demo;

import java.lang.Class;
import java.lang.reflect.*;

public class ClassReflectionDemo {

	public static void main(String[] args) {
		try {
			Dog d1 = new Dog();
			Class obj = d1.getClass();
			String name = obj.getName();
			System.out.println("Name: " + name);
			int modifier = obj.getModifiers();
			// convert the access modifier to string
		      String mod = Modifier.toString(modifier);
		      System.out.println("Modifier: " + mod);

		      // get the superclass of Dog
		      Class superClass = obj.getSuperclass();
		      System.out.println("Superclass: " + superClass.getName());
		}
		catch (Exception e) {
		      e.printStackTrace();
		    }

	}

}
