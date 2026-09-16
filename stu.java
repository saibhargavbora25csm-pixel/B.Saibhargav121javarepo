package in.anits.cse;

public class Stu 
{
    private int rollNo;
    private String name;

    public Stu(int r, String n) {
        rollNo = r;
        name = n;
    }

    public void show() {
        System.out.println("Roll: " + rollNo + " | Name: " + name);
    }
}
import java.util.Scanner;
import java.util.ArrayList;
import in.anits.cse.Stu;

public class Main 
{
    public static void main(String[] args) {
        Stu s = new Stu(101, "Arjun");
        s.show();
    }
}