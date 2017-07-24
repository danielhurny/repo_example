package server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import server.dao.EmployeeRepository;
import server.entity.Company;
import server.entity.Employee;

public class ConsoleUI {

	@Autowired
	EmployeeRepository employeeDAO;
	
	Scanner scanner = new Scanner(System.in);

	public void run() {
		
	
	employeeDAO.save(new Employee("Abraham", "1234", "nesss", "Kosice", new Date(), Colour.GREEN, 12));
		
//		StringBuilder sb = new StringBuilder("What would you like to do?\n");
//		sb.append("to show all employees - A\n");
//		sb.append("to show employee based on ID - I\n");
//		sb.append("to delete employee based on ID - D\n");
//		sb.append("to create employee - S\n");
//		sb.append("to quit - Q\n");
//		System.out.println(sb);
//
//		String userInput = scanner.nextLine().toUpperCase();
//
//		switch (userInput) {
//		case "A":
//			for (Employee e : employeeDAO.findAll()) {
//				System.out.println(e.toString());
//			}
//			break;
//		case "I":
//			System.out.println("Enter ID:");
//			int userID = scanner.nextInt();
//			System.out.println(employeeDAO.findOne(userID));
//			break;
//
//		case "D":
//			System.out.println("Enter ID:");
//			userID = scanner.nextInt();
//			employeeDAO.deleteById(userID);
//			break;
//
//		case "S":
//			System.out.println("Enter Name:");
//			String userName = scanner.nextLine();
//
//			System.out.println("Enter Password:");
//			String userPasswd = scanner.nextLine();
//
//			System.out.println("Enter Comment:");
//			String userComment = scanner.nextLine();
//
//			System.out.println("Enter Adress:");
//			String userAddress = scanner.nextLine();
//
//			employeeDAO.save(new Employee(userName, userPasswd, userComment, userAddress));
//			break;
//
//		case "Q":
//			System.exit(0);
//
//		default:
//			System.out.println("You have chosen wrong option please try again ");
//		}

	}

}
