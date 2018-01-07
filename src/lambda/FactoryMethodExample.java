package lambda;

import lambda.funinterfaces.GenericTester;

public class FactoryMethodExample {

    public static <R,T> R simpleGenSubjectFactoryMethod(GenericTester<R,T> creator, T value){
        return creator.test(value);
    }

    public static void main(String[] args) {
        GenericTester<SimpleGenSubject<String>, String> laCreator = SimpleGenSubject::new;

        SimpleGenSubject<String> ex1 = laCreator.test("Simple Name");
        System.out.println(ex1.getParam());

        SimpleGenSubject<String> ex2 = simpleGenSubjectFactoryMethod(laCreator, "Factory method created");
        System.out.println(ex2.getParam());

    }

    public static class SimpleGenSubject<T> {
        private T param;

        public SimpleGenSubject(T param) {
            this.param = param;
        }

        public T getParam() {
            return param;
        }
    }
}
