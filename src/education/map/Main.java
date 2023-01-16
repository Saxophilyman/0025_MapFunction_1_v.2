package education.map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(10) + 1);
        }
        repeatNCountValueInList(list, random.nextInt(10) + 1);
    }

    public static List<Integer> repeatNCountValueInList(List<Integer> currentList, int nCount) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer in : currentList) {
            map.put(in, map.getOrDefault(in, 0) + 1);
            if (map.get(in) == nCount) {
                newList.add(in);
            }
        }
        return newList;

    }
}
