public class arthimetic{
    public static void main(String[] args){
        int a = 10;
        // int b= 0;
        int b = 2;

        try{
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }

        System.out.println("Program continues");
    }
}