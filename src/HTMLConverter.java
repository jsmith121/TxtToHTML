import tags.HTML;

import java.io.*;
import java.util.Scanner;

public class HTMLConverter {

    private String fileOutPath;
    private String fileInPath;
    private BufferedWriter fout;
    private Scanner fin;
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
    void convert() throws IOException {
        init();
        HTML html = new HTML(fin, fout);
        html.print();
    }

    void quit() throws IOException {
        fout.close();
    }
}
