package on.focus0147.strings;

/**
 * Задачка на пулл строк.
 */
public class StrEquality {

    /**
     *  В пулл строк вносятся только те строки, которые указаны литералами без конструкторов.
     *  В пулл строк можно внести специально с помощью  String.intern
     *
     *  Пулл расположен в  runtime constant pool области в Heap
     */

    public static void main( String[] args ) {
        String str1 = "HelloWorld";
        String temp = "World";

        String str2 = "Hello" + "World";
        String str3 = "Hello" + temp;
        String str4 = new String("HelloWorld");

        String str3intern = ("Hello" + temp).intern();
        String str4intern = new String("HelloWorld").intern();

        System.out.println("hashCode");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        System.out.println(str3intern.hashCode());
        System.out.println(str4intern.hashCode());

        System.out.println();
        System.out.println("identityHashCode");
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
        System.out.println(System.identityHashCode(str3intern));
        System.out.println(System.identityHashCode(str4intern));

        System.out.println();
        System.out.println("str1==");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
        System.out.println(str1 == str3intern);
        System.out.println(str1 == str4intern);
    }
}
