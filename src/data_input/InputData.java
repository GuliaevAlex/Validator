package data_input;

import java.io.IOException;

public interface InputData {
    public String inputData() throws IOException;

    public void streamClose() throws IOException;
}
