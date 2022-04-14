package HW;

import java.util.HashMap;
import java.util.Map;

public class People implements Moving {
    private String name;
    private double hundredMeterRunTime;
    private int heightJumpMeters;
    private Map<String, Boolean> result = new HashMap<>();

    public People(String name, int heightJumpMeters, double hundredMeterRunTime) {
        this.name = name;
        this.heightJumpMeters = heightJumpMeters;
        this.hundredMeterRunTime = hundredMeterRunTime;
    }

    public <T extends BaseCompetition> void setResult(T competition, boolean result) {
        this.result.put(competition.toString(), result);
    }

    public Map<String, Boolean> getResult() {
        return result;
    }

    public String getName() {
        return name;
    }

    @Override
    public int heightJump(){
        return heightJumpMeters;
    }

    @Override
    public double hundredMeterRun(){
        return hundredMeterRunTime;
    }

}
