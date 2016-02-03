/*
    ClientInfo class implements Serializable
        deal with database ( tabale ClientInfo )
            to work with object
 */
package chat.server.commons;

import java.io.Serializable;
import java.util.Date;
import javax.swing.ImageIcon;


/**
 *
 * @author ElGazzar
 */
public class ClientInform implements Serializable{
    
    private int ID;
    private String fName;
    private  String lName;
    private String userName;
    private String email;
    private String password;
    private String birthDate;
    private String telephone;
    private String address;
    private Date creationDate;
    private Date lastLogin;
    private ImageIcon profileImage;
    private String gender;
    private String country;
    private String status;
    private String txtstatus;
    private boolean deleted;
    private String ip;
    private String port;
    
    public ClientInform(){}
    public ClientInform(String _fName, String _lName, String _userName, String _email, String _password,
            String _birthDate, String _telephone,String _address, ImageIcon _profileImage, 
            String _gender,String _country, String _txtstatus) {
        this.fName = _fName;
        this.lName = _lName;
        this.userName = _userName;
        this.email = _email;
        this.password = _password;
        this.birthDate = _birthDate;
        this.telephone = _telephone;
        this.address = _address;
        this.profileImage = _profileImage;
        this.gender = _gender;
        this.country = _country;
        this.txtstatus = _txtstatus;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public ImageIcon getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(ImageIcon profileImage) {
        this.profileImage = profileImage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTxtstatus() {
        return txtstatus;
    }

    public void setTxtstatus(String txtstatus) {
        this.txtstatus = txtstatus;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
    
    
    
}
