import java.util.Scanner;
public class q6reverseofanumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        while(n!=0){
            int t=n%10;
            n=n/10;
            System.out.println(t);
        }

    }
    
}
