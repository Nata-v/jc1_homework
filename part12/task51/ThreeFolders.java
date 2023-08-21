package part12.task51;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreeFolders {
    public static void main(String[] args) {

        File directory = new File("c:/dir1/dir2/dir3");
        directory.mkdirs();

        int fileCount = 5;
        int numberCount = 10;
        String dataFileName = "allFilesHere.txt";
        String fileListName = "fileList.txt";

        List<File> files = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= fileCount; i++) {
            String fileName = "file" + i + ".txt";
            File file = new File(directory, fileName);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (int j = 0; j < numberCount; j++) {
                    int number = random.nextInt();
                    writer.write(Integer.toString(number));
                    writer.newLine();
                }
                files.add(file);
            } catch (IOException e) {
                System.out.println("Ошибка записи файла: " + e.getMessage());

            }
            File dataFile = new File(directory, dataFileName);
            try (InputStream in = new FileInputStream(file);
                 OutputStream out = new FileOutputStream(dataFile, true)) {

                byte[] buffer = new byte[1024];
                int lengthRead;
                while ((lengthRead = in.read(buffer)) > 0) {
                    out.write(buffer, 0, lengthRead);
                    out.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File fileList = new File(directory, fileListName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileList))) {
            for (File filez : directory.listFiles()) {
                if (filez.isFile()) {
                    writer.write(filez.getName());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());

        }

    }
}
