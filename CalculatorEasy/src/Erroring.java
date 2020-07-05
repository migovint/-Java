import javax.swing.*;

import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Erroring {
    CalcArifmetik calcArifmetik = new CalcArifmetik();
    public void bolsheMenshe() {

        JOptionPane.showMessageDialog(null, "Ответ выходит за рамки задания. Попробуйте еще раз.", "Ошибка", ERROR_MESSAGE);
        calcArifmetik.rezalt = "0";
        CalcView calcView = new CalcView();
        calcView.inn.setText("");
    }

    public void znakovBolsheOdnogo(){
        JOptionPane.showMessageDialog(null, "Выражение должно быть только с двумя числами.", "Ошибка", ERROR_MESSAGE);
        calcArifmetik.rezalt = "0";
        CalcView calcView = new CalcView();
        calcView.inn.setText("");
    }

    public void znachenieNull(){
        CalcArifmetik calcArifmetik = new CalcArifmetik();
        JOptionPane.showMessageDialog(null, "Ответ выходит за рамки задания. Попробуйте еще раз.", "Ошибка", ERROR_MESSAGE);
        calcArifmetik.rezalt = "0";
        CalcView calcView = new CalcView();
        calcView.inn.setText("");
    }
}
