package lambda.funinterfaces;

@FunctionalInterface
public interface ArrayCreator<T> {
    T createArray(int param);
}
