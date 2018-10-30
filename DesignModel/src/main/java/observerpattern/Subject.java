package observerpattern;

public interface Subject {

    public void registerObserve(Observer observer);

    public void removeObserve(Observer observer);

    public void notifyObserves();


}
