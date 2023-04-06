import java.util.Scanner;
class q1prime {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number you want to check for prime");
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        int t=sc.nextInt();
        int count=0;
    for(int div=2;div*div<=t;div++){
        
        if(t%div==0){
            count++;
        }
    }
        if(count==0){ //count is set to zero because a prime number has only 2 factor 1 and number iteself
                      // we started out loop for 2 and end it till root n so, 1 and number itself will never appear!
            System.out.println("Is prime");
        }
        else{
            System.out.println("Is not prime");
        }
    }
    }

 }
