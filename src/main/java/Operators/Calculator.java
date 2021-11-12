package Operators;

import java.time.LocalDate;
import java.time.Period;

public class Calculator {

    // Age calculator (by birth date)
    public static int calculateAge(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = birthDate;
        int age = birthday.until(today).getYears();

        return age;

    }
}
