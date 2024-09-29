import javax.swing.JOptionPane;

public class HePhuongTrinhBacNhat {
    public static void main(String[] args) {
        // Nhập các hệ số
        String strA11 = JOptionPane.showInputDialog("Nhập hệ số a11:");
        String strA12 = JOptionPane.showInputDialog("Nhập hệ số a12:");
        String strB1 = JOptionPane.showInputDialog("Nhập hệ số b1:");
        String strA21 = JOptionPane.showInputDialog("Nhập hệ số a21:");
        String strA22 = JOptionPane.showInputDialog("Nhập hệ số a22:");
        String strB2 = JOptionPane.showInputDialog("Nhập hệ số b2:");

        double a11 = Double.parseDouble(strA11);
        double a12 = Double.parseDouble(strA12);
        double b1 = Double.parseDouble(strB1);
        double a21 = Double.parseDouble(strA21);
        double a22 = Double.parseDouble(strA22);
        double b2 = Double.parseDouble(strB2);

        // Tính các định thức
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                JOptionPane.showMessageDialog(null, "Hệ phương trình có vô số nghiệm.");
            } else {
                JOptionPane.showMessageDialog(null, "Hệ phương trình vô nghiệm.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            JOptionPane.showMessageDialog(null, "Nghiệm của hệ phương trình là: x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
