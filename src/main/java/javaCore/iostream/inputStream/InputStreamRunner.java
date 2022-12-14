package javaCore.iostream.inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {
    public static void main(String[] args) throws IOException {
//        File file = new File(String.join(File.separator, "src", "Main", "resources", "test.txt"));
        File file = Path.of("src", "Main", "resources", "test.txt").toFile();
        try (FileInputStream inputStream = new FileInputStream(file)) {
//            byte[] bytes = inputStream.readAllBytes();
//            String stringValue = new String(bytes);
//            System.out.println(stringValue);
            byte[] bytes = new byte[inputStream.available()];
            int count = 0;
            byte currentByte;
            while ((currentByte = (byte) inputStream.read()) != -1) {
                bytes[count++] = currentByte;
            }
            String stringValue = new String(bytes);
            System.out.println(stringValue);
        }
    }
}
