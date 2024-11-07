package on.focus0147.arrays;

import java.util.*;

class RandomizedSet {
    /**
     * Должны уметь вставлять, удалять и получать рандомный с О(1).
     */

    List<Integer> arr = new ArrayList();
    Map<Integer, Integer> map = new HashMap();

    public RandomizedSet() {

    }

    public boolean insert(int val) {
        if(!map.containsKey(val)){
            arr.add(val);
            map.put(val, arr.size()-1);
            return true;
        }
        return false;
    }

    /**
     * Минимизация потерь за счет того, что в середке не удаляем,
     * а последний элемент смещаем
     */
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int idx = map.get(val);
        map.remove(val);

        int tail = arr.get(arr.size()-1);
        arr.add(idx, tail);
        map.replace(tail, idx);
        arr.remove(arr.size()-1);
        return true;
    }

    public int getRandom() {
        Random rand = new Random();
        return arr.get(rand.nextInt(arr.size()));
    }
}
