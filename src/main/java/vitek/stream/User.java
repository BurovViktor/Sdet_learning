package vitek.stream;

import java.util.List;

public class User {
    private final long id;
    private final String name;
    private final String email;
    private final Role role;
    private final boolean active;
    private final List<String> skills;

    public User(
        long id,
        String name,
        String email,
        Role role,
        boolean active,
        List<String> skills
    ) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.role = role;
            this.active = active;
            this.skills = skills;
        }

    public long getId() {
        return id;
    }
    public String getEmail(){
        return email;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public boolean isActive() {
        return active;
    }

    public List<String> getSkills() {
        return skills;
    }
}

