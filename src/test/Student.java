package test;

//子类继承People,实现接口Study,Write
class Student extends People implements Study, Write, teacher {
    //通过super关键字调用父类的构造器
    public Student(String name, int age) {
        super(name, age);
    }

    //实现父类的抽象方法
    public void talk() {
        System.out.println("我的名字叫" + this.getName() + ",今年" + this.getAge() + "岁");
    }

    //实现Write接口的抽象方法
    public void print(int i) {
        System.out.println("学生会写作业" + i);
    }

    public void change(String name) {
        System.out.println(name+"敲打"+this.getName());
    }
}