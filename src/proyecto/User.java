package proyecto;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {

    private String name;
    private String password;
    private String type;
    private ArrayList<FolderClass> folderslist = new ArrayList();

    //private static final long SerialVersionUID = 248L;

    public User(String name, String password, String type) {
        this.name = name;
        this.password = password;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<FolderClass> getFolderslist() {
        return folderslist;
    }

    public void setFolderslist(ArrayList<FolderClass> folderslist) {
        this.folderslist = folderslist;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", password=" + password + ", type=" + type + ", folderslist=" + folderslist + '}';
    }

    public void addFolderToFolderList(FolderClass folder) {
        this.folderslist.add(folder);
    }
    
    public void addFilesToFolder(ArrayList <File> files, FolderClass folder) {
        for (int i = 0; i < this.getFolderslist().size(); i++) {
            if(this.getFolderslist().get(i).getName().equalsIgnoreCase(folder.getName())){
                this.getFolderslist().get(i).setFilesList(files);
            }
        }
    }
}
