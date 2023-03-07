package io.daxx0ne.wiseSaying;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Application {

    private final Scanner sc;

    //new Application(sc).run();

    public Application(Scanner sc){
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        int number = 1;

        while(true){
            System.out.print("명령) ");
            String command = sc.nextLine().trim(); //혹시 모를 공백들을 제거해줌

            if (command.equals("종료")){
                break;

            } else if (command.equals("등록")){
                System.out.print("명언 : ");
                String content = sc.nextLine().trim();

                System.out.print("작가 : ");
                String authorName = sc.nextLine().trim();

                System.out.printf("%d번 명언이 동록되었습니다.\n", number);
                number++;

            }
        }

    }
}
