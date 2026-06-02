import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class controler {

    @FXML
    private TextField text_field_1;

    @FXML
    private TextField text_field_2;

    @FXML
    private TextField text_field_3;

    @FXML
    private Label label_1;

    @FXML
    private Label label_2;

    @FXML
    private Button botton_1;

    @FXML
    private void calculate() {

        try {

            double a = Double.parseDouble(text_field_1.getText());
            double b = Double.parseDouble(text_field_2.getText());
            double c = Double.parseDouble(text_field_3.getText());

            double delta = b * b - 4 * a * c;

            if (delta > 0) {

                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                label_1.setText("x₁ = " + x1);
                label_2.setText("x₂ = " + x2);

            } else if (delta == 0) {

                double x = -b / (2 * a);

                label_1.setText("x₁ = " + x);
                label_2.setText("x₂ = " + x);

            } else {

                label_1.setText("No Real Solution");
                label_2.setText("");

            }

        } catch (Exception e) {

            label_1.setText("Invalid Input");
            label_2.setText("");

        }
    }
}