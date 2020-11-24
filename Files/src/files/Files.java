package files;
import java.io.*;
public class Files {
    public static void main(String[] args) {
        File f1 = new File("D:\\Commands Linux.rtf");
        File f2  = new File("D:\\Commands.rtf");
        File f3 = new File("D:\\Hello World.txt");
        System.out.println(f1.canRead());
        System.out.println(f1.compareTo(f2));
        System.out.println(f3.canRead());
        System.out.println(f3.length());
        
        
        
    }
    
}