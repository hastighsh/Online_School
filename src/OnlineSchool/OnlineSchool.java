package OnlineSchool;

public class OnlineSchool {

    public Participant[] participants;
    public int count;


    public OnlineSchool() {
        participants = new Participant[100];
        this.count = 0;
    }

    public Participant[] getParticipants(String course) {
        int num = 0;

        for (int i = 0; i < count; i++){
            for (int j = 0; j < participants[i].getRegistrations().length; j++){
                if (participants[i].getRegistrations()[j].getTitle().equals( course)) {
                    num++;
                }
            }
        }
        Participant[] temp = new Participant[num];
        num=0;
        for (int i = 0; i < count; i++){
            for (int j = 0; j < participants[i].getRegistrations().length; j++){
                if (participants[i].getRegistrations()[j].getTitle().equals( course)) {
                    temp[num] = participants[i];
                    num++;
                }
            }
        }
        return temp;
    }


    public void addParticipant(Participant participant) {
        participants[count] = participant;
        count++;
    }
}
