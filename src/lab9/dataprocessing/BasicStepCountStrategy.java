package lab9.dataprocessing;

import lab9.storage.SensorData;

import java.util.List;

public class BasicStepCountStrategy implements StepCountStrategy{
    private List<SensorData> sensorData;

    public BasicStepCountStrategy(List<SensorData> sensorData) {
        this.sensorData = sensorData;
    }

    @Override
    public int getTotalSteps() {
        return sensorData.stream().map(SensorData::getStepsCount).reduce(0, Integer::sum);
    }

    @Override
    public String getStrategyDescription() {
        return "Sums all steps";
    }
}
