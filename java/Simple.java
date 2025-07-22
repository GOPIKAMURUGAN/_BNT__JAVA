import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Simple {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(new File("data.txt"))){
            System.out.println("File Opened");
        }
            
        catch(FileNotFoundException e) {
            System.out.println("Not Found");
        }
    }
    
}
