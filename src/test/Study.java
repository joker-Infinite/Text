package test;

interface Study {
    int courseNum =3;
    default void stu(){
        System.out.println("学生需要学习"+courseNum+"门课程");
    }
}
