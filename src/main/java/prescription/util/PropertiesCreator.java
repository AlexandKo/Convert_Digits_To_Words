package prescription.util;

import lombok.Getter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesCreator {
    @Getter
    private final String propertyFilePath;

    public PropertiesCreator(String propertyFilePath) {
        this.propertyFilePath = propertyFilePath;
    }

    public Properties getPropertiesSet() {

        Properties properties = new Properties();

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        try (InputStream inputStream = classLoader.getResourceAsStream(propertyFilePath)) {

            properties.load(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}