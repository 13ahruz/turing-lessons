package az.edu.turing.module1.lesson6;

import java.util.Base64;

public class SecretMessageApp {
    public static void main(String[] args) {
        String encodedString = "VHVyaW5nIExvdmVzIFlvdSE=";

        byte[] decodedBytes = Base64.getDecoder()
                .decode(encodedString);
        String message = new String(decodedBytes);

        System.out.println(message);

    }
}
