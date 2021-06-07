package base;/*
 *  UCF COP3330 Summer 2021 Assignment <INSERTNUM> Solution
 *  Copyright 2021 Fazlur Shofiquel
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        float principle;
        float ratePer;
        float rateDec;
        int years;
        float investment;
        String output;

        Scanner prinIn = new Scanner(System.in);
        Scanner rateIn = new Scanner(System.in);
        Scanner yearsIn = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat();
        dF.setGroupingUsed(false);

        System.out.print("Enter the principal: ");
        principle = prinIn.nextFloat();
        System.out.print("Enter the rate of interest: ");
        ratePer = rateIn.nextFloat();
        System.out.print("Enter the number of years: ");
        years = yearsIn.nextInt();

        rateDec = ratePer / 100;
        investment = principle * (1 + (rateDec * years));

        output = "After" +years+ "years at " +ratePer+"%, the investment will be worth $"+dF.format(investment);

        System.out.print(output);

    }
}
