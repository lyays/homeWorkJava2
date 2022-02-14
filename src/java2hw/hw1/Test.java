package java2hw.hw1;

public class Test {
    public static void main(String[] args){
       TeamMember[] teamMembers = new TeamMember[4];
       teamMembers[0] = new TeamMember("Ivan",30);   //создаем членов команды
       teamMembers[1] = new TeamMember("Petr",40);
       teamMembers[2] = new TeamMember("Kolya",50);
       teamMembers[3] = new TeamMember("Pavel",60);

        Team team = new Team ("Alfa",teamMembers);    //создаем команду

        Course course = new Course();  //создаем препятствие

        course.doIt(team);  //прошли препятствие
        team.showPassTeam();  //показать тех кто прошли препятствие

    }



}
