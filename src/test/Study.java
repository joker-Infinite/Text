package test;

interface Study {
    int COURSENUM =3;
    default void stu(){
        System.out.println("学生需要学习"+COURSENUM+"门课程");
    }
}
