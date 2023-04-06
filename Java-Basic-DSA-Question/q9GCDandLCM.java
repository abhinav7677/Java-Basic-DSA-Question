import java.util.Scanner;
public class q9GCDandLCM {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter you 1st Number ");
    int n1=sc.nextInt();
    System.out.println("Enter you 2st Number ");
    int n2=sc.nextInt();
    int temp1=n1;
    int temp2=n2;
    
    while(temp1%temp2!=0){
        int rem=temp1%temp2;
        temp1=temp2;
        temp2=rem;

    }
    int gcd=temp2;
    System.out.println("GCD is equal to "+gcd);
    int lcm=(n1*n2)/gcd;
    System.out.println("LCM is equal to "+lcm);

    }
    
}
