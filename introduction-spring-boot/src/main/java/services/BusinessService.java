package services;

import org.springframework.stereotype.Service;

@Service
public class BusinessService {
	
	public String getGreetings() {
		
		return "Greetings from the service: BusinessService";
	}
	
}
