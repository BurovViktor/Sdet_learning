package vitek.stream;

import java.util.List;

public class StreamsPractice {

    public List<String> getActiveUserEmails(List<User>users){
        return users.stream()
                .filter(User::isActive)
                .filter(user->user.getRole()==Role.USER)
                .map(User::getEmail)
                .toList();
    }
}
