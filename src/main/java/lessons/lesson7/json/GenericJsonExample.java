package lessons.lesson7.json;

import lessons.lesson7.json.entity.User;
import vebinags.vebinar9.generic.linkedList.Node;
import java.util.ArrayList;

public class GnericJsonExample {
    public static void main(String[] args) {

        ArrayList<Node<User>> nodes = new ArrayList<>();

        nodes.add(new Node<>
                (new User("Агент 007", User.Gender.male, 40),
                        "best agent"));

    }
}
