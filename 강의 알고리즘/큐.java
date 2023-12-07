import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner scanner=new Scanner(System.in);
       int num=scanner.nextInt();
       for(int i=1; i<=num;i++) {
           q.offer(i);
       }
        while(q.size()>1) {
            q.poll();
            int a = q.poll();
            q.offer(a);
        }
        System.out.println( q.poll());
    }
}