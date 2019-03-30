package logic;

import models.ElectricApp;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Apartment {

    private static final Logger LOG = Logger.getLogger(Apartment.class);
    private List<ElectricApp> apps = new ArrayList<ElectricApp>();

    public void addApp(ElectricApp someApp) {
        apps.add(someApp);
    }

    public ElectricApp getApp(int index) {
        try {
            return apps.get(index);
        } catch (IndexOutOfBoundsException e) {
            LOG.error("Unable to get app. Array out of range");
        }
        return null;
    }

    public void removeApp(int index) {
        try {
            apps.remove(index);
        } catch (IndexOutOfBoundsException e) {
            LOG.error("Unable to delete. Array out of range");
        }
    }

    public void switchingApp(ElectricApp someApp, Boolean change) {
        someApp.setPlugged(change);
        LOG.info(someApp.getModelName() + " " + someApp.getClass() + " has been switched to " + change.toString());
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
        LOG.info("Sort by capacity has been finished");
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
        LOG.info("[" + board1 + "-" + board2 + "]" + " range search completed");
        return founded;
    }
}
