import Operators.Connector;


public class Main {

    public static void main(String[] args) {


        ///FileParser.parseStudentsFile(new File("C:\\Users\\Exodia\\Desktop\\AcademyStudentsFile.txt"));
        ///
        //FileParser.parseTeacherFile(new File("C:\\Users\\Exodia\\Desktop\\AcademyTeachersFile.txt"));

        Connector.connectToDB("jdbc:oracle:thin:@92.247.131.11:41521"
                , "JavaCourseProject", "123456");

        Connector.disconnectFromDB();

    }
}

