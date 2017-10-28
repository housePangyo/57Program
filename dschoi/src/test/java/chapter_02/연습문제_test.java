package chapter_02;

import java.io.IOException;

/**
 * Created by 두석 on 2017-10-25.
 */
public class 연습문제_test {


    public static void main(String[] args) throws IOException {
        연습문제1 연습문제 = new 연습문제1();
        연습문제.init();
        String input = 연습문제.input();
        연습문제.print(input);
    }
}
