/**
 *Written by : M.A.Samasha Nayananthi
 *UOW num : w1697763
 */
import java.util.Scanner;
public class DnD1 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        //Declaring variables
        int _str;
        int con;
        int _int;
        int dex;
        int wis;
        int _cha;
        int level;
        //Getting the inputs while inputs are valid
        System.out.println("Enter Level value: ");
        level = sc.nextInt();
        while (level <= 0) {
            System.out.println("Invalid input");
            System.out.println("Enter Level value: ");
            level = sc.nextInt();
        }
        System.out.println("Enter Str value: ");
        _str = sc.nextInt();
        while (_str < 0) {
            System.out.println("Invalid input");
            System.out.println("Enter Str value: ");
            _str = sc.nextInt();
        }
        System.out.println("Enter Dex value: ");
        dex = sc.nextInt();
        while (dex < 0) {
            System.out.println("Invalid input");
            System.out.println("Enter Dex value: ");
            dex = sc.nextInt();
        }
        System.out.println("Enter Con value: ");
        con = sc.nextInt();
        while (con < 0) {
            System.out.println("Invalid input");
            System.out.println("Enter Con value: ");
            con = sc.nextInt();
        }
        System.out.println("Enter Int value: ");
        _int = sc.nextInt();
        while (_int < 0) {
            System.out.println("Invalid input");
            System.out.println("Enter Int value: ");
            _int = sc.nextInt();
        }
        System.out.println("Enter Wis value: ");
        wis = sc.nextInt();
        while (wis < 0) {
            System.out.println("Invalid input");
            System.out.println("Enter Wis value: ");
            wis = sc.nextInt();
        }
        System.out.println("Enter Cha value: ");
        _cha = sc.nextInt();
        while (_cha < 0) {
            System.out.println("Invalid input");
            System.out.println("Enter Cha value: ");
            _cha = sc.nextInt();
        }

        //Declaring variables
        int bonus1,bonus2,bonus3,bonus4,bonus5,bonus6;
        //Printing the Level
        System.out.println("\n\n\n\n\n\n\n\n\nLevel :  [ "+level+" ]");
        //Calculating the bonus for Str and print
        if (_str > 10 && _str != 11) {
            bonus1 = (_str - 10) / 2;
            System.out.println("Str  :  ["+_str+" ]"+"[+"+bonus1+"]");
        } else if (_str < 10) {
            bonus1 = ((_str / 2) - 5);
            System.out.println("Str  :  ["+_str+" ]"+"["+bonus1+"]");
        } else if (_str == 10 || _str == 11){
            System.out.println("Str  :  ["+_str+" ]"+"[0]");
        }
        //Calculating the bonus for Dex and print
        if (dex > 10 && dex != 11) {
            bonus2 = (dex - 10) / 2;
            System.out.println("Dex  :  ["+dex+" ]"+"[+"+bonus2+"]");
        } else if (dex < 10) {
            bonus2 = ((dex / 2) - 5);
            System.out.println("Dex  :  ["+dex+" ]"+"["+bonus2+"]");
        } else if (dex == 10 || dex == 11) {
            System.out.println("Dex  :  ["+dex+" ]"+"[0]");
        }
        //Calculating the bonus for Con and print
        if (con > 10 && con != 11) {
            bonus3 = (con - 10) / 2;
            System.out.println("Con  :  ["+con+" ]"+"[+"+bonus3+"]");
        } else if (con < 10) {
            bonus3 = ((con / 2) - 5);
            System.out.println("Con  :  ["+con+" ]"+"["+bonus3+"]");
        } else if (con == 10 || con == 11){
            System.out.println("Con  :  ["+con+" ]"+"[0]");
        }
        //Calculating the bonus for Int and print
        if (_int > 10 && _int != 11) {
            bonus4 = (_int - 10) / 2;
            System.out.println("Int  :  ["+_int+" ]"+"[+"+bonus4+"]");
        } else if (_int < 10) {
            bonus4 = ((_int / 2) - 5);
            System.out.println("Int  :  ["+_int+" ]"+"["+bonus4+"]");
        } else if (_int == 10 || _int == 11) {
            System.out.println("Int  :  ["+_int+" ]"+"[0]");
        }
        //Calculating the bonus for Wis and print
        if (wis > 10 && wis != 11) {
            bonus5 = (wis - 10) / 2;
            System.out.println("Wis  :  ["+wis+" ]"+"[+"+bonus5+"]");
        } else if (wis < 10) {
            bonus5 = ((wis / 2) - 5);
            System.out.println("Wis  :  ["+wis+" ]"+"["+bonus5+"]");
        } else if (wis == 10 || wis == 11) {
            System.out.println("Wis  :  ["+wis+" ]"+"[0]");
        }
        //Calculating the bonus for Cha and print
        if (_cha > 10 && _cha != 11) {
            bonus6 = (_cha - 10) / 2;
            System.out.println("Cha  :  ["+_cha+" ]"+"[+"+bonus6+"]");
        } else if (_cha < 10) {
            bonus6 = ((_cha / 2) - 5);
            System.out.println("Cha  :  ["+_cha+" ]"+"["+bonus6+"]");
        } else if (_cha == 10 || _cha == 11) {
            System.out.println("Cha  :  ["+_cha+" ]"+"[0]");
        }

        //Calculating the HitPoints by given formula
        System.out.println("HP   :   [" + level * (Math.random() * 1000 % 6 + 1) + "]");

    }
}

