import java.io.*;

public class Exception {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your name: ");
            String name = br.readLine();  
            System.out.println("Hello, " + name);
        } catch (IOException e) {
            System.out.println("Error! Input not working.");
        }
    }
}
