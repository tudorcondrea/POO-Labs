package lab9.main;

import lab9.dataprocessing.BasicStepCountStrategy;
import lab9.dataprocessing.StepCountStrategy;
import lab9.dataprocessing.StepCountStrategyFactory;
import lab9.storage.*;

import javax.xml.crypto.Data;
import java.util.Collections;
import java.util.Scanner;

import static lab9.main.Utils.BASIC_STRATEGY;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Choose a strategy: type 'basic or 'filtered");
        Scanner scanner = new Scanner(System.in);
        String strategyType = scanner.next();
        scanner.close();

        DataRepository dataRepository = new DataRepository();
        // TODO: use the StepCountStrategyFactory to create a strategy
        StepCountStrategy strategy = new StepCountStrategyFactory().createStrategy(strategyType, dataRepository);
        // TODO: add observers to the dataRepository
        // don't forget to provide the strategy to the DataAggregator observer

        long baseTimestamp = System.currentTimeMillis();
        ConsoleLogger logger = new ConsoleLogger();
        DataAggregator aggregator = new DataAggregator(strategy);
        ServerCommunicationController controller = new ServerCommunicationController();
        dataRepository.addData(new SensorData(10, baseTimestamp + 1));
        logger.update(dataRepository, dataRepository.getData().get(0));

        dataRepository.addData(new SensorData(20, baseTimestamp + 2));
        controller.update(dataRepository, dataRepository.getData().get(1));

        dataRepository.addData(new SensorData(30, baseTimestamp + 3));
        aggregator.update(dataRepository, dataRepository.getData());

        // TODO: after the first successful run, change this to baseTimestamp + 40000 and check the result
        dataRepository.addData(new SensorData(4000, baseTimestamp + 4));
        logger.update(dataRepository, dataRepository.getData().get(3));

        dataRepository.addData(new SensorData(50, baseTimestamp + 5));
        controller.update(dataRepository, dataRepository.getData().get(4));

        dataRepository.addData(new SensorData(-100, baseTimestamp + 6));
        aggregator.update(dataRepository, dataRepository.getData());

        dataRepository.addData(new SensorData(500, baseTimestamp + 600));
        aggregator.update(dataRepository, dataRepository.getData());
    }
}
