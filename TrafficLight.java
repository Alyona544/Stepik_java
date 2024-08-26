import javax.swing.*;
import java.awt.*;

public class TrafficLight extends JFrame {

    public TrafficLight() {
        setTitle("Светофор");
        setSize(200, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1)); // Используем сетку 3x1 для размещения кругов

        // Создаем панели для каждого цвета
        JPanel redLight = createLightPanel(Color.RED);
        JPanel yellowLight = createLightPanel(Color.YELLOW);
        JPanel greenLight = createLightPanel(Color.GREEN);

        // Добавляем панели в окно
        add(redLight);
        add(yellowLight);
        add(greenLight);
    }

    private JPanel createLightPanel(Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK); // Фон черный, как у светофора
        panel.setPreferredSize(new Dimension(100, 100)); // Устанавливаем размер панели
        panel.setLayout(new GridBagLayout());

        // Создаем круглый свет
        JPanel light = new JPanel();
        light.setBackground(color);
        light.setPreferredSize(new Dimension(80, 80)); // Размер круга
        light.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5)); // Белая рамка

        // Добавляем круглый свет в панель
        panel.add(light);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TrafficLight trafficLight = new TrafficLight();
            trafficLight.setVisible(true);
        });
    }
}