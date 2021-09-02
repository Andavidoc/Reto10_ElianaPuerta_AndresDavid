package controlador;

import java.io.IOException;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import modelo.Esfera;

public class PrimaryController {

    @FXML
    public TextField txtRadio;
    @FXML
    private Button btnArea;
    @FXML
    private Button btnPerimetro;
    @FXML
    private Button btnSuperficie;
    @FXML
    private Button btnVolumen;
    @FXML
    private Label labVolumen;
    @FXML
    private Label labArea;
    @FXML
    private Label labPerimetro;
    @FXML
    private Label labSuperficie;
    @FXML
    private Label labError;
    @FXML
    private Pane panel;
    @FXML
    private ImageView imagen;
    @FXML
    private Button btnLimpiar;

    @FXML

    private void calculeVol(ActionEvent event) {
        if (vacio() == false) {
            Esfera esfera = new Esfera(Double.parseDouble(txtRadio.getText()));
            labVolumen.setText(String.valueOf(esfera.volumen()));
        }
    }

    @FXML
    private void calcularArea(ActionEvent event) {

        if (vacio() == false) {
            Esfera esfera = new Esfera(Double.parseDouble(txtRadio.getText()));
            labArea.setText(String.valueOf(esfera.areaCirculo()));
        }
    }

    @FXML
    private void calcularPerimetro(ActionEvent event) {
        if (vacio() == false) {
            Esfera esfera = new Esfera(Double.parseDouble(txtRadio.getText()));
            labPerimetro.setText(String.valueOf(esfera.perimetroCirculo()));
        }
    }

    @FXML
    private void calcularSuperficie(ActionEvent event) {
        if (vacio() == false) {
            Esfera esfera = new Esfera(Double.parseDouble(txtRadio.getText()));
            labSuperficie.setText(String.valueOf(esfera.superficie()));
        }
    }

    public boolean vacio() {
        if (txtRadio.getText().isEmpty()) {
            labError.setText("Por favor ingrese un valor para el Radio");
            return true;
        }
        return false;
    }

    @FXML
    private boolean errores(KeyEvent event) {
        String solonumero = txtRadio.getText();
        if (solonumero.equals("-")) {
            labError.setText("El valor del radio debe ser positivo");
            txtRadio.clear();
            return false;
        } else {
            try {
                double prueba = Double.parseDouble(solonumero);
                labError.setText("");
                return true;
            } catch (NumberFormatException e) {
                txtRadio.clear();
                labError.setText("Ingrese solo números");
                return false;

            }
        }
    }

    @FXML
    private void limpiarCodigo(ActionEvent event) {
        txtRadio.clear();
        txtRadio.requestFocus();
        labVolumen.setText("");
        labPerimetro.setText("");
        labArea.setText("");
        labSuperficie.setText("");
    }

}
