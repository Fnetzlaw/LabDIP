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
public class FoodStrategy implements Tip {
    private static double MIN_BILL = 0.00;
    private static double GOOD_RATE = 0.20;
    private static double FAIR_RATE = 0.15;
    private static double POOR_RATE = 0.10;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;

    private double bill;
    
    public FoodStrategy(Tip.ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }
    
    @Override
    public double getTipValue() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * GOOD_RATE;
                break;
            case FAIR:
                tip = bill * FAIR_RATE;
                break;
            case POOR:
                tip = bill * POOR_RATE;
                break;
        }

        return tip;
    }
    
    private Tip.ServiceQuality serviceQuality;

    public final void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }
    
}
