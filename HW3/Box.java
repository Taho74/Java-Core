package HW3;

import java.util.ArrayList;

public class Box <T extends Fruit> {

    private ArrayList<T> box = new ArrayList<>();

    public Box() {

    }

    public float getWeight(){
        float weight = 0.0f;
        for(T a : box){
            weight += a.getWeight();
        }
        return weight;
    }

    public boolean compare(Box anotherBox) {
        if(getWeight() == anotherBox.getWeight()) {
            return true;
        } else {
            return false;
        }
    }

    public void putMore(Box <T>anotherBox){
        anotherBox.box.addAll(box);
        box.clear();
    }

    public void addFruit(T fruit, int amount){
        for(int i=0;i<amount;i++){
            box.add(fruit);
        }
    }


}
