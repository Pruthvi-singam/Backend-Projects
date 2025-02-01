package org.pruthvi_banking.banking.utils;

import java.time.Year;

public class AccountUtils {

    public static final String Exists_User_Code="001";
    public static final String Exists_User_Message="This account already exists";
    public static final String Account_Create_User_Code="002";
    public static final String Account_Create_User_Message="This account  Created Successfully";

    public static String generateAccountNumber() {

        Year currentYear=Year.now();

        int min=100000;
        int max=999999;
        int randNumber= (int) Math.floor(Math.random()*(max-min+1)+min);
        String year=String.valueOf(currentYear);
        String randNumberString=String.valueOf(randNumber);
        StringBuffer accountNumber=new StringBuffer();
        return accountNumber.append(year).append(randNumberString).toString();
    }
}
