import javax.swing.*;

import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class CalcArifmetik {
    String rezalt;
    int nam1;
    int nam2;

    public String calcArifmetik(String str) {

        int cons = 0;

        String[] subStr;
        String delimeterP = "\\+";
        String delimeterM = "\\-";
        String delimeterU = "\\*";
        String delimeterD = "\\/";

        NamRimFoArab namRimFoArab = new NamRimFoArab();
        NamArabFoRim namArabFoRim = new NamArabFoRim();
        Erroring error = new Erroring();

        String[] strArrayP = str.split(delimeterP);
        String[] strArrayU = str.split(delimeterM);
        String[] strArrayM = str.split(delimeterU);
        String[] strArrayD = str.split(delimeterD);
        cons = (strArrayP.length - 1) + (strArrayU.length - 1) + (strArrayM.length - 1) + (strArrayD.length - 1);

        if (cons > 1) {
            error.znakovBolsheOdnogo();
        } else if (str.contains("+")) {
            subStr = str.split(delimeterP);
            if (subStr[0].contains("I") || subStr[0].contains("II") || subStr[0].contains("III") || subStr[0].contains("IV") || subStr[0].contains("V") || subStr[0].contains("VI") || subStr[0].contains("VII") || subStr[0].contains("VIII") || subStr[0].contains("IX") || subStr[0].contains("X")) {
                nam1 = Integer.parseInt(namRimFoArab.namRimFoArab(subStr[0]));
            } else nam1 = Integer.parseInt(subStr[0]);
            if (subStr[1].contains("I") || subStr[1].contains("II") || subStr[1].contains("III") || subStr[1].contains("IV") || subStr[1].contains("V") || subStr[1].contains("VI") || subStr[1].contains("VII") || subStr[1].contains("VIII") || subStr[1].contains("IX") || subStr[1].contains("X")) {
                nam2 = Integer.parseInt(namRimFoArab.namRimFoArab(subStr[1]));
            } else nam2 = Integer.parseInt(subStr[1]);
            if ((nam1 + nam2) > 10 || (nam1 + nam2) < 1) {
                error.bolsheMenshe();
            } else if (subStr[0].contains("I") || subStr[0].contains("II") || subStr[0].contains("III") || subStr[0].contains("IV") || subStr[0].contains("V") || subStr[0].contains("VI") || subStr[0].contains("VII") || subStr[0].contains("VIII") || subStr[0].contains("IX") || subStr[0].contains("X")) {
                rezalt = namArabFoRim.namArabFoRim(Integer.toString(nam1 + nam2));
            } else rezalt = Integer.toString(nam1 + nam2);
        }


        if (str.contains("-")) {
            subStr = str.split(delimeterM);
            if (subStr[0].contains("I") || subStr[0].contains("II") || subStr[0].contains("III") || subStr[0].contains("IV") || subStr[0].contains("V") || subStr[0].contains("VI") || subStr[0].contains("VII") || subStr[0].contains("VIII") || subStr[0].contains("IX") || subStr[0].contains("X")) {
                nam1 = Integer.parseInt(namRimFoArab.namRimFoArab(subStr[0]));
            } else nam1 = Integer.parseInt(subStr[0]);
            if (subStr[1].contains("I") || subStr[1].contains("II") || subStr[1].contains("III") || subStr[1].contains("IV") || subStr[1].contains("V") || subStr[1].contains("VI") || subStr[1].contains("VII") || subStr[1].contains("VIII") || subStr[1].contains("IX") || subStr[1].contains("X")) {
                nam2 = Integer.parseInt(namRimFoArab.namRimFoArab(subStr[1]));
            } else nam2 = Integer.parseInt(subStr[1]);
            if ((nam1 - nam2) > 10 || (nam1 - nam2) < 1) {

                error.bolsheMenshe();
            } else if (subStr[0].contains("I") || subStr[0].contains("II") || subStr[0].contains("III") || subStr[0].contains("IV") || subStr[0].contains("V") || subStr[0].contains("VI") || subStr[0].contains("VII") || subStr[0].contains("VIII") || subStr[0].contains("IX") || subStr[0].contains("X")) {
                rezalt = namArabFoRim.namArabFoRim(Integer.toString(nam1 - nam2));
            } else rezalt = Integer.toString(nam1 - nam2);
        }


        if (str.contains("*")) {
            subStr = str.split(delimeterU);
            if (subStr[0].contains("I") || subStr[0].contains("II") || subStr[0].contains("III") || subStr[0].contains("IV") || subStr[0].contains("V") || subStr[0].contains("VI") || subStr[0].contains("VII") || subStr[0].contains("VIII") || subStr[0].contains("IX") || subStr[0].contains("X")) {
                nam1 = Integer.parseInt(namRimFoArab.namRimFoArab(subStr[0]));
            } else nam1 = Integer.parseInt(subStr[0]);
            if (subStr[1].contains("I") || subStr[1].contains("II") || subStr[1].contains("III") || subStr[1].contains("IV") || subStr[1].contains("V") || subStr[1].contains("VI") || subStr[1].contains("VII") || subStr[1].contains("VIII") || subStr[1].contains("IX") || subStr[1].contains("X")) {
                nam2 = Integer.parseInt(namRimFoArab.namRimFoArab(subStr[1]));
            } else nam2 = Integer.parseInt(subStr[1]);
            if ((nam1 * nam2) > 10 || (nam1 * nam2) < 1) {

                error.bolsheMenshe();
            } else if (subStr[0].contains("I") || subStr[0].contains("II") || subStr[0].contains("III") || subStr[0].contains("IV") || subStr[0].contains("V") || subStr[0].contains("VI") || subStr[0].contains("VII") || subStr[0].contains("VIII") || subStr[0].contains("IX") || subStr[0].contains("X")) {
                rezalt = namArabFoRim.namArabFoRim(Integer.toString(nam1 * nam2));
            } else rezalt = Integer.toString(nam1 * nam2);
        }


        if (str.contains("/")) {
            subStr = str.split(delimeterD);
            if (subStr[0].contains("I") || subStr[0].contains("II") || subStr[0].contains("III") || subStr[0].contains("IV") || subStr[0].contains("V") || subStr[0].contains("VI") || subStr[0].contains("VII") || subStr[0].contains("VIII") || subStr[0].contains("IX") || subStr[0].contains("X")) {
                nam1 = Integer.parseInt(namRimFoArab.namRimFoArab(subStr[0]));
            } else nam1 = Integer.parseInt(subStr[0]);
            if (subStr[1].contains("I") || subStr[1].contains("II") || subStr[1].contains("III") || subStr[1].contains("IV") || subStr[1].contains("V") || subStr[1].contains("VI") || subStr[1].contains("VII") || subStr[1].contains("VIII") || subStr[1].contains("IX") || subStr[1].contains("X")) {
                nam2 = Integer.parseInt(namRimFoArab.namRimFoArab(subStr[1]));
            } else nam2 = Integer.parseInt(subStr[1]);
            if ((nam1 / nam2) > 10 || (nam1 / nam2) < 1) {

                error.bolsheMenshe();
            } else if (subStr[0].contains("I") || subStr[0].contains("II") || subStr[0].contains("III") || subStr[0].contains("IV") || subStr[0].contains("V") || subStr[0].contains("VI") || subStr[0].contains("VII") || subStr[0].contains("VIII") || subStr[0].contains("IX") || subStr[0].contains("X")) {
                rezalt = namArabFoRim.namArabFoRim(Integer.toString(nam1 / nam2));
            } else rezalt = Integer.toString(nam1 / nam2);

        }


        return rezalt;
    }
}

