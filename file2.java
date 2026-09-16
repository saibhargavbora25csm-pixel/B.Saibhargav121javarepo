import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class Main 
{
    public static void main(String[] args) 
	{
        try 
		{
            FileWriter fw = new FileWriter("log.txt", true);
            fw.write("New entry appended\n");
            fw.close();
            try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) 
			{
                String line;
                while ((line = br.readLine()) != null)
                    System.out.println(line);
            }
        } 
		catch (IOException e)
            System.out.println("Error: " + e.getMessage());
    }
}
