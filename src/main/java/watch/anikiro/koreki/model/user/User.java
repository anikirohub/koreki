package watch.anikiro.koreki.model.user;

import lombok.Data;
import watch.anikiro.koreki.model.Role;

import java.util.Set;

@Data
public class User {
    private final Long id;
    private String username;
    private String email;
    private boolean subscription;

    private Set<Role> roles;

    /*
     * Meta information about the user
     *
     * Can be null if wasn't fetched, because some cases don't require it
     *
     * @since 0.0.1
     */
    private UserMeta meta;

    /*
     * Preferences of the user
     *
     * Can be null if wasn't fetched, because some cases don't require it
     *
     * @since 0.0.1
     */
    private UserPreferences preferences;
}
