package task5;

import java.util.Scanner;

public class EmployeesOverTimeApp {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Siddesh", 40, 8);
		System.out.println(DayPay.displayEmployeeDetails(e1));
		
		Scanner sc = new Scanner(System.in);
		Employee e2 = new Employee();
		
		System.out.println("Enter the Employee Id");
		e2.setId(sc.nextInt());
		
		System.out.println("Enter the Employee Name");
		e2.setName(sc.nextLine());
		sc.nextLine();
		
		System.out.println("Enter the Employee Base Salary");
		e2.setBasePayHours(sc.nextDouble());
		
		System.out.println("Enter the Employee\'S Hours of work");
		e2.setHoursWorked(sc.nextDouble());

		System.out.println(DayPay.displayEmployeeDetails(e2));
		
		sc.close();
		
	}
}