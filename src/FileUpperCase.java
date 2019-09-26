import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileUpperCase {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/home/cgi/file-test");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String fileRead = bufferedReader.readLine();
        String upperCaseString = fileRead.toUpperCase();
        System.out.println(upperCaseString);
    }
}
