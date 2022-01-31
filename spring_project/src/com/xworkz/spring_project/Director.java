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
		String refOfXmlFilePathLaptop = "resources/spring.xml";
		String refOfXmlFilePathDoctor = "resources/spring.xml";
		String refOfXmlFilePathCorona = "resources/spring.xml";
		String refOfXmlFilePathMinister = "resources/spring.xml";
		String refString="resources/spring.xml";

		ApplicationContext springRef = new ClassPathXmlApplicationContext(refOfXmlFilePath);
		System.out.println("------------------------");
		ApplicationContext springRefLaptop = new ClassPathXmlApplicationContext(refOfXmlFilePathLaptop);
		System.out.println("------------------------");
		ApplicationContext springRefDoctor = new ClassPathXmlApplicationContext(refOfXmlFilePathDoctor);
		System.out.println("------------------------");
		ApplicationContext springRefCorona = new ClassPathXmlApplicationContext(refOfXmlFilePathCorona);
		System.out.println("------------------------");
		ApplicationContext springRefMinister = new ClassPathXmlApplicationContext(refOfXmlFilePathMinister);
		System.out.println("------------------------");
		ApplicationContext springString= new ClassPathXmlApplicationContext(refString);
		System.out.println("------------------------");
		
		AnimeCharacter ani = springRef.getBean(AnimeCharacter.class);
		Laptop lap = springRefLaptop.getBean(Laptop.class);
		Doctor doc = springRefDoctor.getBean(Doctor.class);
		Corona corona=springRefCorona.getBean(Corona.class);
		Minister minister=springRefMinister.getBean(Minister.class);
		String string=springString.getBean(String.class);
		
		ani.play();
		lap.play();
		doc.play();
		corona.play();
		minister.play();
		string.toUpperCase();
		
	}

}
