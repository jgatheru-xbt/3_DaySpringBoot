package org.example.threedayspring;

//imports
import org.springframework.boot.jackson.JacksonComponent;
import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.SerializationContext;
import tools.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

//@JacksonComponent
public class UserSerializer extends StdSerializer<User> {
    protected UserSerializer(Class<?> t) {
        super(t);
    }

//    @Override
//    public void serialize(User user, JsonGenerator gen, SerializerProvider serializers) throws IOException {
//        gen.writeStartObject();
//        gen.writeStringField("First_Name", user.getName());
//        gen.writeNumberField("age", user.getAge());
//        gen.writeEndObject();
//    }

    @Override
    public void serialize(User value, JsonGenerator gen, SerializationContext ctxt) throws JacksonException {

    }
}
