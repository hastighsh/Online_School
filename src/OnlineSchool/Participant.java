package OnlineSchool;


public class Participant {

    public String partName;
    public Registration[] registrations;
    public String report;
    public String course;
    public int count;
    public int indexCount;
    public String letterGrade;
    public double gpa;

    public Participant(){
        this.partName = "S. Y. Lee";
        registrations = new Registration[5];
        this.report = "No GPA available yet for " + partName;
        this.course = "";
        this.count = 0;
        this.indexCount = 0;
    }

    public Participant(String partName){
        this.partName = partName;
        registrations = new Registration[5];
        this.report = "No GPA available yet for " + partName;
        this.course = "";
        this.count = 0;
        this.indexCount = 0;
    }

    public Registration[] getRegistrations() {
        Registration[] temp = new Registration[count];

        for (int i = 0; i < count; i++){

            temp[i] = registrations[i];
        }
         return temp;
    }

    public String getGPAReport() {
        String arrGrade = "";
        int marksTotal = 0;
        int pointGrade = 0;

        if (count != 0) {


            for (int i = 0; i < count; i++) {


                if (90 <= registrations[i].marks && registrations[i].marks <= 100) {
                    letterGrade = "A+";
                    pointGrade = 9;
                } else if (80 <= registrations[i].marks && registrations[i].marks <= 89) {
                    letterGrade = "A";
                    pointGrade = 8;
                } else if (70 <= registrations[i].marks && registrations[i].marks <= 79) {
                    letterGrade = "B";
                    pointGrade = 7;
                } else if (60 <= registrations[i].marks && registrations[i].marks <= 69) {
                    letterGrade = "C";
                    pointGrade = 6;
                } else if (50 <= registrations[i].marks && registrations[i].marks <= 59) {
                    letterGrade = "D";
                    pointGrade = 5;
                } else if (0 <= registrations[i].marks && registrations[i].marks <= 49) {
                    letterGrade = "F";
                    pointGrade = 0;
                }

                marksTotal += pointGrade;
                arrGrade += pointGrade + " (" + letterGrade + ")";
                if (i < count - 1) {
                    arrGrade = arrGrade + ", ";
                }
            }

            arrGrade = arrGrade + "}: ";
            gpa = ((int)(((double) marksTotal/ count) * 10.0) / 10.0);
            report = partName + "'s GPA of {" + arrGrade + gpa;

        } else {
            report = "No GPA available yet for " + partName;
        }

        return report;
    }

    public int marksOf(String course) {
        for (int i = 0; i < count; i++) {
            if (registrations[i].getTitle().equals(course)){
                return registrations[i].marks;
            }
        }
        return -1;
    }


    public void addRegistration(Registration registration) {
            if (count < 5) {
                registrations[count] = registration;
                count++;
            }
    }

    public void addRegistration(String course) {
        Registration  r = new Registration(course);
        addRegistration(r);
    }


    public void updateMarks(String course, int marks) {

        for (int i = 0; i < count; i++ ) {

            if (registrations[i].getTitle().equals( course)){
                this.registrations[i].marks = marks;
                break;
            }
        }
    }

    public void clearRegistrations(){
        registrations = new Registration[5];
        count = 0;
    }
}
