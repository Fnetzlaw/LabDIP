/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author netzl_000
 */
public interface Tip {
    
    public static enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    public abstract double getTipValue();
    
}
