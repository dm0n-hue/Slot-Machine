package slot.machine;

import java.util.*;
public class SlotMachine {

    public static void main(String[] args) {

        int num1=0, num2=0, num3=0, contGame=0;
        Scanner scan = new Scanner(System.in);
        
        do {
            num1 = (int)(Math.random()*10);
            num2 = (int)(Math.random()*10);
            num3 = (int)(Math.random()*10);
            
            if (num1==num2 && num2==num3) {
                System.out.println("" + num1 + num2 + num3 + " Congratulations, you won!");
            }
            else if (num1==num2||num1==num3||num2==num3) {
                System.out.println("" + num1 + num2 + num3 + " You got two out of three numbers");
            }
            else {
                System.out.println("" + num1 + num2 + num3 + " Try again");
            }
            System.out.println("Do you want to play again? (1 for yes | 0 for no)");
            contGame=scan.nextInt();
        }
        
        while (contGame==1);
    }
    
}
