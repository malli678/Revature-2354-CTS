package com.pkr.user;

import com.pkr.blogic.*;
import com.pkr.exceptions.*;
import java.util.*;

public class Clerk {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank acc1 = new HDFCBank();

        try {
            String option;

            do {
                System.out.println("1. DEPOSIT");
                System.out.println("2. WITHDRAW");
                System.out.println("3. BALANCE ENQUIRY");
                System.out.println("ENTER OPTION");

                option = sc.next();

                switch (option) {
                    case "1":
                        System.out.println("ENTER DEPOSIT AMOUNT");
                        acc1.deposit(sc.nextDouble());
                        acc1.balanceEnquiry();
                        break;

                    case "2":
                        System.out.println("ENTER WITHDRAW AMOUNT");
                        double wd = acc1.withdraw(sc.nextDouble());
                        System.out.println("WITHDRAW AMOUNT IS: " + wd);
                        acc1.balanceEnquiry();
                        break;

                    case "3":
                        acc1.balanceEnquiry();
                        break;

                    default:
                        System.out.println("INVALID OPTION");
                }

                System.out.println("DO YOU WANT TO CONTINUE (YES/NO)");
                option = sc.next();

            } while (option.equalsIgnoreCase("YES"));

        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
/*Output:
1. DEPOSITE
2. WITHDRAW
3. BALANCE ENQUIRY
ENTER OPTION
ENTER DEPOSIT AMOUNT
current balance = 5000.0
DO YOU WANT TO CONTINUE (YES/NO)

1. DEPOSITE
2. WITHDRAW
3. BALANCE ENQUIRY
ENTER OPTION
ENTER WITHDRAW AMOUNT
WITHDRAW AMOUNT IS :2000.0
current balance = 3000.0
DO YOU WANT TO CONTINUE (YES/NO)

1. DEPOSITE
2. WITHDRAW
3. BALANCE ENQUIRY
ENTER OPTION
current balance = 3000.0
DO YOU WANT TO CONTINUE (YES/NO)

*/