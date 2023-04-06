import java.util.*;
public class q7Inverseofanumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        System.out.println("You Entered Number Before Inversing is "+n);
        int inv=0;
        int op=1;
        while(n!=0){
            int od=n%10; //Getting original digit
             int id=op;  //Swapping inverse digit with original place
            int ip=od;   // Swapping inverse place with original digit
            
            inv=inv+ id*(int)(Math.pow(10,ip-1)); // Initialised inv with 0 at last at top of the code because inv cannot be use before and after equal to sign without declaretion
            //now reducing the entered number
            n=n/10;
            //increasing the original place
            op++;

        }
            System.out.println("Your inversed number is"+inv);

        }
}
