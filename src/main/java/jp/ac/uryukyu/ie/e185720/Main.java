package jp.ac.uryukyu.ie.e185720;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        //変数の初期化。
        /*必要な変数
         * タイトル、ルール文、答えの格納される配列、
         * 入力された数字の格納される配列。
         * ヒット数、ブロー数、チャレンジの回数
         */
        String title = "*** Hit&Blow ***";      // タイトル
        String rule = "隠された4つの数字をあててね！\n"
                + "1つの数字は1から9の間だよ！\n"
                + "4つの答えの中に同じ数字はないよ！\n"
                + "入力した数字の位置と数字が当たってたらヒット、\n"
                + "数字だけあってたらブローとカウントするよ。\n"
                + "全部当てたら(4つともヒットになったら)"
                + "終了だよ〜\n"
                + "じゃっ頑張ってね〜\n\n";
      

        //タイトルとルールの表示
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(title);
        System.out.println(rule);

    }
}
