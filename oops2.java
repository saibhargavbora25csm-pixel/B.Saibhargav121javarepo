class Animal 
{ 
    int legs_count = 4; 
    int tail_count = 1; 
    void bark()
    { 
        System.out.print("bow-bow"); 
    } 
    void run()
    { 
        System.out.print("fast"); 
    } 
public static void main(String[] args)
    {
        Animal dog = new Animal();
        dog.bark();
        System.out.print(" and runs ");
        dog.run();
    }
}