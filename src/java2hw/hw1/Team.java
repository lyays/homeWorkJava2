package java2hw.hw1;

public class Team {
    private String teamName;
    TeamMember[] teamMembers;

    public Team() {

    }

    public Team (String teamName, TeamMember[] teamMembers) {
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public void showTeam() {
        for (int i = 0; i < teamMembers.length; i++){
            System.out.println(teamMembers[i]);
        }

    }

    public void showPassTeam () {
        for (int i = 0; i < teamMembers.length; i++) {
            if (teamMembers[i].getPassed() == true) {
                System.out.println(teamMembers[i]);
            }
        }

    }
}
