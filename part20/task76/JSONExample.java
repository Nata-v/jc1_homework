package part20.task76;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JSONExample {
   public static void main(String[] args) {
    try {
            // Чтение JSON файла
            BufferedReader reader = new BufferedReader(new FileReader("c:\\homework\\jc1_homework\\info.json"));
            StringBuilder stringBuilder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
            reader.close();

            // Создание объекта Gson
            Gson gson = new Gson();

            // Преобразование JSON в объект
            Person person = gson.fromJson(stringBuilder.toString(), Person.class);

            // Вывод объекта на экран
            System.out.println("ID: " + person.getId());
            System.out.println("Name: " + person.getName());
            System.out.println("Permanent: " + person.isPermanent());
            System.out.println("Address: " + person.getAddress().getStreet() + ", " + person.getAddress().getCity() + ", " + person.getAddress().getZipcode());
            System.out.println("Phone Numbers: ");
            for (int phoneNumber : person.getPhoneNumbers()) {
                System.out.println(phoneNumber);
            }
            System.out.println("Role: " + person.getRole());
            System.out.println("Cities: ");
            for (String city : person.getCities()) {
                System.out.println(city);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
