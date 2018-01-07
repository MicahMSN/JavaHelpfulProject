package lambda;

public class GenericConstructorReferenceExample {

    public static void main(String[] args) {
        GenericConstructorReferenceTester<Integer> laCreator = GenSubject<Integer>::new;
        GenSubject<Integer> gs = laCreator.test(105);
        System.out.println(gs.getT());
    }

    public interface GenericConstructorReferenceTester<T> {
        GenSubject<T> test(T t);
    }

    public static class GenSubject<T> {
        private T value;

        public GenSubject(T value) {
            this.value = value;
        }

        public GenSubject() {
            value = null;
        }

        public T getT() {
            return value;
        }
    }
}
