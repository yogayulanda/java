import java.io.FileInputStream;

public class ThreadPool implements Runnable {
    private String message;

    public ThreadPool(String s) {
        this.message = s;
    }

    @Override
    public void run() {
        try {
            FileInputStream fin = new FileInputStream(message);
            int i = 0;
            System.out.print("Success: ");
            int j = 0;
            while ((i = fin.read()) != -1) {
                j += 1;
                if ((char) i != ',') {
                    if (j == 1) {
                        System.out.print(Thread.currentThread().getName() + " (Start) Number = " + (char) i);
                    } else {
                        System.out.print((char) i);
                    }
                } else {
                    j=0;
                    System.out.println(",");
                    processmessage();
                }
            }
            System.out.println(Thread.currentThread().getName() + " (End)");//prints thread name
            System.out.println("Finished all threads");
            Main mainTugas = new Main();
            mainTugas.showMenu();
            fin.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    private void processmessage() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
