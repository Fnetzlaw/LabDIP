/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2.student.solution1;

/**
 *
 * @author Expression Fnetzlaw is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class Startup {
    public static enum ServiceQuality {
           GOOD, FAIR, POOR
    };
 
    public static void main(String[] args) {
//        This is drawing baggage servie tip by using the TipCalculatorStrategy
//        so i can subsutie the baggage for food service if needed. this is making
//        it not rigid.
        Tip baggageStrategy1 =
                new BaggageStrategy(
                BaggageStrategy.ServiceQuality.FAIR,5);
        
        Tip baggageStrategy2 =
                new BaggageStrategy(
                BaggageStrategy.ServiceQuality.GOOD,5);
//
//
        Tip foodStrategy1 = 
                new FoodStrategy(
                FoodStrategy.ServiceQuality.GOOD, 15);
        
        Tip foodStrategy2 = 
                new FoodStrategy(
                FoodStrategy.ServiceQuality.POOR, 15);
//
//
        Tip[] foodService = {foodStrategy1, foodStrategy2};
        Tip[] BaggageService = {baggageStrategy1, baggageStrategy2};
        
        
        CalculatorService calculatorService = new CalculatorService();
        calculatorService.setTip(foodStrategy1);
        
        CalculatorService calculatorService1 = new CalculatorService();
        calculatorService1.setTip(foodStrategy2);
        
        
        for(int i=0; i < foodService.length; i++) {
           calculatorService.setTip(foodService[i]);
           System.out.println("Food Service " + (i+1) + " Tip: " + calculatorService.getTipValue());

        }
        
        for(int i=0; i < BaggageService.length; i++) {
           calculatorService.setTip(BaggageService[i]);
           System.out.println("Baggage Service " + (i+1) + " Tip: " + calculatorService.getTipValue());

        }
    }
}
