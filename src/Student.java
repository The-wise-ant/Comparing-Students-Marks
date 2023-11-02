import java.util.ArrayList;

/**
 * The Student class represents a student with a name and marks in various subjects.
 * It implements the Comparable interface to allow comparing students based on their total marks.
 */
public class Student implements Comparable<Student> {

    // Private instance variables to store the state of the Student
    private int totalMark;          // Total marks of the student
    private String name;            // Name of the student
    private ArrayList<String> subjects;  // List of subjects the student has marks for
    private ArrayList<Integer> marks;    // List of marks corresponding to subjects

    /**
     * Constructor to create a student with a given name.
     *
     * @param name The name of the student.
     */
    public Student(String name) {
        this.name = name;
        subjects = new ArrayList<String>();
        marks = new ArrayList<Integer>();
    }

    /**
     * Add marks for a subject to the student's record.
     *
     * @param subject The name of the subject.
     * @param mark The mark obtained in the subject.
     */
    public void addMarks(String subject, int mark) {
        subjects.add(subject);
        marks.add(mark);
        totalMark += mark;
    }

    /**
     * Compare this student to another student based on their total marks.
     * This method is required by the Comparable interface.
     *
     * @param other The student to compare to.
     * @return 1 if this student has more total marks, 0 if they have the same total marks, -1 if the other student has more total marks.
     */
    public int compareTo(Student other) {
        if (this.totalMark > other.totalMark)
            return 1;
        else if (this.totalMark == other.totalMark)
            return 0;
        else
            return -1;
    }

    /**
     * Get the name of the student.
     *
     * @return The name of the student.
     */
    public String getName() {
        return this.name;
    }
}
