class Employee 
{
    int    empId;
    String name;
    double salary;
    Employee(int id, String n, double sal)
	{
        empId  = id;
        name   = n;
        salary = sal;
    }
    void display() 
	{
        System.out.printf("ID: %d \nName: %s\nSalary: %.2f%n", empId, name, salary);
    }
    static void companyName()
	{
        System.out.println("ANITS Engineering College");
    }
}
class Test 
{
    public static void main(String[] args) {
        Employee e1 = new Employee(120, "Bhargavi", 100000);
		Employee e2 = new Employee(121, "Bhargav", 200000);
		e1.companyName();
        e1.display();
		e2.display();
    }
}