import java.util.ArrayList;
import java.util.List;

public class UserManager {
    public static List<String> users = new ArrayList<>();

    public static void addUser(String user) {
        if (!users.contains(user)) { // Verifica si el usuario ya existe
            users.add(user);         // Si no existe, lo añade
        }
    }
}
