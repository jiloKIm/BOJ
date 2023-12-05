import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int inputs=Integer.parseInt(input);
        int[] c=new int[inputs];
        for(int i=0;i<inputs;i++){
            String inputd = reader.readLine();
            String[] ct=inputd.split(" ");
            for (int j = 0; j < ct.length; j++) {
                c[j] = Integer.parseInt(ct[j]);
            }
            c[i]=c[0]+c[1];
        }
        for(int i=0;i<inputs;i++){
         System.out.println(c[i]);
        }



    }
}
