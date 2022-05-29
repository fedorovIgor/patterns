package abstractDocument.parts;

import abstractDocument.car.Part;
import abstractDocument.document.Document;

import java.util.stream.Stream;

public interface HasPart extends Document {

    default Stream<Part> getParts() {
        return children(Property.PARTS.toString(), Part::new);
    }
}
