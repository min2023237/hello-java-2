package d7.collections.prob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
어떤 가게의 메뉴 <메뉴명> <가격>형태로 계속 입력된다.
"order"가 입력되었을 때,
사용자의 단일 주문을 받고 금액을 출력하시오.
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scanStr = scanner.nextLine();
        String[] menuLine = scanStr.split(" ");
        //System.out.println(menuLine[0]);

        if (scanStr == "order") {
            String scanOrder = scanner.nextLine();
            
        }

        //String priceStr = menuLine[1];
        //int price = (int) priceStr;
        Map<String, String> menu = new HashMap<>();
        menu.put(menuLine[0], menuLine[1]);



        //System.out.println(Arrays.toString(menuLine));
    }

//
//
}
