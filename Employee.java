package task5;


public class Employee {
	public int id;
	public String name;
	public double hoursWorked;
	public double basePayHours;
	
    public Employee(int id, String name, double hoursWorked, double basePay) {
    	this.id = id;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.basePayHours = basePay;;
    }
    public Employee() {
    	
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getBasePayHours() {
        return basePayHours;
    }

    public void setBasePayHours(double basePayHours) {
        this.basePayHours = basePayHours;
    }
    
}