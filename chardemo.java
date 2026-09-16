import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("notes.txt");
        fw.write("Java I/O is simple!");
        fw.write("Character streams handle Unicode.");
        fw.close();
        FileReader fr = new FileReader("notes.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
    }
}