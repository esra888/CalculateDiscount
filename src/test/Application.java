package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.math.RoundingMode;

public class Application {
    public static void main(String[] args) throws ParseException {
        int markedPrice;

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date_first=format.parse("02/04/2018");
        Date date_second=format.parse("04/03/2019");
        Date date_third=format.parse("02/03/2019");
        Date currentDate = new Date();
        long first_long = currentDate.getTime() - date_first.getTime();
        long second_long = currentDate.getTime() - date_first.getTime();
        long third_long = currentDate.getTime() - date_first.getTime();



        Customer birinci= new Customer("esra",true,"Gold",date_first);
        Customer ikinci= new Customer("afra",true,"Silver",date_second);
        Customer ucuncu= new Customer("serife",false,"",date_third);



        Products iphone_phone = new Products();
        iphone_phone.setId(1L);
        iphone_phone.setProductType("phone");
        iphone_phone.setProductPrice(10000);
        iphone_phone.setCustomer(birinci);

        Products asus_pc = new Products();
        asus_pc.setId(2L);
        asus_pc.setProductType("pc");
        asus_pc.setProductPrice(30000);
        asus_pc.setCustomer(birinci);



        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter product price.: ");
        markedPrice=sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter product is phone or not. True or False ");
        Boolean is_phone = sc2.nextBoolean();
        DiscountAmount d1 = new DiscountAmount();
        
        double discountforCard = calculateNetPayableAmount(markedPrice,d1.getPercentageDiscountAmount(is_phone,birinci.getMemberType(),first_long));

        double discountforeachTwoDollars  = calculateTwoDiscount(markedPrice, d1.getEachTwoHundredDollarDiscountAmount());


        System.out.println("total discount is :" +(discountforCard +discountforeachTwoDollars)+ "\nnet price is: " +(markedPrice-(discountforCard+discountforeachTwoDollars)));



    }

    private static double calculateTwoDiscount(int markedPrice, double eachTwoHundredDollarDiscountAmount) {
        double discountForEachTwoHundredDollar = 0;
        if(markedPrice >= 200) {
            discountForEachTwoHundredDollar = (markedPrice/200) * eachTwoHundredDollarDiscountAmount;
            return discountForEachTwoHundredDollar;
        }
        return discountForEachTwoHundredDollar;
    }


    public static double calculateNetPayableAmount(int markedPrice, double cardDiscount) {
        double discountForCard = 0;
        discountForCard = (markedPrice * (cardDiscount)) /100;
        return discountForCard;
    }


}
