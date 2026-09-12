package aggregation;

import java.util.ArrayList;
import java.util.List;


public class Course {

    private String courseName;
    private List<Instructor> instructors = new ArrayList<>();
    private List<Textbook> textbooks = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public void addTextbook(Textbook textbook) {
        textbooks.add(textbook);
    }

    public List<Textbook> getTextbooks() {
        return textbooks;
    }


    public void print() {
        System.out.println("Course: " + courseName);
        for (Instructor instructor : instructors) {
            System.out.println("  Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
        }
        for (Textbook textbook : textbooks) {
            System.out.println("  Textbook: " + textbook.getTitle() + " by " + textbook.getAuthor());
        }
    }
}
