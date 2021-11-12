package Operators;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;

public class Validator {

    // Name validator (No spaces/ Less than 30 chars / No symbols or digits)
    public static boolean isNameValid(String name) {
        boolean isNameValid = true;

        name = name.trim();

        if (name.length() >= 5 && name.length() <= 30 && !name.contains(" ")) {

            for (int index = 0; index < name.length(); index++) {

                if (name.charAt(index) < 64 && name.charAt(index) > 91 || name.charAt(index) < 96 && name.charAt(index) > 123) {
                    isNameValid = false;
                    break;
                }
            }


        }
        return isNameValid;
    }

    // Birth validator (Cannot be less than 18/ Cannot be more than 90 years old)

    public static boolean isBirthValid (LocalDate birthDate){
        boolean isBirthValid = true;
        boolean isBefore_1930 = false;
        boolean isAfterMaxDate = false;

        LocalDate _18_Years_ago = LocalDate.now();
        LocalDate year_1930 = LocalDate.parse("1930-01-01");

        if (birthDate.compareTo(year_1930) <= 0){
        isBefore_1930 = true;
         }

        if (birthDate.compareTo(_18_Years_ago)  <= -18 ){
        isAfterMaxDate = true;
        }

       if (isAfterMaxDate || isBefore_1930){
            isBirthValid = false;
       }
        return isBirthValid;

    }

    //Salary validator (Should be more than 580)

    public static boolean isSalaryValid(int salary){
        boolean isSalaryValid = true;
        if (salary < 580){
            isSalaryValid = false;
        }

        return isSalaryValid;
    }


}

