package testPackage;

import org.apache.commons.io.input.ClassLoaderObjectInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class PropertyReader {
    //create string that take setings propeties
    //why it with big leters? May be it is final - constanta
    private static final String CONFIG_PATH = "config.properties";

    //create some propenties???
    private static final Properties prop = initProperties();

    //create string that take property browser in our case it is chrome
    public static final String BROWSER = prop.getProperty("browser");

    //create string that take property url link
    public static final String BASEURL = prop.getProperty("baseUrl");

    //unknown constructor
    private PropertyReader(){
    }
    /*
    //geter but return prop why I do not know
    public static Properties getProperties() {
        return prop; // here)
    }*/ //freeze it on time
// again a method with properties
    private static Properties initProperties(){
        Properties prop = new Properties();
        //Create class with  take configurathion of our properties
        InputStream inputStream = ClassLoader.getSystemResourceAsStream(CONFIG_PATH);
        // try to load
        try {
            prop.load(inputStream);
        }
        // if do not load catch excepthion
        catch (IOException e) {
            throw new RuntimeException(" Couldnot load properties " + CONFIG_PATH);
        }
    return prop;}
}
