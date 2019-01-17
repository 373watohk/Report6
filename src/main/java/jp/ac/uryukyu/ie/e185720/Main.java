package jp.ac.uryukyu.ie.e185720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

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

        int[] answer = new int[4];    //生成した答えはいる
        int[] input = new int[4];     //入力した答えがはいる
        int hit = 0, blow = 0, count = 0;

        //タイトルとルールの表示
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(title);
        System.out.println(rule);

        //4桁の重複しない答えの生成
        //1~9までの数字を格納
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1;i <= 9;i++){
            list.add(i);
        }
        //listをシャッフル
        Collections.shuffle(list);

        //３つ取り出しanswer配列に入れる
        for(int i = 0;i < answer.length; i++){
            answer[i]=list.get(i);
            System.out.println(answer[i]);
        }
        //System.out.println(answer);

        //何回答えたかカウント
        while(true) {
            count++;
            System.out.println("*** "+count + "回目 ***");
            //答えインプット
            for (int i = 0; i<answer.length; i++) {
                System.out.println((i+1) + "回目：");
                try {
                    input[i] = Integer.parseInt(br.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("数値を入力してください");
                    i--;
                } catch (IOException e) {
                    System.out.println("もう一度入力してください");
                    i--;
                }
            }
            //答え判断
            for (int i = 0; i<answer.length; i++) {
                for (int j = 0; j<answer.length; j++) {
                    if (i==j && input[i]==answer[j]) {
                        hit++;
                    }else if (input[i] == answer[j]) {
                        blow++;
                    }
                }
            }
            //終了判断　ヒットが3つになったら終了
            System.out.println("ヒット" + hit + " ブロー" + blow);
            if (hit == 3) {
                System.out.println("おめでと〜");
                break;
            }else{
            }
        }
    }
}
