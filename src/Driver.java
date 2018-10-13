import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Driver {
    public static void main(String[] args)
    {
        HTMLConverter htmlConverter = new HTMLConverter("TxtToHTML.txt","HTMLOut.html");
        try {
            htmlConverter.convert();
            htmlConverter.quit();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
