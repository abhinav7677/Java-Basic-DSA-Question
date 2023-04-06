import java.util.Scanner;
public class q12BenjaminBulbs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //Question was a riddle
        //We need to print all the perfect squares between 1 and end range by user

        int n=sc.nextInt();
        for(int i=1; i*i<n;i++){
            System.out.println(i*i);

        }
    }
    
}
