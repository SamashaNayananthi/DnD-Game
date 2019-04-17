/**
 *Written by : M.A.Samasha Nayananthi
 *UOW num : w1697763
 */
import java.util.Scanner;
public class DnD3 {
        static int diceRoll(){
            int total = 0;
            int roll1 = (int) ((Math.random() * 1000 % 6 + 1));
            int roll2 = (int) ((Math.random() * 1000 % 6 + 1));
            int roll3 = (int) ((Math.random() * 1000 % 6 + 1));
            int roll4 = (int) ((Math.random() * 1000 % 6 + 1));

            if ((roll1<roll2)&&(roll1<roll3)&&(roll1<roll4)){
                total = roll2+roll3+roll4;
            }
            else if ((roll2<roll1)&&(roll2<roll3)&&(roll2<roll4)){
                total = roll1+roll3+roll4;
            }
            else if ((roll3<roll1)&&(roll3<roll2)&&(roll3<roll4)){
                total = roll1+roll2+roll4;
            }
            else {
                total = roll1+roll2+roll3;
            }

            return total;
        }
        static int calculateBonus(int total ){
            int bonus = 0;
            if (total > 10 && total!= 11) {
                bonus = (total - 10) / 2;
            } else if (total < 10) {
                bonus = ((total / 2) - 5);
            } else if (total == 10 ||total == 11){
                bonus = 0;
            }
            return bonus;
        }

        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            //Declaring variables
            int level;
            String choice = null;

            //Getting the Level value
            System.out.println("Enter the Level value :");
            level = sc.nextInt();
            while ((level<=0)||(level>20)){
                System.out.println("Invalid input.Please enter a number between 1-20.");
                System.out.println("Enter the Level value : ");
                level = sc.nextInt();
            }
            do{

                int str = diceRoll();
                int dex =  diceRoll();
                int con = diceRoll();
                int _int = diceRoll();
                int wis = diceRoll();
                int cha = diceRoll();

                int strBonus = calculateBonus(str);
                int dexBonus = calculateBonus(dex);
                int conBonus = calculateBonus(con);
                int _intBonus = calculateBonus(_int);
                int wisBonus = calculateBonus(wis);
                int chaBonus = calculateBonus(cha);

                //Printing the Level
                System.out.println("\n\n\n\n\nLevel :  [ "+level+" ]");

                //Displaying out put
                if (strBonus>0) {
                    System.out.println("Str  :  [" + str + " ]" + "[+" + strBonus + "]");
                }
                else {
                    System.out.println("Str  :  ["+str+" ]"+"["+strBonus+"]");
                }
                if (dexBonus>0) {
                    System.out.println("Dex  :  [" + dex + " ]" + "[+" + dexBonus + "]");
                }
                else {
                    System.out.println("Dex  :  ["+dex+" ]"+"["+dexBonus+"]");
                }
                if (conBonus>0) {
                    System.out.println("Con  :  [" + con + " ]" + "[+" + conBonus + "]");
                }
                else{
                    System.out.println("Con  :  ["+con+" ]"+"["+conBonus+"]");
                }
                if (_intBonus>0) {
                    System.out.println("Int  :  [" + _int + " ]" + "[+" + _intBonus + "]");
                }
                else{
                    System.out.println("Int  :  ["+_int+" ]"+"["+_intBonus+"]");
                }
                if (wisBonus>0) {
                    System.out.println("Wis  :  [" + wis + " ]" + "[+" + wisBonus + "]");
                }
                else{
                    System.out.println("Wis  :  ["+wis+" ]"+"["+wisBonus+"]");
                }
                if (chaBonus>0) {
                    System.out.println("Cha  :  [" + cha + " ]" + "[+" + chaBonus + "]");
                }
                else {
                    System.out.println("Cha  :  ["+cha+" ]"+"["+chaBonus+"]");
                }

                //Calculating the Hit points
                double hp = ((6+conBonus)*level);
                //Print the Hit points
                System.out.println("HP : ["+hp+"]");
                //Give the chance to re-roll or continue
                System.out.println("Type r if you want to re-roll or any other character if you want to continue :");
                choice = sc.next();
            }
            while (choice.equals("r"));;

        }
}
