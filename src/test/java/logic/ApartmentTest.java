package logic;

import models.ElectricApp;
import models.Fridge;
import models.Teapot;
import models.Tv;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ApartmentTest {
    Apartment apartment = new Apartment();
    List<ElectricApp> someapps = new ArrayList<ElectricApp>();

    @Before
    public void setTestApps() {
        someapps.add(new Fridge("someFridge", 220.0, false));
        someapps.add(new Tv("someTv", 500.0, true));
        someapps.add(new Teapot("someTeapot", 120.0, true));
    }

    @Test
    public void setAndGetApp() {
        apartment.addApp(someapps.get(1));
        Assert.assertEquals(apartment.getApp(0), someapps.get(1));
    }

    @Test
    public void setAndRemoveApp() {
        apartment.addApp(someapps.get(0));
        apartment.removeApp(0);
    }

    @Test
    public void switchingApp() {
        ElectricApp someFridge = new Fridge("someFridge", 220.0, false);
        apartment.switchingApp(someFridge, true);
        Assert.assertEquals(someFridge.isPlugged(), true);
    }

    @Test
    public void getAllCapacity() {
        Assert.assertEquals(apartment.getAllCapacity(someapps), 840.0, 0);
    }

    @Test
    public void sortByCapacity() {
        apartment.sortByCapacity(someapps);
        Assert.assertEquals(someapps.get(0).getModelName(), "someTeapot");
    }

    @Test
    public void searchByRange() {
        List<ElectricApp> check = apartment.searchByRange(someapps, 300, 500);
        Assert.assertEquals(check.get(0).getModelName(), "someTv");
        Assert.assertEquals(check.size(), 1);
    }

    @Test
    public void searchByRangeTestSize() {
        List<ElectricApp> check = apartment.searchByRange(someapps, 300, 500);
        Assert.assertEquals(check.size(), 1);
    }
}
