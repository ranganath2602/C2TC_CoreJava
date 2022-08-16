package com.cg.objectinstantiation;

class Employee {
	String ename;
	int age; 
	double salary;
	
	public Employee(String ename, int age, double salary) {
		super();
		this.ename = ename;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
}

public class ObjectDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee("Kiran",31,43000.00);
		Employee e2 = new Employee("Hemal",29,43000.00);
		//Employee e2 = e1;
		Employee e3 = new Employee("Ashika",34,43000.00);

		//System.out.println(e1.equals(e2)); //check for same parameters
		//System.out.println(e1==e2); //check for hashcodes
		//System.out.println(e2.hashCode());
		//System.out.println(e3.hashCode());
		System.out.println(e1 + " " + e2 + " " + e3 );
	}

}
