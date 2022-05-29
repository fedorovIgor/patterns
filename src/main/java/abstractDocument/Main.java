package abstractDocument;

import abstractDocument.car.Car;
import abstractDocument.car.Part;
import abstractDocument.parts.Property;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        var wheelProperties = Map.of(
                Property.TYPE.toString(), "wheel",
                Property.MODEL.toString(), "15C",
                Property.PRICE.toString(), 100L);

        var doorProperties = Map.of(
                Property.TYPE.toString(), "door",
                Property.MODEL.toString(), "Lambo",
                Property.PRICE.toString(), 300L);

        var a = Map.of(
          "new property", "supper",
          Property.PRICE.toString(), 10L
        );

        var carProperties = Map.of(
                Property.MODEL.toString(), "300SL",
                Property.PRICE.toString(), 10000L,
                Property.PARTS.toString(), List.of(wheelProperties, doorProperties));

        var car = new Car(carProperties);


        System.out.println("car model" + car.getModel());
        car.getParts().forEach( p -> System.out.println(
                String.format("type: [%s]  price: [%s]  model: [%s]",
                p.getType().orElse(null),
                p.getPrice().orElse(null),
                p.getModel().orElse(null)
                ))
        );

        var someP = Map.of(
                "A", new A(1),
                "B", List.of(new A(1), new A (2) , new A(0))
        );

        Car car2 = new Car(someP);

        System.out.println(car2.get("B"));

    }
}

class A {
    int id;

    public A(int id) {
        this.id = id;
    }
}
