package HW;

public class Team {

    private String name;
    private People[] peoples;

    public Team(String name, People... peoples) {
        this.peoples = peoples;
        this.name = name;
    }

    public void getResult () {
        for (People people : peoples)
        System.out.println("Участники, которые прошли дистанцию: " + people.getName() + " " + people.getResult());
    }

    public People[] getPeoples() {
        return peoples;
    }


}
