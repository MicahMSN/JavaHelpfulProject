package lambda;

public class ConstructorReferenceExample {

    public static void main(String[] args) {
        SubjectConstructorTester laCreater = SubjectClass::new;
        SubjectClass ex = laCreater.test(100);
        System.out.println(ex.toString());
    }

    public static class SubjectClass{
        private int number;
        public SubjectClass() {
            this.number = 1_010_010;
        }
        public SubjectClass(int number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "SubjectClass{" +
                    "number=" + number +
                    '}';
        }
    }

    @FunctionalInterface
    public interface SubjectConstructorTester {
        SubjectClass test(int n);
    }
}

