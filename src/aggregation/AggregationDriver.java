package aggregation;

public class AggregationDriver {
    public static void main(String[] args) {
        Course course = new Course("CS 5800");
        course.addInstructor(new Instructor("Nima", "Davarpanah", "3-2636"));
        course.addTextbook(new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall"));
        course.print();

        System.out.println();
        course.addInstructor(new Instructor("Ada", "Lovelace", "3-1000"));
        course.addTextbook(new Textbook("Design Patterns", "Erich Gamma et al.", "Addison-Wesley"));
        course.print();
    }
}
