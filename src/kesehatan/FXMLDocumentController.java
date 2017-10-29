/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kesehatan;

import com.jfoenix.controls.JFXTextField;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author firdahilya
 */
public class FXMLDocumentController implements Initializable {

   @FXML
    private Label label;
    @FXML
    private RadioButton rdLaki;
    @FXML
    private ToggleGroup pilihan;
    @FXML
    private RadioButton rdPerempuan;
    @FXML
    private Button proses;
  
    private Button reset;
    @FXML
    private TextField ideal;
    @FXML
    private JFXTextField editnama;
    @FXML
    private JFXTextField edittinggi;
    @FXML
    private JFXTextField editberat;
    @FXML
    private TextArea hasil;
    @FXML
    private TextArea saran;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submit(ActionEvent event) {
        
        int Ideal = 0;
    String Hasil= null;
    String Saran = null;
    String nama = editnama.getText();
    int tinggi = Integer.parseInt(edittinggi.getText());
     int berat = Integer.parseInt(editberat.getText());
     
    if(rdLaki.isSelected()) {
        Ideal = parseInt(edittinggi.getText()) -105;
        
        ideal.setText(""+Ideal);
    if (Ideal == berat){
            Hasil= "nama:  "+editnama.getText()+ "\n"+"Tinggi Badan:  "+edittinggi.getText()+"\n"+"Berat Badan: "+editberat.getText()+"\n"+"IDEAL";
            Saran = "pertahankan";
        }
        else if (Ideal < berat){
            Hasil= "nama:  "+editnama.getText()+ "\n"+"Tinggi Badan:  "+edittinggi.getText()+"\n"+"Berat Badan: "+editberat.getText()+"\n"+"OVERWEIGHT";
            Saran = "Kurangi makan malam";
        }
        else if (Ideal > berat){
            Hasil= "nama:  "+editnama.getText()+ "\n"+"Tinggi Badan:  "+edittinggi.getText()+"\n"+"Berat Badan: "+editberat.getText()+"\n"+"UNDERWEIGHT";
            Saran = "Sering-sering makan";
      
        }
    }
     if(rdPerempuan.isSelected()) {
        Ideal = parseInt(edittinggi.getText()) -105;
        
        ideal.setText(""+Ideal);
    if (Ideal == berat){
            Hasil= "nama:  "+editnama.getText()+ "\n"+"Tinggi Badan:  "+edittinggi.getText()+"\n"+"Berat Badan: "+editberat.getText()+"\n"+"IDEAL";
            Saran = "pertahankan";
        }
        else if (Ideal < berat){
            Hasil= "nama:  "+editnama.getText()+ "\n"+"Tinggi Badan:  "+edittinggi.getText()+"\n"+"Berat Badan: "+editberat.getText()+"\n"+"OVERWEIGHT";
            Saran = "Kurangi makan malam";
        }
        else if (Ideal > berat){
            Hasil= "nama:  "+editnama.getText()+ "\n"+"Tinggi Badan:  "+edittinggi.getText()+"\n"+"Berat Badan: "+editberat.getText()+"\n"+"UNDERWEIGHT";
            Saran = "Sering-sering makan";
        }
    }
              
    hasil.setText(Hasil);
    saran.setText(Saran);
    }

    @FXML
    private void clear(ActionEvent event) {
        editnama.setText("");
           edittinggi.setText("");
           editberat.setText("");
           rdLaki.setSelected(false);
           rdPerempuan.setSelected(false);
           hasil.setText("");
           ideal.setText("");
           saran.setText("");
    }
    
}
