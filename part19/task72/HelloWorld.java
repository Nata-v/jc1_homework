package part19.task72;

import java.lang.reflect.Method;

public class HelloWorld {
    public void printHelloWorld() {
        System.out.println("Hello, World!");
    }
        public static void main(String[] args) {
            try{
                Class<?> clazz = HelloWorld.class;
                Object obj = clazz.getDeclaredConstructor().newInstance();
                Method method = clazz.getDeclaredMethod("printHelloWorld");
                method.invoke(obj);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

