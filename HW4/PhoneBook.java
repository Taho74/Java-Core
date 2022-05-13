package HW4;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> PB = new HashMap<>();
    private List<String> number_list;

    public void add(String surname, String phone_number) {
        if (PB.containsKey(surname)) {
            number_list = PB.get(surname);
            number_list.add(phone_number);
            PB.put(surname, number_list);
        } else {
            number_list = new ArrayList<>();
            number_list.add(phone_number);
            PB.put(surname, number_list);
        }
    }

    public List<String> get(String surname) {
        return PB.get(surname);
    }
}
