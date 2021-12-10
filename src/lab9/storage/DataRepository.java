package lab9.storage;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Persists sensor data. Observable, its observers are notified when data is added it to.
 */
public class DataRepository extends Observable { // TODO make this an Observable
    private List<SensorData> dataList;

    public DataRepository() {
        this.dataList = new ArrayList<>();
    }

    public void addData(SensorData dataRecord){
        dataList.add(dataRecord);
    }

    // TODO implement a method to get the stored data (needed by the strategies)

    public List<SensorData> getData() {
        return dataList;
    }
}


