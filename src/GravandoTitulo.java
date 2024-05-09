import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GravandoTitulo {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Titulo titulo = new Titulo("Harry Potter e o prisioneiro de Azkaban", "Alfonso Cuarón", "Warner Bros. Pictures");

        String json = gson.toJson(titulo);

        try {
            FileWriter file = new FileWriter("FilmeFavorito.json");
            file.write(json);
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
