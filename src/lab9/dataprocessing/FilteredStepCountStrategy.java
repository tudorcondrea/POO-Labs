package lab9.dataprocessing;

import lab9.storage.SensorData;

import java.util.List;

public class FilteredStepCountStrategy implements StepCountStrategy{
    private List<SensorData> sensorData;

    public FilteredStepCountStrategy(List<SensorData> sensorData) {
        this.sensorData = sensorData;
    }


    @Override
    public int getTotalSteps() {
        return sensorData.stream().filter(sensorData -> sensorData.getStepsCount() > 0 && sensorData.getStepsCount() / sensorData.getTimestamp() < 50/3).map(SensorData::getStepsCount).reduce(0, Integer::sum);
    }

    @Override
    public String getStrategyDescription() {
        return "Sums all non-negative steps";
    }
}
