package chapter_02;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by 두석 on 2017-10-25.
 */
public class 연습문제1 {

    public static final String HELLO_STRING = "안녕  %s , 반가워";

    public 연습문제1(){

        scanner = new Scanner(System.in);
    }

    public void init(){
        System.out.print("What's your name?");
    }

    private Scanner scanner;

    public String input() throws IOException {
        return scanner.next();
    }

    public void print(String inputData){
        System.out.println(String.format(HELLO_STRING, inputData ));
    }

}
