package Assignment12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AccessControlService {
    private static AccessControlService instance;
    private HashMap<String, Set<String>> accessControlList;

    private AccessControlService() {
        accessControlList = new HashMap<>();
    }

    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public void addAccessControlList(String username, String documentIdentifier) {
        accessControlList.computeIfAbsent(documentIdentifier, k -> new HashSet<>()).add(username);
    }

    public boolean isAllowed(String username, String documentIdentifier) {
        Set<String> allowedUsers = accessControlList.get(documentIdentifier);
        return allowedUsers != null && allowedUsers.contains(username);
    }
}