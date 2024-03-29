package JavaR2.Adapter.Task4;
import java.io.IOException;
import java.text.ParseException;

public interface PersonScanner {
    Person read() throws IOException, ParseException;

    void close() throws IOException;
}
