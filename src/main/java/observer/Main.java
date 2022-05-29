package observer;

import observer.client.ClientA;
import observer.client.ClientB;
import observer.producer.NewsGenerationService;

public class Main {
    public static void main(String[] args) {
        var a = new ClientA();
        var b = new ClientB();

        var messageGenerator = new NewsGenerationService();
        messageGenerator.addListener(a,b);

        messageGenerator.generate();
        messageGenerator.generate();
        messageGenerator.generate();

        System.out.println(a.getMessages());
    }
}
