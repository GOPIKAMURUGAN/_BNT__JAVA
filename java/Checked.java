// public class Checked {
//     public static void main(String[] args) {
//         try {
//             System.out.println("Hi");
//             Thread.sleep(5000); 
//             System.out.println("Hello");
//         } catch (InterruptedException e) {
//             System.out.println("Interuppted");
//         }
//     }
// }


public class Checked {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
            System.out.println("Hi");
            Thread.sleep(5000); 
            System.out.println("Hello");
        } catch (InterruptedException e) {
            System.out.println("Interuppted");
        }
        });
        t.start();
        
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
           
        }

        t.interrupt();
    }
}
