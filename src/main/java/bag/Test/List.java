package bag.Test;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[2] = 5;
        ArrayList a = new ArrayList();
        a.add("Mini");
        a.add(true);
        a.add(31);
        Box1 box1 = new Box1();
        a.add(box1);
    }
}
