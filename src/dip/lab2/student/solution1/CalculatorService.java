/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Expression Fnetzlaw is undefined on line 12, column 14 in
 * Templates/Classes/Class.java.
 */
public class CalculatorService {
private Tip tip;

    public Tip getTip() {
        return tip;
    }

    public void setTip(Tip tip) {
        this.tip = tip;
    }

    public double getTipValue(){
        return tip.getTipValue();
    }
}
