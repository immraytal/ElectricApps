package logic;

import models.ElectricApp;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Apartment {

    private static final Logger log = Logger.getLogger(Apartment.class);
    private List<ElectricApp> apps = new ArrayList<ElectricApp>();

    public void switchingApp(ElectricApp someApp, Boolean change) {
        someApp.setConnect(change);
        log.info(someApp.getModelName() + " " + someApp.getClassName() + " has been switched to " + change.toString());
    }

    public double getAllCapacity(List<ElectricApp> inputApps) {
        double sum = 0.0;
        for (ElectricApp electricApp : inputApps) {
            sum += electricApp.getCapacity();
        }
        return sum;
    }

    public void sortByCapacity(List<ElectricApp> inputsApps) {
        inputsApps.sort(Comparator.comparing(ElectricApp::getCapacity));
        log.info("Sort by capacity has been finished");
    }

    public List<ElectricApp> searchByRange(List<ElectricApp> inputApps, double board1, double board2) {
        List<ElectricApp> founded = new ArrayList<>();
        if (board2 < board1) {
            double temp = board1;
            board1 = board2;
            board2 = temp;
        }
        for (ElectricApp electricApp : inputApps) {
            if (electricApp.getCapacity() >= board1 && electricApp.getCapacity() <= board2) {
                founded.add(electricApp);
            }
        }
        log.info("[" + board1 + "-" + board2 + "]" + " range search completed");
        return founded;
    }
}
