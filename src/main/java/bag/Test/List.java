package bag.Test;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[2] = 5;
        ArrayList a = new ArrayList();
        a.add("Mini");
        Integer n = new Integer(13); //Integer n = 13;
        Boolean b = new Boolean(false);
        Character c = new Character('g');
        Short s = new Short(" s1");
        Long l = new Long("12345678910");
        String st = new String("string");
        Double d = new Double(12.3654897);
        Float f = new Float(12.2);
        a.add(n);
        a.add(b);
        a.add(c);
        a.add(s);
        a.add(l);
        a.add(st);
        a.add(d);
        a.add(f);
        a.add(true);
        a.add(31);
        Box1 box1 = new Box1();
        a.add(box1);
        System.out.println(nums);
    }
}
