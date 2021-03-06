package test;

import java.util.concurrent.TimeUnit;
import  java.util.Date;
import java.util.Calendar;

public class DiscountAmount {
    private static double goldCardDiscount = 30;
    private static double silverCardDiscount = 20;
    private static double affiliateDiscount = 10;
    private static double overTwoYearDiscount = 5;
    private static double eachTwoHundredDollar = 5;

    public static double getPercentageDiscountAmount(Boolean type, String type1, long days){
        while(!type){
            if(type1 == "Gold"){
                return goldCardDiscount;
            }
            else if(type1 == "Silver"){
                return silverCardDiscount;
            }
            else if(type1 == "Affiliate"){
                return affiliateDiscount;
            }
            else if((TimeUnit.DAYS.convert(days, TimeUnit.MILLISECONDS)) >= 730){
                return overTwoYearDiscount;
            }
            else{
                return 0;
            }
        }
        return 0;
    }
    public static double getEachTwoHundredDollarDiscountAmount(){
        return eachTwoHundredDollar;
    }
}
