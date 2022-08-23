//I am using intellij ide for code
public  class MultithreadingThraedClass {
    public static void main(String[] args) {
            int n = 5; // Number of threads
            for (int i = 0; i < n; i++) {
                MultithreadingDemo object
                        = new MultithreadingDemo();
                object.start();
            }

    }
}
class MultithreadingDemo extends Thread {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println("Hello All");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
