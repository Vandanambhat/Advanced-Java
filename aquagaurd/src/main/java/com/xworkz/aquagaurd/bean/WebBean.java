package com.xworkz.aquagaurd.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class WebBean {

	public WebBean() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@RequestMapping("click.do")
	public String onClick(@RequestParam String nm,@RequestParam String email,@RequestParam long mobile,@RequestParam int age) {
		System.out.println("Invoked onClick method");
		System.out.println(nm);
		System.out.println(email);
		System.out.println(mobile);
		System.out.println(age);
		return "/Welcome.html";
		
	}
	
	@RequestMapping("govt.do")
	public String onGovt(@RequestParam String stateName,@RequestParam String partyName,@RequestParam String cmName,@RequestParam String governorName,@RequestParam String deputyCMName) {
		System.out.println("Invoked onGovernment method");
		System.out.println(stateName);
		System.out.println(partyName);
		System.out.println(cmName);
		System.out.println(governorName);
		System.out.println(deputyCMName);
		return "/Government.html";
	}
}
