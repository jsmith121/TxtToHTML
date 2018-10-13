import java.io.BufferedWriter;
import java.io.IOException;

public class Head extends Tag{

    public Head(BufferedWriter fout){
        this.fout = fout;
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
