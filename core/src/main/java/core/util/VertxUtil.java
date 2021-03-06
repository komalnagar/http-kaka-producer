package core.util;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author : komal.nagar
 */
public class VertxUtil {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.getFactory().configure(JsonFactory.Feature.INTERN_FIELD_NAMES, false);
    }

    public static ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}
