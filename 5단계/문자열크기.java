import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    String s=sc.nextLine();

   if(Double.parseDouble(s)){
 
    System.out.println("true");

    }
    else{

    System.out.println(s[0],s[s.length()-1]);
    }
}
}