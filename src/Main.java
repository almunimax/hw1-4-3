public class Main {
    public static void main(String[] args) {

                // задание 1
        System.out.println("задание 1");
        int age = 20;
        if(age >= 2 && age <=6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        } else if (age >=6 && age<= 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        }else if (age >18 && age<= 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
        }else if (age >24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
        }

        }
    }
