/*
 * GroupUser class implements Serializable
        deal with database ( tabale GroupUser )
            to work with object
 */
package chat.server.commons;

import java.io.Serializable;

/**
 *
 * @author ElGazzar
 */
public class GroupUser implements Serializable
{
    private int id;
    private int groupId;
    private String email;

    public GroupUser() {
    }

    public GroupUser(int id,int groupId, String email) {
        this.id = groupId;
        this.groupId = groupId;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    
}
