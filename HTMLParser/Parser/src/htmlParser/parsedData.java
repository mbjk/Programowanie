package htmlParser;

import java.util.Vector;

/**
 * Created by Micha³ on 22.10.2015.
 */
public class parsedData {
    public String dataSource_m;
    public String dataRawData_m;
    public int linkCount_m;
    public Vector<String> links_m;

    public String getDataSource() {
        return this.dataSource_m;
    }

    public String getDataRawData() {
        return this.dataRawData_m;
    }

    public int getLinkCount() {
        return this.linkCount_m;
    }

    public Vector<String> getLinkVec() {
        return this.links_m;
    }

    public void setDataSource(String newDataSource) {
        this.dataSource_m = newDataSource;
    }

    public void setDataRawData(String newRawData) {
        this.dataRawData_m = newRawData;
    }

    public void setLinkCount(int newCount) {
        this.linkCount_m = newCount;
    }

    public void setLinkVec(Vector<String> newLinks) {
        this.links_m = newLinks;
    }
}