package Step_Class_Assignments;

import java.io.PrintStream;

public class Q1 {
    public static void main(String[] args) {
        salesPeriod();
    }
    public static void salesPeriod(){
        String[] totalMonths = {"April", "May", "June", "July", "August", "September"};
        int[] totalDays = {30, 31, 30, 31, 30, 31};
        long[] monthlySales = new long[6];
        long totalRetailSales = 0;
        long totalCorporateSales = 0;
        long totalCurrentSales = 1;
        int overallDayCounter = 1;

        for(int i = 0; i < totalDays.length; i++){
            int days = totalDays[i];
            for(int j = 1; j <= days; j++){
                if(overallDayCounter > 1){
                    totalCurrentSales += 2 * (overallDayCounter - 1);
                }
                monthlySales[i] += totalCurrentSales;
                if(overallDayCounter % 5 == 0){
                    totalCorporateSales += totalCurrentSales;
                } else{
                    totalRetailSales += totalCurrentSales;
                }
                overallDayCounter++;
            }
        }
        PrintStream stream = new PrintStream(System.out);
        stream.println(totalCurrentSales);
        for (int i = 0; i < totalMonths.length; i++) {
            stream.println(totalMonths[i] + " Sales: " + monthlySales[i]);
        }
        stream.println("Total Retail Sales: " + totalRetailSales);
        stream.println("Total Corporate Sales: " + totalCorporateSales);
    }
}
