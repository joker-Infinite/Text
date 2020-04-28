package array;

import java.util.Arrays;

public class arrayList {
    public static void main(String[] args) {

        //元素类型为int的数组默认值为0
        int[] intArray = new int[5];
        System.out.println(toStr(intArray, null));

        //元素类型除int之外的数组默认值为null
        String[] strArray = new String[5];
        System.out.println(toStr(null, strArray));

        //定义一个数组并指定数组长度，动态定义
        int[] array = new int[5];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        System.out.println(toStr(array, null));

        //直接初始化数组内容
        String[] array2 = {"0", "1", "2"};
        System.out.println(toStr(null, array2));

        //分配内存空间的同时初始化
        String[] array3 = new String[]{"0", "1", "2", "3"};
        System.out.println(toStr(null, array3));

        //数组遍历,for循环
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

        //数组遍历,for each
        for (String item : array3) {
            System.out.println(item);
        }

        //查看数组,Arrays.toString()
        System.out.println(Arrays.toString(array3));

        //计算数组的最大值
        int[] array4 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = array4[0];
        for (int i = 0; i < array4.length; i++) {
            if (max < array4[i]) {
                max = array4[i];
            }
        }
        System.out.println(max);

        //计算数组的最小值
        int min = array4[0];
        for (int i = 0; i < array4.length; i++) {
            if (min > array4[i]) {
                min = array4[i];
            }
        }
        System.out.println(min);

        //计算数组之和
        int sum = 0;
        for (int i = 0; i < array4.length; i++) {
            sum += array4[i];
        }
        System.out.println(sum);

        //数组反转
        int[] newArr = new int[array4.length];
        for (int i = 0; i < array4.length; i++) {
            newArr[i] = array4[array4.length - i - 1];
        }
        System.out.println(toStr(newArr, null));

        //1-100的和
        int num = 0;
        for (int i = 0; i <= 100; i++) {
            num += i;
        }
        System.out.println(num);
    }

    public static String toStr(int[] val, String[] str) {
        if (val != null) {
            return Arrays.toString(val);
        }
        return Arrays.toString(str);
    }
}
