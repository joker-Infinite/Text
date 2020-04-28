package test;

public class InterfaceDemo {
    public static void main(String[] args) {
        //构建student对象
        Student student = new Student("jojo", 18);
        //调用父类的抽象方法
        student.talk();
        //调用接口Write中的抽象方法
        student.print(8);
        //调用接口Study中的默认方法
        student.stu();
        student.change("小爱");
    }
}
