package controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

import services.BusinessService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@Value("${introduction.spring.name}")
	private String name;
	
	@Autowired
	private BusinessService businessService;

    @RequestMapping(value = "/")

    public String index() {

    	//return "Project name: "+ this.name;

    	String answer = "Project name: "+ this.name;
    	answer += "<BR> "+businessService.getGreetings();
    	//answer += "\\u006E"+businessService.getGreetings();
    	
		return answer;        
    }
}