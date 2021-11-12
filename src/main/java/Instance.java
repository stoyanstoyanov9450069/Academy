import java.util.ArrayList;
import java.util.HashMap;
import Entities.*;

public class Instance {

    ArrayList<Student> participants;
    CourseName courseName;


    //Constructor
    public Instance(CourseName courseName) {
        this.courseName = courseName;
    }


    // InstanceID with corresponding Student IDs (getParticipants / addParticipant)
    public ArrayList getParticipants() {
        return participants;
    }


    public void addParticipant(Student s) {
        this.participants.add(s);
    }
}
