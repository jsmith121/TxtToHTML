import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public abstract class Tag {

    BufferedWriter fout;
    Scanner fin;
    public void print() throws IOException {
        this.open();

        this.close();
    }
    public abstract void open() throws IOException;
    public abstract void close() throws IOException;
}
