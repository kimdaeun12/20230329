package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App (Scanner sc){
        this.sc = sc;

    }
    public void run(){
        System.out.println("==명언엡==");
        int count = 0;
        ArrayList<WiseSaying> sayings = new ArrayList<>();
        while (true){
            String command = sc.nextLine().trim();

            if (command.equals("종료")){
                break;
            } else if (command.equals("등록")){
                System.out.println(" 명언 : ");
                String content = sc.nextLine().trim();
                System.out.println(" 작가 : ");
                String name = sc.nextLine().trim();

                int id = count + 1;
                WiseSaying wiseSaying = new WiseSaying(id,content,name);
                sayings.add(wiseSaying);
                System.out.println( count + "번 명언이 등록됐습니다." );
                count++;
            }
            else if (command.equals("목록")){
                System.out.println("명언 수" + sayings.size());
            }
        }
    }
}
