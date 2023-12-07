import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class stack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int i = 1;
        while (i <= num) {
            int a = sc.nextInt();
            if (a == 1) {
                int su = sc.nextInt();
                stack.push(su);
            }
            else if (a == 2) {
                if(stack.isEmpty()){
                    q.offer(-1);
                }
                else{
                int su = stack.pop();
                q.offer(su);
                }
            } else if (a == 3) {
                q.offer(stack.size());
            } else if (a == 4) {
                if (stack.empty()){
                    q.offer(1);
                }
                else {
                    q.offer(0);
                }
            } else if (a == 5) {
                if (stack.empty()) {
                    q.offer(-1);
                }
                else {
                    q.offer(stack.peek());
                }
            }
            i++;

        }
        while (q.isEmpty()==false) {
            System.out.println(q.poll());

        }
    }

}
