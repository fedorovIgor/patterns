package observer.producer;

import observer.client.NewsSubscriber;

import java.util.ArrayList;
import java.util.List;

public class NewsGenerationService implements Producer{

    private String currantNewsMessage;
    private final List<NewsSubscriber> subscribers;

    public NewsGenerationService() {
        this.subscribers = new ArrayList<>();
    }

    public void generate() {
        this.currantNewsMessage = "Nothing new ;)";
        notifyListeners();
    }

    @Override
    public void addListener(NewsSubscriber... sub) {
        for (var s : sub)
            subscribers.add(s);
    }
    @Override
    public void removeListener(NewsSubscriber sub) {
        subscribers.remove(sub);
    }

    @Override
    public void notifyListeners() {
        for (var s : subscribers)
            s.update(currantNewsMessage);
    }

}
