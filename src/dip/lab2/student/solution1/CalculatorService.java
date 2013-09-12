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

    private Tip tips;

    public CalculatorService(Tip t) {
        tips = t;
    }

    public CalculatorService() {
    }

    public void setEmployee(Tip t) {
        if (t == null) {
            throw new NullPointerException();
        }

        tips = t;
    }

    public double getTipForService(double tip) {
        return tips.getTip(tip);
    }
}
