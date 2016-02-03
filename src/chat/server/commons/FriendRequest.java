/*
 * FriendRequest class implements Serializable
        deal with database ( tabale FriendRequest )
            to work with object
 */
package chat.server.commons;

import java.io.Serializable;

/**
 *
 * @author ElGazzar
 */
public class FriendRequest implements Serializable
{
    private int id;
    private String email;
    private String friendEmail;

    public FriendRequest()
    {
    }
    public FriendRequest(int id,String email, String friendEmail) {
        this.id = id;
        this.email = email;
        this.friendEmail = friendEmail;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFriendEmail() {
        return friendEmail;
    }

    public void setFriendEmail(String friendEmail) {
        this.friendEmail = friendEmail;
    }

    
}
