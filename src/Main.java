import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello Oleksii");

        /*...*/

        /*...*/




        // s = console.nextLine();

        //System.out.println("My string " + s );

        /*while (true) {
            String s_new = console.nextLine();
            if (s_new.equals("exit")) {
                break;
            }
        }*/

        /*int i = 5;
        do {
            System.out.println(i);
            i--;
        } while (i > 0);

        System.out.println("_________");
        int l = 5;
        l--;
        while(l>0);
        {
            System.out.println(l);
            l--;
        }*/

        /*int result = 0;
        for (int i = 1; i<=5; i++){
            if((i%2)==0){
                System.out.println(i);

                continue;

            }
            result = result +i;
        }

        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        int s_1 = Integer.parseInt(s);
        System.out.println(s+1);
        System.out.println(s_1+1);*/

        System.out.println (My_first_method(maxNum));

    }

    public static int My_first_method (int maxNum)
    {
        int result = 0;
        for (int i = 0; i<= maxNum; i++);
        {
            result = result + i;
        }
        return result;
    }

}
