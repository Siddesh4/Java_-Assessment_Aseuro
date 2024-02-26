package task5;

public class DayPay {
	/*
	 * 1. Name: calculateSalary Arguments: Employee ReturnType: double Access
	 * Specifiers: static private Note: This method should calculate the salary
	 * based on employee working hours and perform any of the below 1. return base
	 * pay for every hour employee work. 2. reurn base pay and half for every hour
	 * over 40 hours per week. 3. return -1 if working hours is negative or more
	 * than 40 hours. 4. return 0 if the employee wage is less than $8.0.
	 */

	private static double calculateSalary(Employee e) {
		double hoursWorked = e.hoursWorked;
		double basePay = e.basePayHours;

		if (hoursWorked > 0 && basePay >= 8.0) {
			return (hoursWorked > 40) ? ((hoursWorked - 40) * (basePay / 2)) + (40 * basePay) : (hoursWorked * basePay);
		}
		return -1;

	}

	public static String displayEmployeeDetails(Employee e) {
		/*
		 * If employee wage is less than $8.0 or working hours is negative or more than
		 * 60 hours in a week return "Employee cannot exist with given information".
		 */
		if(e.basePayHours<8.0 || e.hoursWorked<0 || e.hoursWorked>60) {
			return "Employee cannot exist with given information";
		}
		String output = "Employee [Name: " + e.name + ", id: " + e.id + ", Base Pay: " + e.basePayHours
				+ ", No. of hours worked: " + e.hoursWorked + ", Payed: " + (calculateSalary(e)) + "]";
		return output;
	}
}
