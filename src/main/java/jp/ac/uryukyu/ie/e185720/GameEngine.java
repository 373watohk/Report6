package jp.ac.uryukyu.ie.e185720;

import java.util.ArrayList;
import java.util.Collections;

public class GameEngine {
    private String title = "*** Hit&Blow ***";      // タイトル
    private String rule = "隠された4つの数字をあててね！\n"      //ルール説明
            + "1つの数字は1から9の間だよ！\n"
            + "4つの答えの中に同じ数字はないよ！\n"
            + "入力した数字の位置と数字が当たってたらヒット、\n"
            + "数字だけあってたらブローとカウントするよ。\n"
            + "全部当てたら(4つともヒットになったら)"
            + "終了だよ〜\n"
            + "じゃっ頑張ってね〜\n\n";

    private int[] answer;       //答えを格納する配列
    private int[] input;        //入力した答えを保持する配列
    private int NumberOfAnswer = 4;     //答えの数字の桁数
    private int WidthOfRandom = 9;      //乱数の幅
    private int hit = 0;           //ヒットの数
    private int blow = 0;          //ブローの数

    /**
     * コンストラクタ
     */
    public GameEngine() {
        answer = new int[NumberOfAnswer];
        input = new int[NumberOfAnswer];
        MakeAnswer();
    }

    /**
     * 答え生成するメソッド
     */
    public void MakeAnswer() {
        //4桁の重複しない答えの生成
        //1~9までの数字を格納
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1;i <= 9;i++){
            list.add(i);
        }
        //listをシャッフル
        Collections.shuffle(list);

        //４つ取り出しanswer配列に入れる
        for(int i = 0;i < answer.length; i++){
            answer[i]=list.get(i);
        }
    }

    /**要素を指定して答えを入力
     *
     * @param index
     * @param answer
     * @throws InputException
     */
    public void InputAnswer(int index, int answer)
            throws InputException {
        if (index > -1 && index < NumberOfAnswer) {
            if (answer > 0 && answer <= WidthOfRandom) {
                input[index] = answer;
            } else {
                throw new InputException("入力が答えの範囲外です");
            }
        } else {
            throw new InputException("入力する場所を間違っています");
        }
    }


    /**
     * inputとanswerを突き合わせる。
     * すべてhitならtrue、それ以外はfalse。
     *
     * @return すべてhitならtrue、それ以外はfalse。
     */
    public boolean judge() {
        //答え判断
        hit = 0;
        blow = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (i == j && input[i] == answer[j]) {
                    hit++;
                } else if (input[i] == answer[j]) {
                    blow++;
                }
            }
        }
        return (hit == NumberOfAnswer);
    }

    /**タイトルのgetter
     *
     * @return タイトル
     */
    public String getTitle() {
        return title;
    }

    /**ルールのgetter
     *
     * @return ルール
     */
    public String getRule() {
        return rule;
    }

    /**答えの桁数のgetter
     *
     * @return 桁数
     */
    public int getNumberOfAnswer() {
        return NumberOfAnswer;
    }

    /**blowのgetter
     *
     * @return blowの数
     */
    public int getBlow() {
        return blow;
    }

    /**hitのgetter
     *
     * @return hitの数
     */
    public int getHit() {
        return hit;
    }


}
