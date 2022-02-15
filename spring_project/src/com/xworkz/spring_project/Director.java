package com.xworkz.spring_project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.animation.AnimeCharacter;
import com.xworkz.animation.Corona;
import com.xworkz.animation.Doctor;
import com.xworkz.animation.Laptop;
import com.xworkz.animation.Minister;

public class Director {

	public static void main(String[] args) {

		String refOfXmlFilePath = "resources/spring.xml";

		ApplicationContext springRef = new ClassPathXmlApplicationContext(refOfXmlFilePath);
		System.out.println("------------------------");
		
		AnimeCharacter ani = springRef.getBean(AnimeCharacter.class);
		
		
		
		
//		Laptop lap = springRef.getBean(Laptop.class);
//		Doctor doc = springRef.getBean(Doctor.class);
//		Corona corona=springRef.getBean(Corona.class);
//		Minister minister=springRef.getBean(Minister.class);
//		String string=springRef.getBean(String.class);
		
		ani.play();
		
	}

}
