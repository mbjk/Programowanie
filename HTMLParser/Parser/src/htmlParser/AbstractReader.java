package htmlParser;

import java.util.ArrayList;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Micha³ on 22.10.2015.
 */
public abstract class AbstractReader {

    protected parsedData pd_m;

    AbstractReader() {pd_m = new parsedData(); }

    abstract void read();

    int extractLinks() {
        Vector<String> tempLinkVec = new Vector<String>();
        int linkCount = 0;

        String regex = "\\(?\\b(http://|www[.])[-A-Za-z0-9+&amp;@#/%?=~_()|!:,.;]*[-A-Za-z0-9+&amp;@#/%=~_()|]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(pd_m.getDataRawData());
        while(m.find()) {
            String urlString = m.group();
            if (urlString.startsWith("(") && urlString.endsWith(")"))
            {
                urlString = urlString.substring(1, urlString.length() - 1);
            }
            tempLinkVec.add(urlString);
            linkCount++;
        }

        pd_m.setLinkCount(linkCount);
        pd_m.setLinkVec(tempLinkVec);
        return pd_m.getLinkCount();
    }
    parsedData getParsedData() { return this.pd_m; }
}
