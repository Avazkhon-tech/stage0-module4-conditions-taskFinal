package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean isValid =
                secondSide + thirdSide > firstSide &&
                        firstSide + thirdSide > secondSide &&
                        firstSide + secondSide > thirdSide;
        System.out.println(isValid? "this is a valid triangle": "it's not a triangle");

    }
}
