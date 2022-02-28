package lab9.dataprocessing;

import lab9.storage.DataRepository;

import static lab9.main.Utils.BASIC_STRATEGY;
import static lab9.main.Utils.FILTERED_STRATEGY;

public class StepCountStrategyFactory {
    public StepCountStrategy createStrategy(String strategyType, DataRepository dataRepository) {
        if (strategyType.compareTo(BASIC_STRATEGY) == 0) {
            return new BasicStepCountStrategy(dataRepository.getData());
        }
        if (strategyType.compareTo(FILTERED_STRATEGY) == 0) {
            return new FilteredStepCountStrategy(dataRepository.getData());
        }
        return null;
    }
}
