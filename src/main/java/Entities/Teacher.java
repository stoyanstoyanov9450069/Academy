package Entities;

import Operators.Validator;

import java.time.LocalDate;

public class Teacher extends Person {

    private int salaryBGN;

    // Constructor
    public Teacher(String firstName, String middleName, String lastName, LocalDate birthDate) {
        super(firstName, middleName, lastName, birthDate);
    }


    // Name (GetFirstName / SetFirstName) (GetMiddleName / SetMiddleName) (GetLastName / SetLastName) + Name Validated
    @Override
    public String getFirstName() {
        return firstName;
    }
    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    // Middle Name
    @Override
    public String getMiddleName() {
        return super.getMiddleName();
    }
    @Override
    public void setMiddleName(String middleName) {
        super.setMiddleName(middleName);
    }

    // Last Name
    @Override
    public String getLastName() {
        return lastName;
    }
    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }



    // Email (GenerateEmail / GetEmail)
    public void generateEmail() {
        this.email = this.firstName + "." + this.lastName + "@academy.com";
    }
    @Override
    public String getEmail() {
        return email;
    }



    // Age (GetBirthDate / SetBirthDate) (GetAge / SetAge) + Age Calculated
    @Override
    public LocalDate getBirthDate() {
        return super.getBirthDate();
    }
    @Override
    public void setBirthDate(LocalDate birthDate) {
        super.setBirthDate(birthDate);
    }


    @Override
    public int getAge() {
        return super.getAge();
    }
    @Override
    public void setAge(LocalDate age) {
        super.setAge(age);
    }



    // Salary (GetSalary / SetSalary) + Salary Validated
    public int getSalaryBGN() {
        return salaryBGN;
    }
    public void setSalaryBGN(int salaryBGN) {
        if (Validator.isSalaryValid(salaryBGN)) {
            this.salaryBGN = salaryBGN;
        }
    }

}
