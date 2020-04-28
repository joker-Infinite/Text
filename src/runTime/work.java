package runTime;

public interface work {
    //开始工作
    void startWork(String startWork);

    //结束工作
    void finishWork(String finishWork);

    //开始工作时间
    void startTime(int startTime);

    //结束工作时间
    void endTime(int endTime);

    //上班干什么
    void workMake(String workMake);
}
