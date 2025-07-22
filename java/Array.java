public class Array {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3,4 };
            System.out.println(arr[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
    }
}
