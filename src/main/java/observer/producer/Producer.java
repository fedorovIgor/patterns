package observer.producer;

import observer.client.NewsSubscriber;

public interface Producer {
    void addListener(NewsSubscriber... subscriber);
    void removeListener(NewsSubscriber subscriber);
    void notifyListeners();
}
