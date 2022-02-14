package java2hw.hw1;

public class TeamMember {
    private String name;
    private int power;
    private boolean passed = false;

    public TeamMember () {

    }

    public TeamMember (String name, int power) {
        this.name = name;
        this.power = power;
    }

    public void setPassed (boolean passed) {
        this.passed = passed;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "TeamMember{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", passed=" + passed +
                '}';
    }

    public boolean getPassed () {
        return passed;
    }
}
