package tags;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Body extends Tag {

    Body(Scanner fin, BufferedWriter fout){
        this.fout = fout;
        this.fin = fin;
    }
    public void print() throws IOException {
        open();
        while(fin.hasNextLine())
        {
            String s = fin.nextLine();
            if(!(s.equals(""))) {
                Paragraph paragraph = new Paragraph(s, fout);
                paragraph.print();
            }
        }
        close();
    }

    @Override
    public void open() throws IOException {
        fout.write("\t<body>\n");
    }
    @Override
    public void close() throws IOException {
        fout.write("\t</body>\n");
    }
}
