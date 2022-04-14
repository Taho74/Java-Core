package HW;


public class Main {
    public static void main(String[] args) {

        ObstacleCourse obstacleCourse = new ObstacleCourse(new HundredMeterRun(8), new HeightJumpMeters(9));


        Team team = new Team("Команда 1",
                new People("Вася", 600,3),
                new People("Петя", 665,6),
                new People("Александр", 550,7),
                new People("Евгений", 700,8));
        Team team2 = new Team("Команда 2",
                new People("Дмитрий", 700,2),
                new People("Никита", 800,8),
                new People("Кирилл", 1000,9),
                new People("Геннадий", 300,7)
        );

        obstacleCourse.doIt(team);
        team.getResult();
        obstacleCourse.doIt(team2);
        team2.getResult();
    }
}
