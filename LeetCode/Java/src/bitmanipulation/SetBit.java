package bitmanipulation;

public class SetBit {
    private int set;

    public SetBit() {
        this.set = 0;
    }

    public void printSet() {
        for(int i = 0; i < 32; ++i) {
            int isPresent = set & (1 << i);
            if(isPresent != 0) {
                System.out.println(i);
            }
        }
    }

    public void insert(int val) {
        set = set | (1 << val);
    }

    public boolean contains(int val) {
        int isPresent = set & (1 << val);
        return isPresent != 0;
    }

    public void remove(int val) {
        set = set & (~(1 << val));
    }


}
