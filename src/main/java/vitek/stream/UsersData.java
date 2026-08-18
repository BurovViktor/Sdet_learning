package vitek.stream;

import java.util.List;

public class UsersData {

    public static List<User> getUsers(){
        return List.of(
                new User(
                        1L,
                        "Ivan",
                        "ivan@example.com",
                        Role.USER,
                        true,
                        List.of("Java","SQL")
                ),new User(
                        2L,
                        "Anna",
                        "anna@example.com",
                        Role.ADMIN,
                        true,
                        List.of("Java", "Selenide")
                ),
                new User(
                        3L,
                        "Oleg",
                        "oleg@example.com",
                        Role.USER,
                        false,
                        List.of("SQL")
                ),
                new User(
                        4L,
                        "Maria",
                        "maria@example.com",
                        Role.USER,
                        true,
                        List.of()
                ), new User(
                        5L,
                        "Petr",
                        "petr@example.com",
                        Role.MANAGER,
                        true,
                        List.of("API", "Java")
                )
        );
    }
}
