import java.lang.reflect.Array;
import java.util.Scanner;

public class 문자열돌리기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] as=a.split("");

        for( int i=0; i<a.length();i++){
        System.out.println(as[i]);

        }

        
    }
}