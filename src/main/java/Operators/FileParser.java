import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import Entities.*;

public class FileParser {


    public static ArrayList<Student> parseStudentsFile(File filePath) {

        ArrayList<Student> inputStudentFieldsMap = new ArrayList<>();
        String[] tokens;
        Scanner scanner = null;
        try {
            scanner = new Scanner(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNext()) {
            tokens = scanner.nextLine().split(",");
            DateTimeFormatter source = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(tokens[3], source);
            Student student = new Student(tokens[0], tokens[1], tokens[2], date, Integer.parseInt(tokens[4]));
            inputStudentFieldsMap.add(student);
        }

        for (Student input : inputStudentFieldsMap) {
            System.out.println(input.getFirstName() + " " + input.getMiddleName() + " " + input.getLastName()+ " " +
                    input.getAge()+ " " + input.getTownID());

        }
        return inputStudentFieldsMap;
    }

    public static ArrayList<Teacher> parseTeacherFile (File filePath){

        ArrayList<Teacher> inputTeacherFieldsMap = new ArrayList<>();
        String[] tokens;
        Scanner scanner = null;
        try {
            scanner = new Scanner(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNext()) {
            tokens = scanner.nextLine().split(",");
            DateTimeFormatter source = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(tokens[3], source);
            Teacher teacher = new Teacher(tokens[0], tokens[1], tokens[2], date);
            inputTeacherFieldsMap.add(teacher);
        }

        for (Teacher input : inputTeacherFieldsMap) {
            System.out.println(input.getFirstName() + " " + input.getMiddleName() + " " + input.getLastName()+ " " +
                    input.getAge());

        }
        return inputTeacherFieldsMap;
    }

}

