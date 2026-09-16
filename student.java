class Student 
{
    int rollNo;
    String name;
    double marks;
    void display() 
	{
        System.out.println("Roll: " + rollNo + " Name: " + name);
    }
}
class Test 
{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 101;
        s1.name = "Arjun";
        s1.marks = 92.5;
        s1.display();
    }
}