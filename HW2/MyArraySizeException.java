package HW2;

public class MyArraySizeException extends Exception {

    private static String str1 = "Неверный формат массива";

    public MyArraySizeException () {
        super(str1);
    }

    public MyArraySizeException (String s) {
        super(s);
    }

}
