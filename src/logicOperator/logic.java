package logicOperator;

public class logic {
    public static void main(String[] args) {
        /**
         * 逻辑运算符：&，|，^，!，&&，||
         *
         * 特点：逻辑运算符一般用于连接boolean类型的表达式或值。
         * 表达式：运算符把常量或变量连接起来的符合java语法的式子
         * 算数表达式：A+B
         * 比较表达式：A==B
         * */
        /**
         * 结论：
         * &逻辑与：有false则false
         * |逻辑或：有true则true
         * ^逻辑异或：相同为false，不同为true
         * !逻辑非：非false则true，非true则false
         * 特点：偶数个逻辑非不改变本身，奇数个取反
         * &&逻辑双与：当前一个条件结果为false时产生短路不执行后面的比较
         * ||逻辑双或：当前一个条件结果为true时产生短路不执行后面的比较
         * */
        System.out.println(false & false);
        System.out.println(false & true);
        System.out.println(true & false);
        System.out.println(true & true);
        System.out.println("----------------------");
        System.out.println(false | false);
        System.out.println(false | true);
        System.out.println(true | false);
        System.out.println(true | true);
        System.out.println("----------------------");
        System.out.println(false ^ false);
        System.out.println(false ^ true);
        System.out.println(true ^ false);
        System.out.println(true ^ true);
        System.out.println("----------------------");
        System.out.println(!false);
        System.out.println(!true);
        System.out.println("----------------------");
        int i = 1;
        int j = 2;
        System.out.println(++i == 1 && ++j == 3);
        System.out.println(i);
        System.out.println(j);
    }
}
