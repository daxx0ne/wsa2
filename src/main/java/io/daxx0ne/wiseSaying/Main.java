package io.daxx0ne.wiseSaying;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Application application = new Application(sc);
        application.run();

        sc.close();
    }
}
