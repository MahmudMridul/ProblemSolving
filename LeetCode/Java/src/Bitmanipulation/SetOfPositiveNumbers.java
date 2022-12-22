package Bitmanipulation;

import java.util.Arrays;

public class SetOfPositiveNumbers {
    private int set[];
    private int capacity;

    public SetOfPositiveNumbers() {
        set = new int[10];
        capacity = 300;
    }

    public SetOfPositiveNumbers(int capacity) {
        set = new int[(int)Math.ceil(capacity / 31.0)];
        this.capacity = capacity;
    }

    public void printSet() {
        for(int index = 0; index < set.length; ++index) {
            int number = set[index];
            for(int bit = 0; bit < 32; ++bit) {
                int isPresent = number & (1 << bit);
                if(isPresent != 0) {
                    System.out.println(bit + (32 * index));
                }
            }
        }
    }

    public boolean add(int val) {
        if(val > capacity && capacity * 2 < Integer.MAX_VALUE) {
            capacity *= 2;
            int copy[] = Arrays.copyOf(set, (int)Math.ceil(capacity / 31.0));
            set = copy;
        }
        if(!validNumber(val)) {
            return false;
        }
        if(contains(val)) {
            return false;
        }

        int index = val / 32;
        int shift = val - (32 * index);
        set[index] = set[index] | (1 << shift);
        return true;
    }

    public boolean contains(int val) {
        if(!validNumber(val)) {
            return false;
        }

        int index = val / 32;
        int shift = val - (32 * index);
        int isPresent = set[index] & (1 << shift);
        return isPresent != 0;
    }

    public boolean remove(int val) {
        if(!validNumber(val)) {
            return false;
        }
        if(!contains(val)) {
            return false;
        }

        int index = val / 32;
        int shift = val - (32 * index);
        set[index] = set[index] & (~(1 << shift));
        return true;
    }

    private boolean validNumber(int val) {
        if(val < 0) return false;
        if(val / 32 >= set.length) return false;
        return true;
    }

}
