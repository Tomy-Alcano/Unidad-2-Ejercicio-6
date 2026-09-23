import javax.swing.*;
import java.awt.*;

public class Calculadora {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            JFrame ventana = new JFrame("Calculadora IMC");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setSize(400,200);
            ventana.setLocationRelativeTo(null);

            JPanel panel = new JPanel(new GridLayout(4,2,10,10));
            panel.setBackground(Color.LIGHT_GRAY);
            panel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));


            JLabel lblPeso = new JLabel("Ingrese el peso en KG");
            JTextField textPeso = new JTextField(10);

            JLabel lblAltura = new JLabel("Ingrese la altura en metros");
            JTextField textAltura = new JTextField(10);

            JButton btnCalcular = new JButton("Calcular IMC");

            JLabel lblResultado = new JLabel("El resultado aparecerá aquí");

            panel.add(lblPeso);
            panel.add(textPeso);

            panel.add(lblAltura);
            panel.add(textAltura);

            panel.add(btnCalcular);
            panel.add(new JLabel(""));

            panel.add(lblResultado);
            panel.add(new JLabel(""));

            btnCalcular.addActionListener(e -> {

                double peso = Double.parseDouble(textPeso.getText());

                double altura = Double.parseDouble(textAltura.getText());

                double imc = peso/(altura*altura);

                lblResultado.setText("IMC: " + String.format("%.2f", imc));

            });

            ventana.add(panel);
            ventana.setVisible(true);

        });

    }

}
