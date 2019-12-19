package teamproject;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class BookSearch {
    /*
    *책을 잦아주는데 필요한 메서들 구현하시면됩니다.
    *검색조건: 책이름으로 하거나 작가이름하는거
    *첫번째 사용자에게 믄자열 하나를 입력받고
    *두번쨰 입력받은 문자열을 insertBookList와 입력한 값을 비교
    *세번쨰 값이 있으면 값이 있다고 말을해주고 없으면 없다고 
    * 
    * */

    public static void a(){
   
    	Scanner s = new Scanner(System.in);
    	System.out.println("검색어를 입력해주세요>");
    	String userSearch = s.nextLine();

        boolean b1 = false;    
        boolean b2 = false;
        boolean b3 = false;
    	int noSearch = 0;
        
    	System.out.println("검색하신 결과입니다.");
    	System.out.println("==============================================");
    	
        for(int i = 0; i < BookInsert.insertBookList.size(); i++){
        b1 = BookInsert.insertBookList.get(i).getCategoryName().toLowerCase().replace(" ", "").contains(userSearch.replace(" ", "").toLowerCase());  
        b2 = BookInsert.insertBookList.get(i).getName().toLowerCase().replace(" ", "").contains(userSearch.replace(" ", "").toLowerCase());
        b3 = BookInsert.insertBookList.get(i).getAuthorName().toLowerCase().replace(" ", "").contains(userSearch.replace(" ", "").toLowerCase());
        
        if(b1 == true || b2 == true || b3 == true){
        	
        	if(BookInsert.insertBookList.get(i).isRentaled() == true){
            	System.out.println("대여 불가 ");
        	}else if(BookInsert.insertBookList.get(i).isRentaled() == false){
        	System.out.println("대여 가능 ");
        	}
        	
        	System.out.println("카테고리 : " + BookInsert.insertBookList.get(i).getCategoryName());
        	System.out.println("책이름 : " + BookInsert.insertBookList.get(i).getName());
        	System.out.println("작가 : " + BookInsert.insertBookList.get(i).getAuthorName());
        	System.out.println("==============================================");
        	
           }else if(b1 != true && b2 != true && b3 != true){
        	   noSearch++;
           }

        }//for문 종료
        
        if(noSearch == BookInsert.insertBookList.size()){
        System.out.println("검색하신 도서가 없습니다.");
    	System.out.println("==============================================");
        }
    	
    }
    
}
