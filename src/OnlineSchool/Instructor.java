package OnlineSchool;

public class Instructor {
	// TODO: implement this class

    public String name;
    public int phoneExt;
    public String contact;
    public String info;

    public Instructor(Instructor instructor) {
        this.name = "Jackie";
        this.phoneExt = 70130;
        this.contact = "jackie@eecs.yorku.ca";
        this.info = "Instructor Jackie has campus phone extension 70130 and contact email jackie@eecs.yorku.ca";
    }

    public Instructor(String name, int phoneExt, String contact){
        this.name = name;
        this.phoneExt = phoneExt;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public int getPhoneExtension() {
        return phoneExt;
    }

    public String getEmail() {
        return contact;
    }

    public String getInformation(){
        info = "Instructor " + name + " has campus phone extension " + phoneExt + " and contact email " + contact;
        return info;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setPhoneExtension(int newPhoneExt) {
        this.phoneExt = newPhoneExt;
    }
   
    public void setEmail(String newContact) {
        this.contact = newContact;
    }

}
