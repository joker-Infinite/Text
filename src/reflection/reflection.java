package reflection;

public class reflection {
    //入口
    public static void main(String[] args) {
        String str = "string";
        Class strClass = str.getClass();
        System.out.println(strClass);
        System.out.println("===================");
        String str2 = "java.lang.String";
        Class c1 = null;
        try {
            /**
             * Class.forName()
             * 一、返回一个类
             * 二、要求JVM查找并加载指定的类，JVM会执行该类的静态代码段
             * */
            /**
             * getName()
             * public final Class<?> getClass()
             * 返回此object的运行时类，返回的Class对象是由所表示类的static synchronized 方法锁定的对象
             * java的引用变量有两个类型，编译时类型和运行时类型
             * 编译时类型由声明该变量时使用的类型决定
             * 运行时类型由实际赋给该变量的对象决定
             *
             * public String getName()
             * 以string的形式返回此Class对象所表示的实体（类，接口，数组类，基本类型或void）名称
             * 实体：对象引用的目的地
             *
             * public class StudentDemo {
             * 	public static void main(String[] args) {
             * 		Student ss = new StudentSon(1, 2);
             * 	    Class a = ss.getClass();
             * 		System.out.println(a.getName());
             *        }
             * }
             * 该类运行时类型为StudentSon；编译时类型为Student
             * ss.getClass() 返回StudentSon
             * */
            c1 = Class.forName(str2);
            System.out.println(c1.getName());
        } catch (ClassNotFoundException e) {

        }
    }
}
