package logic;

import models.ElectricApp;
import org.apache.log4j.Logger;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Apartment {

    private static final Logger log = Logger.getLogger(Apartment.class);
    private List<ElectricApp> apps = new ArrayList<ElectricApp>();

    public void switchingApp(ElectricApp someApp ,Boolean change){
        someApp.setConnect(change);
        log.info(someApp.getModelName() + " "+ someApp.getClassName() +" has been switched to " + change.toString());
    }

    public double getAllCapacity(List<ElectricApp> inputApps){
        double sum=0.0;
        for(ElectricApp electricApp : inputApps)
        {
            sum+=electricApp.getCapacity();
        }
        return sum;
    }

    public void sortByCapacity(List<ElectricApp> inputsApps){
        inputsApps.sort(Comparator.comparing(ElectricApp::getCapacity));
        log.info(inputsApps.toString());
    }
}
