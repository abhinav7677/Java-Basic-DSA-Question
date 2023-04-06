import java.util.*;
public class q2Listofprimefromseries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Lower range");
        int low=sc.nextInt();
        System.out.println("Enter the Higher range");
        int high=sc.nextInt();
       
        for(int i=low;i<=high;i++){
            int count=0;
            for(int div=2;div*div<=i;div++){
                if(i%div==0){
                    count++;
                    break;
                }
             }
            if(count==0){
                System.out.println("The Prime numbers Are "+i);
        }
    }
}
}