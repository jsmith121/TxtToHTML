package tags;

import java.io.BufferedWriter;
import java.io.IOException;

public class Paragraph extends Tag {

    private String content;
    Paragraph(String content, BufferedWriter fout){
        this.content = content;
        this.fout = fout;
    }
    @Override
    public void print() throws IOException {
        this.open();
        fout.write("\t\t\t" + content + "\n");
        this.close();
    }
    @Override
    public void open() throws IOException {
        fout.write("\t\t<p>\n");
    }
    @Override
    public void close() throws IOException {
        fout.write("\t\t</p>\n");
    }
}
