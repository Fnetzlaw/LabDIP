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
public class FoodService implements Tip {

    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;
    private double bill;

    public enum ServiceQuality {

        GOOD, FAIR, POOR
    }
    private ServiceQuality serviceQuality;

    @Override
    public double getTip(double tip) {
        switch (serviceQuality) {
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

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public void setServiceQuality(ServiceQuality serviceQuality) {
        this.serviceQuality = serviceQuality;
    }
    
    
}
