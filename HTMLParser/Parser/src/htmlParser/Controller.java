package htmlParser;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.Enumeration;
import java.util.Vector;

public class Controller {

    private Model model_m;
    private Stage stage_m;
    private File file_m;

    @FXML
    private TextField sourcePath;
    @FXML
    private TextArea previewTextArea;
    @FXML
    private TextArea linksTextArea;
    @FXML
    private Label linksCountLabel;

    public void init(Stage primaryStage, Model model) {
        stage_m = primaryStage;
        model_m = model;
    }

    @FXML
    void setFilePath(ActionEvent evnt) {
        FileChooser fc = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fc.getExtensionFilters().add(extFilter);
        File file = fc.showOpenDialog(stage_m);

        if (file != null) {
            this.file_m = file;
            sourcePath.setText(file_m.toString());
        }
    }

    @FXML
    void parse(ActionEvent evnt) {
        if(sourcePath.getText() != null || sourcePath.getText() != "") {
            clearUI();
            model_m.ParseData(sourcePath.getText());
            previewTextArea.setText(model_m.getRawData());
            linksCountLabel.setText(Integer.toString((model_m.getLinkCount())));

            Vector<String> tempVector = model_m.getLinkVec();
            Enumeration it = tempVector.elements();

            while (it.hasMoreElements()) {
                linksTextArea.appendText((String) it.nextElement() + '\n');
            }
        }
    }

    void clearUI() {
        previewTextArea.clear();
        linksTextArea.clear();
        linksCountLabel.setText("0");
    }

}