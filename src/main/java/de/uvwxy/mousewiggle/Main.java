package de.uvwxy.mousewiggle;

import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Robot hal = new Robot();
        boolean up = true;
        while (true) {
            hal.delay(1000);
            Point p = MouseInfo.getPointerInfo().getLocation();
            hal.mouseMove(p.x, p.y + (up ? 1 : -1));
            up = !up;
        }
    }
}