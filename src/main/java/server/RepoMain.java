package server;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import server.converter.ColourToLowerCaseConverter;
import server.mapper.EmployeeMapper;
import server.service.EmployeeService;
import server.service.EmployeeServiceImpl;

@Configuration
@SpringBootApplication

public class RepoMain {
	
	public static void main(String[] args) {
		SpringApplication.run(RepoMain.class, args);
		
		

	}

//	public static void main(String[] args) {
//		SpringApplication.run(RepoMain.class, args);
//		
//		
//	}
//	
// @Bean
//public CommandLineRunner runner(ConsoleUI ui){
// return args ->ui.run();
// }
// 
// @Bean 
// public ConsoleUI consoleUI(){
//	 return new ConsoleUI();
// }
 
 @Bean 
 public EmployeeService employeeService(){
	 return new EmployeeServiceImpl();
 }
 

 @Bean 
 public ColourToLowerCaseConverter converter(){
	 return new ColourToLowerCaseConverter();
 }
 
 

}
