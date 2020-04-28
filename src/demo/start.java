package demo;

import java.io.Serializable;
import java.util.Arrays;

public class start {
    public static void main(String[] args) {
        movement movement = new movement();
        heavyLoad heavyLoad = new heavyLoad();
        movement.eat("白菜");
        movement.people("小明", "男生", 18);
        movement.work("拧螺丝");
        movement.sleep(8);
        movement.newEat(10);
        movement.HHH();
        heavyLoad.comm(1, 3);
        heavyLoad.comm("1", 3);
        movement.maxomin(9, 2, 5, 9, 8, 6, 9, 8, 7, 8, 5, 7, 9);
        int[] arrayList = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Arrays.sort(arrayList);
        for (int i : arrayList){
            System.out.println(i);
        }
        System.out.println(dichotomy(900, arrayList));
    }

    /*二分法*/
    public static Serializable dichotomy(int key, int[] list) {
        int start = 0;
        int end = list.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (key < list[middle]) {
                end = middle - 1;
            } else if (key > list[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return "-1";
    }
}
