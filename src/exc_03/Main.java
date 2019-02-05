package exc_03;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out){
        out.println(in.nextInt());
    }

    void run(){
        try (Scanner in = new Scanner(new FileReader("src"+ File.separator+"exc_03"+File.separator+"value_In"));
             PrintWriter out = new PrintWriter(new FileWriter("src"+ File.separator+"exc_03"+File.separator+"value_Out"))){

            solve(in,out);
        }catch(IOException e){
            throw new Error(e);
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }
}

//Второй способ
//class Main2{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int s = scanner.nextInt();
//        System.out.println(s);
//
//    }
//}