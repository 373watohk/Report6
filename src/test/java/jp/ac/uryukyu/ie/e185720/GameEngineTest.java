package jp.ac.uryukyu.ie.e185720;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class GameEngineTest {

    @Test
    public void testMakeAnswer() {

        int answer1, answer2,answer3,answer4;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1;i <= 9;i++){
            list.add(i);
        }
        //listをシャッフル
        Collections.shuffle(list);

        //４つ取り出しanswerに入れる
        answer1 = list.get(1);
        answer2 = list.get(2);
        answer3 = list.get(3);
        answer4 = list.get(4);

        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);

        //どの数字も重複していないことを証明する
        assertNotSame(answer1,answer2);
        assertNotSame(answer1,answer3);
        assertNotSame(answer1,answer4);
        assertNotSame(answer2,answer3);
        assertNotSame(answer3,answer4);
    }
}