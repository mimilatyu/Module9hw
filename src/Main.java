import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/someText.txt");
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();

        FileOutputStream fos = new FileOutputStream("someText2.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        fos.write(reader.readLine().getBytes(StandardCharsets.UTF_8));





    }
}
