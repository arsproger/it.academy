package practice.FreeCode;

import java.util.ArrayList;

public class Task30 {
    public static void main(String[] args) {
        HeavyBox heavyBox1 = new HeavyBox();
        HeavyBox heavyBox2 = new HeavyBox();
        HeavyBox heavyBox3 = new HeavyBox();
        HeavyBox heavyBox4 = new HeavyBox();
        HeavyBox heavyBox5 = new HeavyBox();
        heavyBox1.weigth = 5.7;
        heavyBox2.weigth = 7.3;
        heavyBox3.weigth = 9.1;
        heavyBox4.weigth = 1.3;
        heavyBox5.weigth = 8.5;

        ArrayList<HeavyBox> arrayList = new ArrayList<>();
        arrayList.add(heavyBox1);
        arrayList.add(heavyBox2);
        arrayList.add(heavyBox3);
        arrayList.add(heavyBox4);
        arrayList.add(heavyBox5);
        System.out.println(arrayList);
        arrayList.remove(4);
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);
    }
}
class HeavyBox {
    double weigth;

    @Override
    public String toString() {
        return "HeavyBox {" +
                "weigth=" + weigth +
                '}';
    }
}
