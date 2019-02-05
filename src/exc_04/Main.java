package exc_04;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void sum(Scanner in, PrintWriter out){
        int value = in.nextInt();
        int a1 = value -(value-1);
        int sum = (a1 + value)*value/2;
        out.print(sum);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        new Main().sum(in,out);

    }
}
