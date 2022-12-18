public class Homework_26 {
    public static void main(String[] args){

        /*int currentYear = 2022;
        int friendYear = 1992;
        System.out.println("Моему другу " + (currentYear-friendYear) + " лет");*/

 /*String number = "756848";
        System.out.println("number = " + number);
        System.out.println("lastDigit будет = " + number.charAt(5));*/

        /*int age = 30;
        String name = "Alex";
        if(age >=18 && age<=30){
            System.out.println(name + ",поздравляю вы разобрались как работает if");
        }*/

        /*int x = 34;
        int y = 89;
        if (x>0 && y>0 ){
            System.out.println("Точка пересечения находится в 1-й плоскости");
        }
        if (x<0 && y>0 ){
            System.out.println("Точка пересечения находится в 2-й плоскости");
        }
        if (x<0 && y<0 ){
            System.out.println("Точка пересечения находится в 3-й плоскости");
        }
        if (x>0 && y<0 ){
            System.out.println("Точка пересечения находится в 4-й плоскости");
        }*/

        int a = 4;
        int b = 5;
        int c = 3;

        if ((a+b>c) && (b+c>a) && (a+c>b)){
            System.out.println("Такой треугольник можно построить");
        }
        else {
            System.out.println("Такой треугольник построить нельзя");
        }

    }
}
