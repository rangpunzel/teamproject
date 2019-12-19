package teamproject;

import java.util.ArrayList;
import java.util.Arrays;

public class BookInsert {
    //책등록을 해주시면됩니다.
    public static ArrayList<BookVO> insertBookList = new ArrayList<BookVO>();

    public static void print() {
        System.out.println("관리자번호:"+BookVO.getManagement());
        for(int i=0;i<insertBookList.size();i++){
        System.out.println("착가이름:"+insertBookList.get(i).getAuthorName());
        System.out.println("책이름:"+insertBookList.get(i).getName());
        System.out.println("장르:"+insertBookList.get(i).getCategoryName());
        System.out.println("등록일:"+insertBookList.get(i).getRegDate());
        }



    }
}
