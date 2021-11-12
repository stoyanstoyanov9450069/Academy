package Entities;

import Entities.*;

import java.time.LocalDate;
public class Student extends Person {


    private Integer studentID;
    private int townID;


    // Constructor
    public Student (String firstName, String middleName ,String lastName, LocalDate birthdate, int townID){
        super(firstName, middleName, lastName, birthdate);
        this.setTownID(townID);

    }



    // Student ID (GetStudentID / SetStudentID(non-functional))
    public int getStudentID() {
        return studentID;
    }
    public void setStudentID() {
        this.studentID = studentID;
    }



    // Name (GetFirstName / SetFirstName) (GetMiddleName / SetMiddleName) (GetLastName / SetLastName) + Name Validated
    @Override
    public String getFirstName() {
        return super.getFirstName();
    }
    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getMiddleName() {
        return super.getMiddleName();
    }
    @Override
    public void setMiddleName(String middleName) {
        super.setMiddleName(middleName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }
    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }



    // TownID (GetTownID / SetTownID)
    public int getTownID() {
        return townID;
    }
    public void setTownID(int townID) {
        this.townID = townID;
    }



    // Username (GetUsername / SetUsername)
    @Override
    public String getUserName() {
        return super.getUserName();
    }
    @Override
    public void generateUserName() {
        super.generateUserName();
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



    // Email (GenerateEmail / GetEmail)
    @Override
    public void generateEmail() {
        super.generateEmail();
    }
    @Override
    public String getEmail() {
        return super.getEmail();
    }
}
