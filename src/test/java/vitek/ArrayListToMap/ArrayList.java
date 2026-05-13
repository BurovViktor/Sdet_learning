package vitek.ArrayListToMap;

import java.util.HashMap;

public class ArrayList {

    public static void main(String[] args) {
        String[] arrayForMapping =
                {"Один", "Хуйло", "Два", "Лошье", "Три", "Скелет", "Четыре", "Ахуенный", "Пять", "Салют"};
        HashMap<String, String> mapForValueFromArray = new HashMap<>();

        for (int i = 0; i < arrayForMapping.length; i+=2) {
            mapForValueFromArray.put(arrayForMapping[i] + "Ключ", arrayForMapping[i + 1] + "Значение");
        }

        System.out.println(mapForValueFromArray);
    }
}
