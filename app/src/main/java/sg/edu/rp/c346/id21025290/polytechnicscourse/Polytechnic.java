package sg.edu.rp.c346.id21025290.polytechnicscourse;

import java.util.Comparator;

public class Polytechnic {
    private String year;
    private String gender;
    private String course;
    private String intake;
    private String enrollment;
    private String graduates;

    public Polytechnic(String year, String gender, String course, String intake, String enrollment, String graduates) {
        this.year = year;
        this.gender = gender;
        this.course = course;
        this.intake = intake;
        this.enrollment = enrollment;
        this.graduates = graduates;
    }

    public String getYear() {
        return year;
    }

    public String getGender() {
        return gender;
    }

    public String getCourse() {
        return course;
    }

    public String getIntake() {
        return intake;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public String getGraduates() {
        return graduates;
    }

    @Override
    public String toString() {
        return year + gender + course + intake + course + graduates;
    }

    public static Comparator<Polytechnic> courseComparatorAsc = new Comparator<Polytechnic>() {

        public int compare(Polytechnic c1, Polytechnic c2) {
            String course1 = c1.getCourse().toUpperCase();
            String course2 = c2.getCourse().toUpperCase();

            return course1.compareTo(course2);


        }
    };

    public static Comparator<Polytechnic> courseComparatorDesc = new Comparator<Polytechnic>() {

        public int compare(Polytechnic c1, Polytechnic c2) {
            String course1 = c1.getCourse().toUpperCase();
            String course2 = c2.getCourse().toUpperCase();

            return course2.compareTo(course1);


        }
    };

    public static Comparator<Polytechnic> intakeComparatorLowest = new Comparator<Polytechnic>() {

        public int compare(Polytechnic i1, Polytechnic i2) {
            int intake1 = Integer.parseInt(i1.getIntake());
            int intake2 = Integer.parseInt(i2.getIntake());

            return intake1 - intake2;


        }
    };

    public static Comparator<Polytechnic> intakeComparatorHighest = new Comparator<Polytechnic>() {

        public int compare(Polytechnic i1, Polytechnic i2) {
            int intake1 = Integer.parseInt(i1.getIntake());
            int intake2 = Integer.parseInt(i2.getIntake());

            return intake2 - intake1;


        }
    };

}
