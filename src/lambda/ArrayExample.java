package lambda;

import lambda.funinterfaces.ArrayCreator;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayCreator<Subject> arrayCreator = Subject::new;
        Subject s = arrayCreator.createArray(15);
        for (int i = 0; i < s.array.length; i++) {
            s.array[i] = i + i;
        }
        System.out.println(Arrays.toString(s.array));
    }
    static class Subject<T> {
        int[] array;
        public Subject() {
        }
        public Subject(int n) {
            this.array = new int[n];
        }
    }
}
