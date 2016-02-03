/*
 * OfflineMsg class implements Serializable
        deal with database ( tabale OfflineMsg )
            to work with object
 */
package chat.server.commons;

import java.io.Serializable;

/**
 *
 * @author ElGazzar
 */
public class OfflineMsg implements Serializable
{
    private int id;
    private String email;
    private String friendEmail;
    private String offlineMsg;

    public OfflineMsg() {
    }

    public OfflineMsg(int id, String email, String friendEmail, String offlineMsg) {
        this.id = id;
        this.email = email;
        this.friendEmail = friendEmail;
        this.offlineMsg = offlineMsg;
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

    public String getOfflineMsg() {
        return offlineMsg;
    }

    public void setOfflineMsg(String offlineMsg) {
        this.offlineMsg = offlineMsg;
    }
    
    
    
}
