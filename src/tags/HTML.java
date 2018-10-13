package tags;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class HTML extends Tag {

    public HTML(Scanner fin, BufferedWriter fout){
        this.fout = fout;
        this.fin = fin;
    }

    private void generateHead() throws IOException {
        Head head = new Head(fout);
        head.print();
    }
    private void generateBody() throws IOException {
        Body body = new Body(fin, fout);
        body.print();
    }
    @Override
    public void print() throws IOException {
        this.open();
        this.generateHead();
        this.generateBody();
        this.close();
    }
    @Override
    public void open() throws IOException {
        fout.write("<html>\n");
    }
    @Override
    public void close() throws IOException {
        fout.write("</html>");
    }
}
