import javax.swing.JOptionPane;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        // Nhập các hệ số a và b
        String strA = JOptionPane.showInputDialog("Nhập hệ số a:");
        String strB = JOptionPane.showInputDialog("Nhập hệ số b:");

        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm vì a = 0.");
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "Nghiệm của phương trình là: x = " + x);
        }
    }
}
