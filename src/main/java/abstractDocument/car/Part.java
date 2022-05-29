package abstractDocument.car;

import abstractDocument.document.AbstractDocument;
import abstractDocument.parts.HasModel;
import abstractDocument.parts.HasPart;
import abstractDocument.parts.HasPrice;
import abstractDocument.parts.HasType;

import java.util.Map;

public class Part extends AbstractDocument implements HasModel, HasPrice, HasType {

    public Part(Map<String, Object> properties) {
        super(properties);
    }
}
