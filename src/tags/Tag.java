package tags;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Tag {

    ArrayList<String> styles;
    BufferedWriter fout;
    Scanner fin;

    public abstract void print() throws IOException;
    public abstract void open() throws IOException;
    public abstract void close() throws IOException;



}
