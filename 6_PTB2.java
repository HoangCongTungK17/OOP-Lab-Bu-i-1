import javax.swing.JOptionPane;

public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        // Nhập các hệ số a, b, c
        String strA = JOptionPane.showInputDialog("Nhập hệ số a:");
        String strB = JOptionPane.showInputDialog("Nhập hệ số b:");
        String strC = JOptionPane.showInputDialog("Nhập hệ số c:");

        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        double c = Double.parseDouble(strC);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Đây không phải phương trình bậc hai vì a = 0.");
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, "Phương trình có nghiệm kép: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "Phương trình có 2 nghiệm: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}
