
package proyecto;

import java.io.File;

public class FileClass {
    private String name;
    private String owner;
    private String belongsTo;

    public FileClass(String name, String owner, String belongsTo) {
        this.name = name;
        this.owner = owner;
        this.belongsTo = belongsTo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBelongsTo() {
        return belongsTo;
    }

    public void setBelongsTo(String belongsTo) {
        this.belongsTo = belongsTo;
    }

    @Override
    public String toString() {
        return "FileClass{" + "name=" + name + ", owner=" + owner + ", belongsTo=" + belongsTo + '}';
    }
    
    
}
