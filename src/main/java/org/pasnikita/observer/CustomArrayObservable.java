package org.pasnikita.observer;

public interface CustomArrayObservable {
  void attach(CustomArrayObserver observer);
  void detach(CustomArrayObserver observer);
  void notifyObserver();
}
