package HW;

import HW.People;
import HW.Team;

public class HeightJumpMeters extends BaseCompetition {

    private int height;

    public HeightJumpMeters(int height) {
        this.height = height;
    }

    @Override
    public void doIt (Team team) {
        for(People people : team.getPeoples()){
            if (people.heightJump() >= height) {
                people.setResult(this, false);
            }else {
                people.setResult(this, false);
            }
        }
    }

    @Override
    public String toString(){
        return "Прыжки в высоту";
    }
}
