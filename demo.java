import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("data.bin");
        fos.write(65);  
        fos.write(new byte[]{72,101,108,108,111});
        fos.close();
        FileInputStream fis = new FileInputStream("data.bin");
        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }
        fis.close();
    }
}