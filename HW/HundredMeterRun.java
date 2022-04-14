package HW;

import HW.Team;
import HW.People;

public class HundredMeterRun extends BaseCompetition {
    private double time;

    public HundredMeterRun(double time) {
        this.time = time;
    }

    @Override
    public void doIt(Team team) {
        for (People people : team.getPeoples()) {
            if (people.hundredMeterRun() >= time) {
                people.setResult(this,true);
            } else {
                people.setResult(this, false);
            }
        }
    }

    @Override
    public String toString() {
        return "Соревнавания по бегу";
    }
}
