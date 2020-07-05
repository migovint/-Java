import javax.swing.*;

import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class NamRimFoArab {
    String str1;
    public String namRimFoArab(String str) {
        String delimeterI = "I";
        String delimeterII = "II";
        String delimeterIII = "III";
        String delimeterIV = "IV";
        String delimeterV = "V";
        String delimeterVI = "VI";
        String delimeterVII = "VII";
        String delimeterVIII = "VIII";
        String delimeterIX = "IX";
        String delimeterX = "X";


        if (str.equals(delimeterI)) {
            str1 = "1";
        } else if (str.equals(delimeterII)) {
            str1 = "2";
        } else if (str.equals(delimeterIII)) {
            str1 = "3";
        } else if (str.equals(delimeterIV)) {
            str1 = "4";
        } else if (str.equals(delimeterV)) {
            str1 = "5";
        } else if (str.equals(delimeterVI)) {
            str1 = "6";
        } else if (str.equals(delimeterVII)) {
            str1 = "7";
        } else if (str.equals(delimeterVIII)) {
            str1 = "8";
        } else if (str.equals(delimeterIX)) {
            str1 = "9";
        } else if (str.equals(delimeterX)) {
            str1 = "10";
        }

        return str1;

    }
}