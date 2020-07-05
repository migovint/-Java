import javax.swing.*;

import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class NamArabFoRim {

    String str2;


    public String namArabFoRim(String str) {
        String delimeterI = "1";
        String delimeterII = "2";
        String delimeterIII = "3";
        String delimeterIV = "4";
        String delimeterV = "5";
        String delimeterVI = "6";
        String delimeterVII = "7";
        String delimeterVIII = "8";
        String delimeterIX = "9";
        String delimeterX = "10";


        if (str.equals(delimeterI)) {
            str2 = "I";
        } else if (str.equals(delimeterII)) {
            str2 = "II ";
        } else if (str.equals(delimeterIII)) {
            str2 = "III ";
        } else if (str.equals(delimeterIV)) {
            str2 = "IV ";
        } else if (str.equals(delimeterV)) {
            str2 = "V ";
        } else if (str.equals(delimeterVI)) {
            str2 = "VI ";
        } else if (str.equals(delimeterVII)) {
            str2 = "VII ";
        } else if (str.equals(delimeterVIII)) {
            str2 = "VIII ";
        } else if (str.equals(delimeterIX)) {
            str2 = "IX ";
        } else if (str.equals(delimeterX)) {
            str2 = "X ";
        }
        if (str2 == null) {
            Erroring error = new Erroring();
            error.znachenieNull();
        }

        return str2;

    }

}
