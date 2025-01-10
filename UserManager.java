import java.util.ArrayList;
import java.util.List;

public class UserManager {
    public static List<String> users = new ArrayList<>();
    
    public static void listUsers() {
    for (String user : users) {
        System.out.println(user);
    }
}
    
}
