import bitmanipulation.SetOfPositiveNumbers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        SetOfPositiveNumbers obj = new SetOfPositiveNumbers();
        obj.add(34);
        obj.add(21);
        obj.add(70);
        obj.add(98);
        obj.add(127);
        obj.add(200);
        obj.add(310);
        obj.add(Integer.MAX_VALUE);

        System.out.println(1000000 * 32);

        obj.printSet();

    }
}
class RandomizedSet {

    private HashSet<Integer> set;
    public Iterator<Integer> pointer;

    public RandomizedSet() {
        set = new HashSet<>(200000);
        pointer = set.iterator();
    }

    public boolean insert(int val) {
        return set.add(val);
    }

    public boolean remove(int val) {
        return set.remove(val);
    }

    public int getRandom() {
        int index = new Random().nextInt(set.size());
        for(int num : set) {
            if(index == 0) {
                return num;
            }
            --index;
        }
        return Integer.MIN_VALUE;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */