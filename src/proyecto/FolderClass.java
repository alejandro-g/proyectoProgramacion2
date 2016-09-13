
package proyecto;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class FolderClass implements Serializable{
    private String owner;
    private String name;
    private ArrayList<FolderClass>foldersList = new ArrayList();
    private ArrayList<File>filesList = new ArrayList();

    public FolderClass(String owner, String name) {
        this.owner = owner;
        this.name = name;
    }
    
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<FolderClass> getFoldersList() {
        return foldersList;
    }

    public void setFoldersList(ArrayList<FolderClass> foldersList) {
        this.foldersList = foldersList;
    }

    public ArrayList<File> getFilesList() {
        return filesList;
    }

    public void setFilesList(ArrayList<File> filesList) {
        this.filesList = filesList;
    }

    @Override
    public String toString() {
        return "FileClass{" + "owner=" + owner + ", name=" + name + ", foldersList=" + foldersList + ", filesList=" + filesList + '}';
    }
    
    
}
