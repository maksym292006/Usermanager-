import java.util.ArrayList;
import java.util.List;

public class UserManager {
    // Lista estática para almacenar los usuarios
    public static List<String> users = new ArrayList<>();
    
    // Método para agregar un usuario si no está ya en la lista
    public static void addUser(String user) {
        if (!users.contains(user)) {
            users.add(user);
        }
    }

    // Método para listar los usuarios
    public static void listUsers() {
        // Si la lista está vacía, mostrar un mensaje
        if (users.isEmpty()) {
            System.out.println("No hay usuarios en la lista.");
        } else {
            System.out.println("Lista de usuarios:");
            // Imprimir todos los usuarios
            for (String user : users) {
                System.out.println(user);
            }
        }
    }

    // Método principal
    public static void main(String[] args) {
        // Agregar usuarios y listar la lista
        addUser("Alice");
        addUser("Bob");
        listUsers();
    }
}

