package ss4_class_and_object.exercise.stop_watch;

import java.util.Date;

public class StopWatch {
    long startTime;
    long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    private long getEndTime() {
        return endTime;
    }

    private long getStartTime() {
        return startTime;
    }

    public long start() {
        return this.startTime = System.currentTimeMillis();
    }

    public long stop() {
        return this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return (this.endTime - this.startTime);
    }
}
