import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    FileWriter fr;
    public Writer(FileWriter fr) {
        this.fr=fr;
    }

    public void write(File file, String message) {
        try {
            fr.write(message);
            fr.flush();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("message " + message + " added to file " + file.getName());

    }

}
