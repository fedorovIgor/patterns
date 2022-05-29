package observer.client;

import java.util.ArrayList;
import java.util.List;

public class ClientA implements NewsSubscriber {

    private final List<String> history;

    public ClientA() {
        this.history = new ArrayList<>();
    }

    @Override
    public void update(String newsMessage) {
        history.add(newsMessage);
    }

    public List<String> getMessages() {
        return history;
    }
}
