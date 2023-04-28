import java.util.Scanner;
 public class q10PrimeFactorsofanumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your number");
        int n=sc.nextInt();

        for(int div=2; div*div<=n; div++){  // since div=root n.. there n = div square.
            while(n%div==0){
                n=n/div;
                System.out.println(div);
            }
        }

        if(n!=0){
            System.out.println(n);
        }
    }
    
}
