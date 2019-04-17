/**
 *Written by : M.A.Samasha Nayananthi
 *UOW num : w1697763
 */
import java.util.Scanner;
public class DnD2 {
    static int diceRoll() {
        int roll1 = (int) ((Math.random() * 1000 % 6 + 1));
        int roll2 = (int) ((Math.random() * 1000 % 6 + 1));
        int roll3 = (int) ((Math.random() * 1000 % 6 + 1));
        int total = roll1 + roll2 + roll3;
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaring variables
        int level;
        int strBonus, dexBonus, conBonus, _intBonus, wisBonus, chaBonus;

        //Initializing
        conBonus = 0;
        String choice = null;

        //Getting the Level value
        System.out.println("Enter the Level value :");
        level = sc.nextInt();
        while ((level <= 0) || (level > 20)) {
            System.out.println("Invalid input.Please enter a number between 1-20.");
            System.out.println("Enter the Level value : ");
            level = sc.nextInt();
        }
        do {
            int str = diceRoll();
            int dex = diceRoll();
            int con = diceRoll();
            int _int = diceRoll();
            int wis = diceRoll();
            int cha = diceRoll();

            //Printing the Level
            System.out.println("\n\n\n\n\nLevel :  [ " + level + " ]");
            //Calculating the bonus for Str and print
            if (str > 10 && str != 11) {
                strBonus = (str - 10) / 2;
                System.out.println("Str  :  [" + str + " ]" + "[+" + strBonus + "]");
            } else if (str < 10) {
                strBonus = ((str / 2) - 5);
                System.out.println("Str  :  [" + str + " ]" + "[" + strBonus + "]");
            } else if (str == 10 || str == 11) {
                System.out.println("Str  :  [" + str + " ]" + "[0]");
            }
            //Calculating the bonus for Dex and print
            if (dex > 10 && dex != 11) {
                dexBonus = (dex - 10) / 2;
                System.out.println("Dex  :  [" + dex + " ]" + "[+" + dexBonus + "]");
            } else if (dex < 10) {
                dexBonus = ((dex / 2) - 5);
                System.out.println("Dex  :  [" + dex + " ]" + "[" + dexBonus + "]");
            } else if (dex == 10 || dex == 11) {
                System.out.println("Dex  :  [" + dex + " ]" + "[0]");
            }
            //Calculating the bonus for Con and print
            if (con > 10 && con != 11) {
                conBonus = (con - 10) / 2;
                System.out.println("Con  :  [" + con + " ]" + "[+" + conBonus + "]");
            } else if (con < 10) {
                conBonus = ((con / 2) - 5);
                System.out.println("Con  :  [" + con + " ]" + "[" + conBonus + "]");
            } else if (con == 10 || con == 11) {
                System.out.println("Con  :  [" + con + " ]" + "[0]");
            }
            //Calculating the bonus for Int and print
            if (_int > 10 && _int != 11) {
                _intBonus = (_int - 10) / 2;
                System.out.println("Int  :  [" + _int + " ]" + "[+" + _intBonus + "]");
            } else if (_int < 10) {
                _intBonus = ((_int / 2) - 5);
                System.out.println("Int  :  [" + _int + " ]" + "[" + _intBonus + "]");
            } else if (_int == 10 || _int == 11) {
                System.out.println("Int  :  [" + _int + " ]" + "[0]");
            }
            //Calculating the bonus for Wis and print
            if (wis > 10 && wis != 11) {
                wisBonus = (wis - 10) / 2;
                System.out.println("Wis  :  [" + wis + " ]" + "[+" + wisBonus + "]");
            } else if (wis < 10) {
                wisBonus = ((wis / 2) - 5);
                System.out.println("Wis  :  [" + wis + " ]" + "[" + wisBonus + "]");
            } else if (wis == 10 || wis == 11) {
                System.out.println("Wis  :  [" + wis + " ]" + "[0]");
            }
            //Calculating the bonus for Cha and print
            if (cha > 10 && cha != 11) {
                chaBonus = (cha - 10) / 2;
                System.out.println("Cha  :  [" + cha + " ]" + "[+" + chaBonus + "]");
            } else if (cha < 10) {
                chaBonus = ((cha / 2) - 5);
                System.out.println("Cha  :  [" + cha + " ]" + "[" + chaBonus + "]");
            } else if (cha == 10 || cha == 11) {
                System.out.println("Cha  :  [" + cha + " ]" + "[0]");
            }
            //Calculating the Hit points
            double hp = ((6 + conBonus) * level);
            //Print the Hit points
            System.out.println("HP : [" + hp + "]");
            //Give the chance to re-roll or continue
            System.out.println("Type r if you want to re-roll or any other character if you want to continue :");
            choice = sc.next();
        }
        while (choice.equals("r"));
    }
}
