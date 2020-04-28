package demo;

class movement implements eat, sleep, work, people, son {
    String food;
    int time;
    String thing;
    String name;
    String sex;
    int age;

    @Override
    public void eat(String food) {
        this.food = food;
        System.out.println("食物：" + food);
    }

    @Override
    public void people(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        System.out.println("姓名:" + name + "性别：" + sex + "年龄：" + age);
    }

    @Override
    public void sleep(int time) {
        this.time = time;
        System.out.println("时间：" + time);
    }

    @Override
    public void work(String thing) {
        this.thing = thing;
        System.out.println("工作：" + thing);
    }

    void HHH() {
        System.out.println(this.name + "是" + this.sex + "，今年" + this.age + "岁，喜欢吃" + this.food + "他的工作是" + this.thing + "，他上班的时间是" + this.time + "点！");
    }

    void maxomin(double x, double y, double z, double... list) {
        double max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        System.out.println(max);
    }

    @Override
    public void newEat(int m) {
        System.out.println(m);
    }
}
