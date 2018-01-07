package lambda.funinterfaces;

import lambda.laexceptions.EmptyArrException;

@FunctionalInterface
public interface DoubleDoubleArrayTesterWithThrowing {
    double test(double[] n) throws EmptyArrException;
}
