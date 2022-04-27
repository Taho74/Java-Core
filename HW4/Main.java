package HW4;

import java.util.*;


public class Main {

    public static void main(String[] args) {
            Map<String, Integer> ww = new HashMap<>();
            String[] words = {
                    "Moscow", "Berlin", "Deli",
                    "Paris", "Dubai", "London",
                    "Milan", "Amsterdam", "Lissabon",
                    "Brusel", "Varshava", "Kiev",
                    "Pekin", "Deli", "Brusel",
                    "Moscow", "Dubai", "Moscow", "Berlin"
            };

            for (int i = 0; i < words.length; i++) {
                if (ww.containsKey(words[i]))
                    ww.put(words[i], ww.get(words[i]) + 1);
                else
                    ww.put(words[i], 1);
            }
            System.out.println(ww);


        PhoneBook pb  = new PhoneBook();

        pb.add("Королев", "89164561127");
        pb.add("Николаев", "89164567700");
        pb.add("Сидоров", "89164566655");
        pb.add("Иванов", "89164560021");
        pb.add("Петров", "89164561300");

        System.out.println(pb.get("Королев"));
        System.out.println(pb.get("Николаев"));

    }

}

