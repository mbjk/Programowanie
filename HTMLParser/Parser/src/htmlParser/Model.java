package htmlParser;

import java.util.Vector;

/**
 * Created by Micha³ Bujak on 21.10.2015.
 */
public class Model {


    parsedData model_pd_m;
    AbstractReader reader;

    Model() { model_pd_m = new parsedData(); }

    public void setRawData(String newData) {
        model_pd_m.setDataRawData(newData);
    }

    public void setParsedData(AbstractReader rd) {
        model_pd_m = rd.getParsedData();

    }

    public void ParseData(String source) {
        reader = ReaderFactory.createReader(source);
        reader.read();
        reader.extractLinks();
        setParsedData(reader);
    }

    public int getLinkCount() {
        return this.model_pd_m.getLinkCount();
    }

    public Vector<String> getLinkVec() {
        return this.model_pd_m.getLinkVec();
    }

    public String getRawData() {
        return this.model_pd_m.getDataRawData();
    }
}
