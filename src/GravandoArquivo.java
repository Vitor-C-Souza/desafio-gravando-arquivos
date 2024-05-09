import java.io.FileWriter;
import java.io.IOException;

public class GravandoArquivo {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("arquivo.txt");
            file.write("Conteúdo a ser gravado no arquivo.");
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
