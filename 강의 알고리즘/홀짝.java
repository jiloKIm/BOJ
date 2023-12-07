package 강의 알고리즘;

public class 홀짝 {
    public int solution(int n) {
        int answer = 0;

        if(n%2==0){
            int sum=0;
            for(int i=0;i<=n;i+=2){
                sum+=(i*i);
            }
            return sum;

        }
        else{
            int sum=0;
            for(int i=1;i<=n;i+=2){
                sum+=i;
            }
            return sum;

        }
        BufferedReader 

    }
    
}
