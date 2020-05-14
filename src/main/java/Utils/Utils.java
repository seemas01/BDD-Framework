package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {
    public static String generateAccessToken(String userID) throws IOException {
        Process p = Runtime.getRuntime().exec("java -jar token.jar "+userID);
        BufferedReader b = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String token = b.readLine();
        System.out.println("Access Token : "+token);
        return token;
    }
}
