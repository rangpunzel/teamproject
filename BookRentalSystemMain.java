package teamproject;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Arrays;

public class BookRentalSystemMain {
    public static void main(String[] args) {
        initData();
        
        BookSearch.a();
    }

    private static void initData() {
        BookVO[] bookVO = new BookVO[5];
        BookVO bookVO1 = new BookVO();

        bookVO1.setAuthorName("남궁성");
        bookVO1.setCategoryName("기술");
        bookVO1.setName("자바의 정석");
        bookVO1.setEndRenDate(null);
        bookVO1.setStartRenDate(null);
        bookVO1.setRegDate("2019-12-19");
        BookVO bookVO2 = new BookVO();
        bookVO2.setRentaled(false);
        bookVO2.setAuthorName("옥스토비");
        bookVO2.setCategoryName("자연과학");
        bookVO2.setName("옥스토비의 일반화학");
        bookVO2.setEndRenDate(null);
        bookVO2.setStartRenDate(null);
        bookVO2.setRegDate("2019-12-19");
        bookVO2.setRentaled(false);
        BookVO bookVO3 = new BookVO();
        bookVO3.setAuthorName("맨큐");
        bookVO3.setCategoryName("사회과학");
        bookVO3.setName("맨큐의 경제학");
        bookVO3.setEndRenDate(null);
        bookVO3.setStartRenDate(null);
        bookVO3.setRegDate("2019-12-19");
        bookVO3.setRentaled(false);
        BookVO bookVO4 = new BookVO();
        bookVO4.setAuthorName("Jearl Walker, David Halliday, Robert Resnick");
        bookVO4.setCategoryName("자연과학");
        bookVO4.setName("일반물리학 제 1권");
        bookVO4.setEndRenDate(null);
        bookVO4.setStartRenDate(null);
        bookVO4.setRegDate("2019-12-19");
        bookVO4.setRentaled(false);
        BookVO bookVO5 = new BookVO();
        bookVO5.setAuthorName("Jearl Walker, David Halliday, Robert Resnick");
        bookVO5.setCategoryName("자연과학");
        bookVO5.setName("일반물리학 제 2권");
        bookVO5.setEndRenDate(null);
        bookVO5.setStartRenDate(null);
        bookVO5.setRegDate("2019-12-19");
        bookVO5.setRentaled(false);
        bookVO[0]=bookVO1;
        bookVO[1]=bookVO2;
        bookVO[2]=bookVO3;
        bookVO[3]=bookVO4;
        bookVO[4]=bookVO5;
        BookInsert.insertBookList.add(bookVO[0]);
        BookInsert.insertBookList.add(bookVO[1]);
        BookInsert.insertBookList.add(bookVO[2]);
        BookInsert.insertBookList.add(bookVO[3]);
        BookInsert.insertBookList.add(bookVO[4]);
        BookInsert.print();

    }
}