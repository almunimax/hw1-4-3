public class Main {
    public static void main(String[] args) {

        // задание 1
        System.out.println("задание 1");
        int age = 4;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        } else if (age >= 6 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
        }
        // задание 2
        System.out.println("задание 2");

        if (age < 5) {
            System.out.println("ребенок не может кататься на атракционе");
        } else if (age < 14) {
            System.out.println("ребенок может кататься на атракционе, только в сопровождении взрослого");
        } else {
            System.out.println("ребенок может кататься на атракционе");

        }
        // задание 3
        System.out.println("задание 3");
        int one = 4;
        int two = -5;
        int three = 101;
        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число" + one);
            }else if (three > one) {
                    System.out.println("Максимальное число" + three);
                } else {
                    System.out.println("Числа" + one + " и " + three +" равны");
                }
                if (two>three) {
                    System.out.println("Максимальное число" + two);
                }else if (three > two) {
                        System.out.println("Максимальное число" + three);
                    } else {
                        System.out.println("Числа" + two+" и " + three+"равны");
                    }
                }else {
                    if(one>three) {
                        System.out.println("Максимальное число" + one);
                    }else if(three>one){
                            System.out.println("Максимальное число" + three);
                        } else {
                            System.out.println("Числа равны");
                        }
                    }
                }

            }




