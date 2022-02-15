package ss23_behavioral_design_pattern.practice.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
