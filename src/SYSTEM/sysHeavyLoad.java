package SYSTEM;

import java.util.Arrays;

public class sysHeavyLoad {
    public static int $SYS(String number, String type) {
        int sum = 0;
        char[] array = number.toCharArray();
        sum = summation(array, type);
        return sum;
    }

    public static int $SYS(int number, String type) {
        int sum = 0;
        char[] array = String.valueOf(number).toCharArray();
        sum = summation(array, type);
        return sum;
    }

    /**
     * 返回次方值
     */
    public static int power(int a, int b) {
        int power = 1;
        for (int c = 0; c < b; c++)
            power *= a;
        return power;
    }

    /**
     *判断类型并将转换结果返回
     */
    public static int summation(char[] array, String type) {
        int m = 0;
        int sum = 0;
        //二进制
        if ("0b".equals(type) || "0B".equals(type)) {
            m = 2;
        }
        //八进制
        if ("0".equals(type)) {
            m = 8;
        }
        //十六进制
        if ("0x".equals(type) || "0X".equals(type)) {
            m = 16;
        }
        for (int i = 0; i < array.length; i++) {
            sum = sum + (array[i] - '0') * power(m, array.length - i - 1);
        }
        return sum;
    }
}
