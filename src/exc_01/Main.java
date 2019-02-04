package exc_01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out){
        int a = in.nextInt();
        int b = in.nextInt();
        int s = a + b;

        out.println(s);
    }

    void run(){
        try (Scanner in = new Scanner(new FileReader("src"+ File.separator+"exc_01"+File.separator+"sum_In"));
             PrintWriter out = new PrintWriter(new FileWriter("src"+ File.separator+"exc_01"+File.separator+"sum_Out"))){

            solve(in,out);
        }catch(IOException e){
            throw new Error(e);
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
