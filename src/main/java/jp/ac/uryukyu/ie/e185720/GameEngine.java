package jp.ac.uryukyu.ie.e185720;

public class GameEngine {
    String title = "*** Hit&Blow ***";      // タイトル
    String rule = "隠された4つの数字をあててね！\n"      //ルール説明
            + "1つの数字は1から9の間だよ！\n"
            + "4つの答えの中に同じ数字はないよ！\n"
            + "入力した数字の位置と数字が当たってたらヒット、\n"
            + "数字だけあってたらブローとカウントするよ。\n"
            + "全部当てたら(4つともヒットになったら)"
            + "終了だよ〜\n"
            + "じゃっ頑張ってね〜\n\n";

    int[] answer;       //答えを格納する配列
    int[] input;        //入力した答えを保持する配列
    int NumberOfAnswer = 4;     //答えの数字の桁数
    int WidthOfRandom = 9;      //乱数の幅
    int hit = 0;           //ヒットの数
    int blow = 0;          //ブローの数

    /**
     * コンストラクタ
     */
    public GameEngine() {
        answer = new int[NumberOfAnswer];
        input = new int[NumberOfAnswer];

    }

    public String getTitle() {
        return title;
    }
    public String getRule() {
        return rule;
    }
}
