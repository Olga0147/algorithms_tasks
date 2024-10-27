package on.focus0147.interfaces;

/**
 * Задачка на одинаковый дефолтный метод нескольких интерфейсов
 */
public class SameDefaultMethod {
    public static void main( String[] args ) {
        A ab = new ABImpl();
        ab.run();
        C c = new CImpl();
        c.run();
    }

    public interface A {
        default void run(){
            System.out.println("A");
        }
    }

    public interface B {
        default void run(){
            System.out.println("B");
        }
    }

    public interface C extends A, B {
        @Override
        default void run() {
            System.out.println("C");
        }
    }

    public static class ABImpl implements A, B {
        @Override
        public void run() {
            System.out.println("ABImpl");
        }
    }

    public static class CImpl implements C {
        @Override
        public void run() {
            System.out.println("Cimpl");
        }
    }
}
