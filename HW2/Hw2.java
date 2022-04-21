package HW2;
import java.util.Arrays;

public class Hw2 {

    public static int str(String[][] array) throws MyArraySizeException, MyDataSizeException {
        int count = 0;
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        count = count + Integer.parseInt(array[i][j]);
                    }
                    catch (NumberFormatException e) {
                        throw new MyDataSizeException(i, j);
                    }
                }
        }

        return count;
    }

    public static void main(String[] args) throws MyArraySizeException, MyDataSizeException {
        String[][] array = {{"5", "2", "6", "3"}, {"6", "1", "4", "4"}, {"1", "1", "h", "2"}, {"5", "6", "3", "3"}};

        try {
            try {
                int result = str(array);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Неверный формат массива");
            }
        }
        catch (MyDataSizeException e) {
            System.out.println("Неверный формат массива");
            System.out.println("Ошибка в ячейке: " + e.i + " " + e.j);
        }


    }
}

