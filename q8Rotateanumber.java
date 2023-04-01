import java.util.*;
public class q8Rotateanumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n=sc.nextInt();
        System.out.println("Enter your number by which you want to rotate previous number");
        int rn=sc.nextInt();
        int temp=n;
        int c=0;
        while(temp!=0){
            temp=temp/10;
            c++;
        }
        rn=rn%c; // for converting rn greater than the entered digits to a number in range of the digits of number present in the entered number

        if(rn<0){
            rn=rn+c; //SInce negetive input means a number from left so with subtracte it with number of digits so we can sort from right
        }


            int div=1;
            int mult=1;
            for(int i=1;i<=c;i++){
                if(i<=rn){
                    div=div*10;
                }else{
                    mult=mult*10;
                }

            }
            int q=n/div;
            int rem=n%div;


            int rotatednum=rem*mult+q;
            System.out.println(rotatednum);

    }
    
}
