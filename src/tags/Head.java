package tags;

import java.io.BufferedWriter;
import java.io.IOException;

public class Head extends Tag{

    Head(BufferedWriter fout){
        this.fout = fout;
    }

    @Override
    public void print() throws IOException {
        this.open();
        fout.write("\t\t<title>HTMLConverter</title>\n");
        this.close();
    }
    @Override
    public void open() throws IOException {
        fout.write("\t<head>\n");
    }
    @Override
    public void close() throws IOException {
        fout.write("\t</head>\n");
    }
}
