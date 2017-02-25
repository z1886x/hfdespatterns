package test.weather;

/**
 * Created by hassan.sadek on 25/2/17.
 */
public interface Subject {

    public void RegisterObserver(Observer O);

    public void removeObserver(Observer O);

    public void notifyObservers();
}
