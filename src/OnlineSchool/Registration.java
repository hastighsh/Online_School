package OnlineSchool;

public class Registration {

    public String subject;
    public int marks;
    public Instructor instructor;
    public String[] gradeReport;
    public String description;
    public String[] registration;


    public Registration() {
        this.subject = "Software Design";
        this.marks = 0;
        gradeReport = new String[2];
        registration = new String[5];
    }

    public Registration(String subject, Instructor instructor ){
        this.subject = subject;
        this.instructor = instructor;
        this.marks = 0;
        gradeReport = new String[2];
        registration = new String[5];
    }
    public Registration(String subject) {
        this.subject = subject;

        this.marks = 0;
        gradeReport = new String[2];
        registration = new String[5];
    }

    public String getTitle() {
        return subject;
    }

    public int getMarks() {
        return marks;
    }

    public Instructor getInstructor() {
        return instructor;
    }


    public String[] getGradeReport() {
        if (90 <= marks && marks <= 100) {
            gradeReport[0] = "A+";
            gradeReport[1] = "Exceptional";
        } else if (80 <= marks && marks <= 89) {
            gradeReport[0] = "A";
            gradeReport[1] = "Excellent";
        } else if (70 <= marks && marks <= 79) {
            gradeReport[0] = "B";
            gradeReport[1] = "Good";
        } else if (60 <= marks && marks <= 69) {
            gradeReport[0] = "C";
            gradeReport[1] = "Competent";
        } else if (50 <= marks && marks <= 59) {
            gradeReport[0] = "D";
            gradeReport[1] = "Passing";
        } else if (0 <= marks && marks <= 49) {
            gradeReport[0] = "F";
            gradeReport[1] = "Failing";
        }

        return gradeReport;
    }

    public String getInformation() {
        if (instructor == null) {
            return subject + " has not yet been assigned an instructor";
        } else {
            description = subject + ", taught by " + instructor.getName() + ", is completed with raw marks " + marks + " (" + gradeReport[0] + " ; " + gradeReport[1] + ")";
        }
        return description;
    }

    public void setMarks(int newMarks) {
        marks = newMarks;
    }

    public void setInstructor(Instructor name) {
        instructor = name;
    }

}