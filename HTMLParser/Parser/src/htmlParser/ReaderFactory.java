package htmlParser;

/**
 * Created by Micha³ on 22.10.2015.
 */
public class ReaderFactory {
    public static AbstractReader createReader(String source) {
        if(source.startsWith("http://") || source.startsWith("www")) {
            if(!source.startsWith("http://")) {
                source = "http://" + source;
            }
            return new WebReader(source);
        } else {
            return new FReader(source);
        }
    }

}
