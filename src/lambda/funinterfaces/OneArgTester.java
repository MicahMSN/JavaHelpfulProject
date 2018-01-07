package lambda.funinterfaces;

@FunctionalInterface
public interface OneArgTester<T> {
    T test(T t);
}
