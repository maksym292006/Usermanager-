import java.util.ArrayList;
import java.util.List;

public class UserManager {
    public static List<String> users = new ArrayList<>();
    

public static void addUser(String user) {
    if (!users.contains(user)) {
        users.add(user);
    }
}

public static void main(String[] args) {
    addUser("Alice");
    addUser("Bob");
    listUsers();
}

}



