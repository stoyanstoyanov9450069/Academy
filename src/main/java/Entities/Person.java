package Entities;

import Operators.Calculator;
import Operators.Validator;

import java.time.LocalDate;

public class Person {


    String firstName;
    String middleName;
    String lastName;
    String email;
    String userName;
    LocalDate birthDate;
    int age;


    //Constructor
    public Person (String firstName,String middleName ,String lastName, LocalDate birthDate) {
        this.setFirstName(firstName);
        this.setMiddleName(middleName);
        this.setLastName(lastName);
        this.setBirthDate(birthDate);
    }

    //Name (GetFirstName / SetFirstName) (GetMiddleName / SetMiddleName) (GetLastName / SetLastName) + Validated
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        if (Validator.isNameValid(firstName)){
            this.firstName = firstName;
        }

    }

    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        if (Validator.isNameValid(firstName)){
            this.middleName = middleName;
        }
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        if (Validator.isNameValid(firstName)){
            this.lastName = lastName;
        }
    }


    //Username (GetUsername / SetUsername)
    public String getUserName() {
        return userName;
    }
    protected void generateUserName() {
        this.userName = this.firstName + this.lastName;
    }


    // Email (GenerateEmail / SetEmail)
    protected void generateEmail() {
        this.email = this.firstName + "." + this.lastName + "@academy.com";
    }
    public String getEmail() {
        return email;
    }


    // Age (GetBirthDate / SetBirthDate) (GetAge / SetAge) + Calculated
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        Validator validator = new Validator();

        if (validator.isBirthValid(birthDate)){
            birthDate = this.birthDate;
        }
        setAge(birthDate);
    }

    public int getAge() {
        Calculator calculator = new Calculator();
        return age;
    }
    public void setAge(LocalDate age) {

        try{
            this.age = Calculator.calculateAge(age);
        } catch (NullPointerException exception){

            System.out.println("Birth date is invalid.");
        }


    }
}


