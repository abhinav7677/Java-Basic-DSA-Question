import java.util.*;
public class q5digitsofanumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ct=0;
        int t=n;
        while(t!=0){
            t=t/10;
            ct++;
        } 
        System.out.println("Digits in the entered number "+ct);

        int div=(int)Math.pow(10,ct-1);
        int q=0;
        while(div!=0){
            q=n/div;
            System.out.println(q);

            n=n%div;
            div=div/10;
        }
}

}
