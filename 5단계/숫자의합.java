import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        int N = scanner.nextInt();
        

        scanner.nextLine();
        
        String input = scanner.nextLine();
        
   
        int sum = 0;
        for (int i = 0; i < N; i++) {
            char digitChar = input.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            sum += digit;
        }
        
      
        System.out.println(sum);
        
   
        scanner.close();
    }
}
