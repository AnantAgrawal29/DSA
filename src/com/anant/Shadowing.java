package  com.anant;
//import java.util.Scanner;

public class Shadowing {
    static int x=90;
    public static void main(String[] args)
    {
        System.out.println(x);
        int x=40;
        System.out.println(x); // x=90 shadowed(scope will begin when variable is initialized)
//        Scanner sc = new Scanner(System.in);
    }
}
