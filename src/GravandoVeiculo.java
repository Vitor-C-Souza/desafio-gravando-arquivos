import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GravandoVeiculo {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Veiculo veiculo = new Veiculo("impala 67", 1967);

        var json = gson.toJson(veiculo);

        try {
            FileWriter file = new FileWriter("Veiculo.json");
            file.write(json);
            file.close();
            System.out.println(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
