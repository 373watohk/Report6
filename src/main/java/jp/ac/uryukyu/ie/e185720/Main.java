package jp.ac.uryukyu.ie.e185720;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        GameEngine ge  = new GameEngine();
        int count = 0;      //何回目のチャレンジか数える

        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(ge.getTitle());
        System.out.println(ge.getRule());

        ge.MakeAnswer();      //答えの生成

        while (true) {
            count++;
            System.out.println("*** " + count + "回目 ***");

            //インプット
            for (int i = 0; i < ge.getNumberOfAnswer(); i++) {
                System.out.print((i + 1) + "個目 : ");
                try {
                    ge.InputAnswer(i, br.readLine());
                } catch (InputException e) {
                    System.err.println(e.getMessage());
                    i--;
                } catch (IOException e) {
                    System.err.println("もう一度入力してください");
                    i--;
                }

            }

            //答え判断
            boolean end=ge.judge();
            //終了判断
            System.out.println("ヒット" + ge.getHit()
                    + " ブロー" + ge.getBlow());
            if (end) {
                System.out.println("おめでと〜！！");
                break;
            } else {
                System.out.println();
            }
        }
    }
}
