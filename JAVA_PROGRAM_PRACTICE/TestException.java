import java.io.FileNotFoundException;
import java.io.IOException;
public class TestException {
    public static void main(String[] args) {
        try {
            testException();
        } catch (FileNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
    public static void testException() throws IOException,FileNotFoundException {
        
    }
}
