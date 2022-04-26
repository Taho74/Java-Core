package HW3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Задача 1
        Integer arr1[] = {1, 2, 3, 4, 5};
        swap(arr1,1,4);


        //Задача 2
        Box<Orange> ob = new Box<>();
        Box<Orange> ob2 = new Box<>();
        Box<Apple> ab = new Box<>();
        Box<Apple> ab2 = new Box<>();

        ob.addFruit(new Orange(),6);
        ob2.addFruit(new Orange(),7);
        ab.addFruit(new Apple(),5);
        ab2.addFruit(new Apple(),2);


        System.out.println("Box 1: " + ob.getWeight());
        System.out.println("Box 2: " + ob2.getWeight());
        System.out.println("Box 3: " + ab.getWeight());
        System.out.println("Box 4: " + ab2.getWeight());

        System.out.println("Box 1 equals box 3: " + ob.compare(ab));
        System.out.println("Box 2 equals box 4: " + ob2.compare(ab2));

        ob.putMore(ob2);
        ab.putMore(ab2);

        System.out.println("Box 1: " + ob.getWeight());
        System.out.println("Box 2: " + ob2.getWeight());
        System.out.println("Box 3: " + ab.getWeight());
        System.out.println("Box 4: " + ab2.getWeight());

    }

        //Задача 1
    public static void swap(Object[] arr, int n1, int n2){
        System.out.println(Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println(Arrays.toString(arr));
    }

}
