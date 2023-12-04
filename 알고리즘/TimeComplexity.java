import java.util.Scanner;


class TimeComplexity {

    public static void main(String[] args) {
     
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();



      System.out.println(simUntill(a));
     

    }
      public static int simUntill(int a){
                int sum;
            for(int i=1;i<=a;i++){
           sum+=i; 

        }
        return sum;
        
        }

}