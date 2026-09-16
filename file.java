import java.io.File;

class Main 
{
    public static void main(String[] args) 
	{

        File f = new File("output.txt");

        System.out.println(f.exists());
        System.out.println(f.getName());
        System.out.println(f.length());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());

        File folder = new File("myFolder");
        folder.mkdir();

        File dir = new File(".");

        String[] files = dir.list();

        for (String name : files)
            System.out.println(name);
    }
}