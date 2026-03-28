import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();

        switch(day){
            case "saturday","sunday" -> System.out.println("alarm at 6AM");
            case "monday" -> System.out.println("alarm at 7AM");
            default -> System.out.println("alarm at 8AM");
                
        }

    }
}