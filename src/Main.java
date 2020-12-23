import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        File file = new File("midas.txt");
        Writer writer = null;
        try {
            FileWriter fr = new FileWriter("midas.txt");
            writer = new Writer(fr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        WriterThread T1 = new WriterThread(file,"1",writer);
        WriterThread T2 = new WriterThread(file,"2",writer);
        WriterThread T3 = new WriterThread(file,"3",writer);
        WriterThread T4 = new WriterThread(file,"4",writer);
        WriterThread T5 = new WriterThread(file,"5",writer);
        WriterThread T6 = new WriterThread(file,"6",writer);
        WriterThread T7 = new WriterThread(file,"7",writer);
        WriterThread T8 = new WriterThread(file,"8",writer);
        WriterThread T9 = new WriterThread(file,"9",writer);
        try {
            T1.start();
            T1.join();
            T2.start();
            T2.join();
            T3.start();
            T3.join();
            T4.start();
            T4.join();
            T5.start();
            T5.join();
            T6.start();
            T6.join();
            T7.start();
            T7.join();
            T8.start();
            T8.join();
            T9.start();
            T9.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
