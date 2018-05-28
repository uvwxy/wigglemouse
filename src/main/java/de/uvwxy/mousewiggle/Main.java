package de.uvwxy.mousewiggle;

import java.awt.*;

public class Main {

    public static void main(String[] args) throws Exception {
        int delay = 500;
        try {
            delay = Integer.parseInt(args[0]);
        } catch (Exception e) {
            // NOP
        }
        Robot hal = new Robot();
        boolean up = true;
        while (true) {
            hal.delay(delay);
            Point p = MouseInfo.getPointerInfo().getLocation();
            hal.mouseMove(p.x, p.y + (up ? 1 : -1));
            up = !up;
        }
    }
}