import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter valid for 'a': ");
        a = input.nextInt();
        System.out.println("Please enter valid for 'b' :");
        b = input.nextInt();
        System.out.println("Please enter valid for 'c' :");
        c = input.nextInt();

        if (a < b && a < c) {
            System.out.println("a is " + a + " The smallest number is 'a' ");
        } else if (b < a && b < c) {
            System.out.println("b is  " + b + " The smallest number is 'b' ");
        } else if (c < a && c < b) {
            System.out.println("c is " + c + " The smallest number is 'c'");
        }else {
            System.out.println("Wrong value please try again");
        }
    }
}