import java.util.*;
class Assign {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of M=");
        int M = sc.nextInt();
        if((M%3==0) && (M%5==0))
            System.out.println("Good number");
        else if((M%3==0)&&(M%5!=0))
        System.out.println("Bad number");
        else if((M%5==0)&&(M%3!=0))
        System.out.println("Poor number");
        else
        System.out.println(-1);

        
    }

    
}
