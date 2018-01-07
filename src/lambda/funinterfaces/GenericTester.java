package lambda.funinterfaces;

@FunctionalInterface
public interface GenericTester<R,T> {
    R test(T t);
}
