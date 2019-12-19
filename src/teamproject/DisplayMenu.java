package teamproject;

import java.io.PrintStream;
import java.util.Scanner;

public class DisplayMenu {
    PrintStream printStream = new PrintStream(System.out);
    BookRental bookRental=new BookRental();
    
    public void startMenu() {
        printStream.println("1.도서등록");
        printStream.println("2.도서검색");
        printStream.println("3.도서 대여");
        printStream.println("4.도서 반납");
        //selectedMenu();

    }

    public void selectedMenu() {//해당함수는 해당 객체에서 메서드 구현후 해당 기능 메서드 호출
        /*1번을 입력했다면 도서등록 기능이 2번을 선택했다면 도서 검색기능이 3번을 선택했다면 도서 대여 기능이 4번이 됬다면 도서 반납기능이 실행됩니다.
         */
        Scanner scanner = new Scanner(System.in);
        String selectedNum;
        while (true) {
            selectedNum = scanner.nextLine();
            if (selectedNum.equals("2")) {
            	bookRental.a();
            }


        }
    }
}
