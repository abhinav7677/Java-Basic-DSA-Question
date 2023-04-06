import java.util.Scanner;
public class q3Fibonaacciseries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<=f;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
        
    }
    
}
