package hello.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by agup101 on 4/19/2017.
 */
@ConfigurationProperties("storage")
public class StorageProperties {

    /**
     * Folder location for storing files
     */
    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
