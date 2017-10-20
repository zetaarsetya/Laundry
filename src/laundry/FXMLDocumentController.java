/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

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
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Zeta Arsetya
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField nama;
    @FXML
    private TextField alamat;
    @FXML
    private TextField berat;
    @FXML
    private TextField no;
    @FXML
    private RadioButton ck;
    @FXML
    private RadioButton s;
    @FXML
    private RadioButton cks;
    @FXML
    private TextField tgl;
    @FXML
    private TextField namakasir;

    @FXML
    private Button oke;
    @FXML
    private Button hps;
    @FXML
    private TextArea TA;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        String Nama = nama.getText();
        String Alamat = alamat.getText();
        int Berat = Integer.parseInt(berat.getText());
        String Nomor = no.getText();
        String Pilih = "";
        String Tanggal = tgl.getText();
        String Namakasir = namakasir.getText();
        int harga = 0;
        
        if(!(ck.isSelected() || cks.isSelected() || s.isSelected())){
            JOptionPane.showMessageDialog(null, "Pilih Paket");
        }
        
        if(ck.isSelected()){
            Pilih = "Cuci Kering";
            harga = 5000 * Berat;
        }
        if(s.isSelected()){
            Pilih = "Setrika";
            harga = 4000 * Berat;
        }
        if(cks.isSelected()){
            Pilih = "Cuci Kering Setrika";
            harga = 8000 * Berat;
        }
        
        TA.setText("Nama : "+Nama+"\nAlamat : "+Alamat+"\nBerat Cucian :"
                + " "+Berat+"\nNo Handphone : "+Nomor+"\nPilihan Paket : "+Pilih+"\nTanggal Pengambilan : "+
                Tanggal+"\nHarga Total : "+harga+"\nNama Kasir : "+Namakasir);
    }

    @FXML
    private void proseshps(ActionEvent event) {
        nama.setText("");
        alamat.setText("");
        berat.setText("");
        no.setText("");
        ck.setSelected(false);
        s.setSelected(false);
        cks.setSelected(false);
        tgl.setText("");
        namakasir.setText("");
        TA.setText("");
    }
    
}
