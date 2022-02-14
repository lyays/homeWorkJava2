package java2hw.hw1;

public class Course {
    private int weightLifting = 50;


    public Course() {

    }

    public void doIt(Team t) {
        for (int i = 0; i < t.teamMembers.length; i++) {
            if (t.teamMembers[i].getPower() >= weightLifting) {
                t.teamMembers[i].setPassed(true);
            }
        }
    }

    public int getWeightLifting() {
        return weightLifting;
    }


}
