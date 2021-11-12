import Operators.Validator;

public class Course {

    Validator validator = new Validator();
    int courseID;
    String courseName;
    double coursePrice;




    // Constructor
    public Course (String courseName, Double coursePrice, int courseID){
        this.setCourseName(courseName);
        this.setCoursePrice(coursePrice);
        this.setCourseID(courseID);
    }


    // Course Name (GetCourseName / SetCourseName)
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
            this.courseName = courseName;
    }


    // Course ID (GetCourseID / SetCourseID(non-functional))
    public int getCourseID() {
        return courseID;
    }
    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }


    // Course price (GetCoursePrice / SetCoursePrice)
    public Double getCoursePrice() {
        return coursePrice;
    }
    public void setCoursePrice(Double coursePrice) {
        this.coursePrice = coursePrice;
    }
}
