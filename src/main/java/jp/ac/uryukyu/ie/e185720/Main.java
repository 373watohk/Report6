package jp.ac.uryukyu.ie.e185720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        GameEngine ge  = new GameEngine();
        int count = 0;

        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(ge.getTitle());
        System.out.println(ge.getRule());

    }
}
