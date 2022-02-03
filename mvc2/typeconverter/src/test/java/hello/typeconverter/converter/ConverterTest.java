package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConverterTest {

    @Test
    void StringToInteger(){
        StringToIntegerConverter stringToIntegerConverter = new StringToIntegerConverter();
        Integer convert = stringToIntegerConverter.convert("10");
        assertThat(convert).isEqualTo(10);
    }

    @Test
    void IntegerToStringConverter(){
        IntegerToStringConverter integerToStringConverter = new IntegerToStringConverter();
        String convert = integerToStringConverter.convert(10);
        assertThat(convert).isEqualTo("10");
    }

    @Test
    void stringToIpPort(){
        IpPortToStringConverter converter = new IpPortToStringConverter();
        IpPort source = new IpPort("127.0.0.1", 8080);
        String result = converter.convert(source);
        assertThat(result).isEqualTo("127.0.0.1:8080");
    }

    @Test
    void ipPortToString(){
        StringToPortConverter converter = new StringToPortConverter();
        String source = "127.0.0.1:8080";
        IpPort result = converter.convert(source);
        assertThat(result).isEqualTo(new IpPort("127.0.0.1",8080));
    }

}
