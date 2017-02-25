package test.weather;

/**
 * Created by hassan.sadek on 25/2/17.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
