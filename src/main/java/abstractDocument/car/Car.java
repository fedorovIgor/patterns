package abstractDocument.car;

import abstractDocument.document.AbstractDocument;
import abstractDocument.parts.HasModel;
import abstractDocument.parts.HasPart;
import abstractDocument.parts.HasPrice;

import java.util.Map;

public class Car extends AbstractDocument implements HasModel, HasPrice, HasPart {

    public Car(Map<String, Object> properties) {
        super(properties);
    }
}
