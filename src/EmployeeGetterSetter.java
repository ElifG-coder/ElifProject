
public class EmployeeGetterSetter {
	private String name;
	private int age;
	private double salary;
	//define public methods to give an access to private variables
	//getters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	//setters
	public void setName(String name) {
		if(!name.isEmpty()&&name.length()>3)
			this.name=name;
	}
	public void setAge() {
		this.age=age;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
}
