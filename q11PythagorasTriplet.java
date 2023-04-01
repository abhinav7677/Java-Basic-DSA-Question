import java.util.Scanner;

public class q11PythagorasTriplet {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your First Number");
        int a=sc.nextInt();
        System.out.println("Enter your First Number");
        int b=sc.nextInt();
        System.out.println("Enter your First Number");
        int c=sc.nextInt();

        int max=a; //assumption
        
        if(b>=max){
            max=b;    }

        if(c>=max){
            max=c;
        }

        if(max==a){
            boolean flag=((b*b)+(c*c)==(a*a));
            System.out.println("Is your entered number a pythagorus triplet?");
            System.out.println(flag);
        }
        else if(max==b){
            boolean flag=((a*a)+(c*c)==(b*b));
            System.out.println("Is your entered number a pythagorus triplet?");
            System.out.println(flag);
        }
        else{
            boolean flag=((a*a)+(b*b)==(c*c));
            System.out.println("Is your entered number a pythagorus triplet?");
            System.out.println(flag);
        }

        
    }
}
