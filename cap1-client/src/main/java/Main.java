import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://localhost:8080/cervejaria/clientes");
        InputStream inputStream = url.openConnection().getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }

}
