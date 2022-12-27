package data_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputDataFromConsole implements InputData {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public String inputData() throws IOException {
        return bf.readLine();
    }

    public void streamClose() throws IOException {
        bf.close();
    }

}

