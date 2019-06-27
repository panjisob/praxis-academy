package kasus;

import org.junit.Test;

import kasus.Bicycle;

import static org.junit.Assert.*;

public class BicycleTest {
    @Test public void tesAjah() {
        Bicycle classBicycleTest = new Bicycle();
        assertNotNull("app should have a greeting", classBicycleTest);
    }
}