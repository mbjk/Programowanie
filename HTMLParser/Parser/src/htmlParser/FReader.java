package htmlParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Micha³ on 22.10.2015.
 */
public class FReader extends AbstractReader {
    @Override
    void read() {
        String content = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader((this.pd_m.getDataSource())));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    sb.append(line);
                    sb.append("\n");
                    line = br.readLine();
                }
                this.pd_m.setDataRawData(sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    FReader(String source) {
        this.pd_m.setDataSource(source);
    }
}
