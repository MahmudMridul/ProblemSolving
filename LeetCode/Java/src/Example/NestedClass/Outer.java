package Example.NestedClass;

import java.util.ArrayList;

public class Outer {

    private ArrayList<Pair> pairList;

    public Outer() {
        pairList = new ArrayList<>(20);
    }

    public void insertPair(int first, int second) {
        pairList.add(new Pair(first, second));
    }

    public void showPairList() {
        for(Pair p : pairList) {
            System.out.println("{" + p.first + " " + p.second + "}");
        }
    }

    private class Pair {
        private int first;
        private int second;
        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }
    }
}