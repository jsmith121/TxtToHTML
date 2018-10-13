import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class HTMLConverter {

    String fileOutPath;
    String fileInPath;
    BufferedWriter fout;
    Scanner fin;
    public HTMLConverter(String fileInPath, String fileOutPath){
        this.fileOutPath = fileOutPath;
        this.fileInPath = fileInPath;
        try {
            this.fin = new Scanner(new File(fileInPath));
            fout = new BufferedWriter(new FileWriter(fileOutPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void init() throws IOException {
        fout.write("<!DOCTYPE html>\n");
    }
    public void convert() throws IOException {
        init();
        HTML html = new HTML(fin, fout);
        html.print();
    }

    public void quit() throws IOException {
        fout.close();
    }
}
