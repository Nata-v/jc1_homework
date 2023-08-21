package part19.task73;

import java.lang.reflect.Method;

public class AnnotationExample {
    @AcademyInfo(year = 2023)
    public void  markedMethod(){
        System.out.println("Этот метод помечен анотацией @AcademyInfo");
    }
    public void unmarkedMethod(){
        System.out.println("Этот метод не помечен анотацией!");
    }

    public static void main(String[] args) {
        AnnotationExample example = new AnnotationExample();
        example.checkAnnotation(example.getClass());
    }
    public void checkAnnotation(Class<?> clazz){
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods){
            if (method.isAnnotationPresent(AcademyInfo.class)){
                AcademyInfo annotation = method.getAnnotation(AcademyInfo.class);
                int year = annotation.year();
                System.out.println("Метод " + method.getName() + " помечен аннотацией @AcademyInfo с годом " + year);

            }else {
                System.out.println("Метод " + method.getName() + " не помечен аннотацией @AcademyInfo");
            }
        }
    }
}
