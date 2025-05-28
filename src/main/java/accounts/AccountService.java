package accounts;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mary
 */
public class AccountService {
    private final Map<String, UserProfile> loginToProfile;
    private final Map<String, UserProfile> sessionIdToProfile;

    public AccountService(){
        loginToProfile = new HashMap<>();
        sessionIdToProfile = new HashMap<>();
    }
}
