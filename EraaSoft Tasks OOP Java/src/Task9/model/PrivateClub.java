package Task9.model;

import java.util.ArrayList;

public class PrivateClub extends Club{
    private final String password="1234";

    public boolean checkPassword(String input) {
        return this.password.equals(input);
    }
}
