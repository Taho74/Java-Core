package HW2;

public class MyDataSizeException extends Exception{

    private static String str2 = "MyDataSizeException";
    public int i;
    public int j;

    public MyDataSizeException () {
        super(str2);
    }

    public MyDataSizeException (String s) {
        super(s);
    }

    public MyDataSizeException(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
