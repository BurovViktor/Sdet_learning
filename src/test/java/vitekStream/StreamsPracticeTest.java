package vitekStream;

import org.junit.jupiter.api.Test;
import vitek.stream.StreamsPractice;
import vitek.stream.UsersData;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamsPracticeTest {
    @Test
    void shouldReturnEmailsOfActiveUsersWithUserRole() {

        StreamsPractice practice = new StreamsPractice();

        List<String> actualEmails = practice.getActiveUserEmails(UsersData.getUsers());

        List<String> expectedEmails = List.of("ivan@example.com",
                "maria@example.com");
        assertEquals(expectedEmails,actualEmails);
    }
}
