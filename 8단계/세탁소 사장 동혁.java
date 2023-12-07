import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String N = reader.readLine();
        String B = reader.readLine();
        int Length=N.length();
        int Bint=Integer.parseInt(B);

        char character = N.charAt(0);
        int Nint;
        if(Character.isAlphabetic(character)){
           Nint=(int)(character);
           Nint=Nint-55;
        }
        else{
            Nint=Integer.parseInt(N);
        }
        int sum=0;
        for( int i=1; i<=Length;i++){

            sum+=Math.pow(Nint,i);

        }


    }
}
