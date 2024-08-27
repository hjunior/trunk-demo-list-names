import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class ListOfNameTest {

    @Test
    public void testHumbertoJuniorInList() {
        String filePath = "lista_nomes.txt";
        String gitHubLogin = "humberto_junior"; // Substitua pelo seu nome_sobrenome

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            //boolean containsLogin = lines.stream().anyMatch(line -> line.contains(gitHubLogin));
            boolean containsLogin = lines.stream().anyMatch(line -> line.equals(gitHubLogin));
            assertTrue(containsLogin, "O arquivo lista_nomes.txt deve conter o login exato do GitHub do autor do commit.");
        } catch (IOException e) {
            fail("Erro ao ler o arquivo lista_nomes.txt: " + e.getMessage());
        }
    }

    @Test
    public void testWesleyVicenteInList() {
        String filePath = "lista_nomes.txt";
        String gitHubLogin = "wesley_vicente"; // Substitua pelo seu nome_sobrenome

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            //boolean containsLogin = lines.stream().anyMatch(line -> line.contains(gitHubLogin));
            boolean containsLogin = lines.stream().anyMatch(line -> line.equals(gitHubLogin));
            assertTrue(containsLogin, "O arquivo lista_nomes.txt deve conter o login exato do GitHub do autor do commit.");
        } catch (IOException e) {
            fail("Erro ao ler o arquivo lista_nomes.txt: " + e.getMessage());
        }
    }
}
