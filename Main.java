
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        
        if (m>=35){
            
            if (m>=90){
                System.out.println("Grade A");
            }
            else if(m>=75){
                System.out.println("Grade B");
            }
            else{
                System.out.println("Grade C");
            }
        }

        else{
            System.out.println("Fail");
        }
    }
}