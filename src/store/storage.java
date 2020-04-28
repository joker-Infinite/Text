package store;

public class storage {
    //先规定栈的最大容量
    Object[] objs;
    //获取当前栈容量
    int size;

    public void SQ(int MaxLen) {
        this.objs = new Object[MaxLen];
    }


    //进行压栈操作(就是在栈中存入内容)
    public void push(Object x) {
        System.out.println("压栈操作,压入内容为" + (objs[size++] = x));  //先给当前指针位置赋值,然后指针变大

    }

    //弹栈操作
    public void popu() {
        System.out.println("弹出栈顶内容:" + objs[size - 1]);//获取栈顶数据,然后弹出栈中,栈容量减少
        size--;
    }

    //获取栈内所有数据
    public void getAllStack() {
        System.out.println("栈顶到栈底所有数据为");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(objs[i] + " ");
        }
    }
}
