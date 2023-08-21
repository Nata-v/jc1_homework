package part12.task47;

import java.io.File;

public class MyFilesAndCatalogs {
    public static void main(String[] args) {

        String path = "c:\\work\\lessons\\Lessons";
        File directory = new File(path);

        if (directory.exists()) {
            System.out.println("Список файлов: ");

            File[] files = directory.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
            }
            System.out.println("Список каталогов: ");
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println(file.getName());
                }
            }
        }else{
            System.out.println("Каталог не существует!");
        }
    }
}
