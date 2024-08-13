package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {

        if (x > 0 && y > 0) {
            System.out.println("first");
            return;
        }

        if (x < 0 && y > 0) {
            System.out.println("second");
            return;

        }

        if (x < 0 && y < 0) {
            System.out.println("third");
            return;
        }

        if (x > 0 && y < 0) {
            System.out.println("fourth");
            return;
        }

        if (x == 0 && y == 0) {
            System.out.println("zero");
        }


    }
}
