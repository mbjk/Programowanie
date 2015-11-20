package htmlParser;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Micha³ on 22.10.2015.
 */
public class WebReader extends AbstractReader {

    @Override
    void read() {
        try{
            URL url = new URL(this.pd_m.getDataSource());
            URLConnection con = url.openConnection();
            InputStream in = con.getInputStream();
            String encoding = con.getContentEncoding();
            encoding = encoding == null ? "UTF-8" : encoding;

            ByteArrayOutputStream OStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[8192];
            int l = 0;
            while ((l = in.read(buffer)) != -1) {
                OStream.write(buffer, 0, l);
            }
            String data = new String(OStream.toByteArray(), encoding);
            this.pd_m.setDataRawData(data);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    WebReader(String source) {
        this.pd_m.setDataSource(source);
    }

}
