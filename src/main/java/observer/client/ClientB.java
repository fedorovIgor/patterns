package observer.client;

public class ClientB implements NewsSubscriber {
    @Override
    public void update(String newsMessage) {
        System.out.println(newsMessage);
    }
}
