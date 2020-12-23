import java.io.File;

public class WriterThread extends Thread {
    private final File file;
    private final String message;
    private final Writer writer;

    public WriterThread(File file, String message, Writer writer) {
        this.file = file;
        this.message = message;
        this.writer = writer;

    }

    @Override
    public void run() {
        synchronized (writer) {
            writer.write(this.file, this.message);
        }
    }
}
