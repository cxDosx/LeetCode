package utils;

public class TimeUtils {
    private long start;
    private long end;
    public TimeUtils() {
        start = end = 0;
    }

    public void setStartTime(){
        start = System.currentTimeMillis();
    }

    public void setEndTime(){
        end = System.currentTimeMillis();
    }

    public void setEndTimeAndShow(){
        setEndTimeAndShow(true);
    }

    public void setEndTimeAndShow(boolean showSecond){
        setEndTime();
        printUsedTime(showSecond);
    }

    public void printUsedTime(){
        printUsedTime(true);
    }

    public void printUsedTime(boolean showSecond){
        if (start == 0 || end == 0) {
            System.out.println(-1);
        } else {
            if (showSecond) {
                System.out.println("耗时："+(end-start)/1000D+"s");
            }else{
                System.out.println("耗时："+(end-start)+"ms");
            }
        }
    }
}
