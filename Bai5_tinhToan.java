import javax.swing.JOptionPane;

public class tinhToan {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog("Số thứ nhất:");
        String strNum2 = JOptionPane.showInputDialog("Số thứ hai:");

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double tong = num1 + num2;
        double hieu = num1 - num2;
        double tich = num1 * num2;
        double thuong = num2 != 0 ? num1 / num2 : Double.NaN;

        // Sửa lỗi biến và chuỗi hiển thị
        String result = "Tổng: " + tong + "\nHiệu: " + hieu + "\nTích: " + tich + "\nThương: " + (num2 != 0 ? thuong : "Chia cho 0");

        JOptionPane.showMessageDialog(null, result);
    }
}
