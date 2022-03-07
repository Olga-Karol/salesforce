package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileOutputStream;

public class FileUtils {

    public static File bytesToFile(String fileName, byte[] bytes) {
        File file = new File(fileName);
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write(bytes);
        } catch (Exception e) {
            System.out.println(" ERROR during saving file " + e.getMessage());
        }
        return file;
    }
}
