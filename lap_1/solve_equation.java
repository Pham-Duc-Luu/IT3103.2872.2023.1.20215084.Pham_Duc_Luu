package lap_1;

import javax.swing.JOptionPane;

public class solve_equation {
    public static void main(String[] args) {
        String choose = "1";
        while (Integer.parseInt(choose) != 0) {

            choose = JOptionPane.showInputDialog(null,
                    "(1)Solve first-degree equation with one variable\n\t"
                            + "(2)Solve first-degree equation with two variable\n\t"
                            + "(3)Solve second-degree equation with one variable\n\t"
                            + "(0)Exit\n\t"

                    , null, JOptionPane.INFORMATION_MESSAGE);

            switch (Integer.parseInt(choose)) {
                case 1:
                    String a = JOptionPane.showInputDialog("ax + b = 0 \n\t" + "a: ");
                    String b = JOptionPane.showInputDialog("ax + b = 0 \n\t" + "b: ");

                    Double x = -Double.parseDouble(b) / Double.parseDouble(a);
                    JOptionPane.showMessageDialog(null, "x = " + x);

                    break;

                case 2:
                    Double a1 = Double
                            .parseDouble(
                                    JOptionPane
                                            .showInputDialog("a1*x + b1*y = c1 \n\t a2*x + b2*y = c2 \n\t " + "a1: "));
                    Double b1 = Double
                            .parseDouble(
                                    JOptionPane
                                            .showInputDialog("a1*x + b1*y = c1 \n\t a2*x + b2*y = c2 \n\t " + "b1: "));
                    Double c1 = Double.parseDouble(
                            JOptionPane.showInputDialog("a1*x + b1*y = c1 \n\t a2*x + b2*y = c1 \n\t " + "c2: "));

                    Double a2 = Double
                            .parseDouble(
                                    JOptionPane
                                            .showInputDialog("a1*x + b1*y = c1 \n\t a2*x + b2*y = c2 \n\t " + "a2: "));
                    Double b2 = Double
                            .parseDouble(
                                    JOptionPane
                                            .showInputDialog("a1*x + b1*y = c1 \n\t a2*x + b2*y = c2 \n\t " + "b2: "));
                    Double c2 = Double.parseDouble(
                            JOptionPane.showInputDialog("a1*x + b1*y = c1 \n\t a2*x + b2*y = c2 \n\t " + "c2: "));
                    Double D = a1 * b2 - a2 * b1;
                    if (D == 0) {
                        JOptionPane.showMessageDialog(null, "The system of equations has no unique solution.");
                    } else {
                        Double X = (c1 * b2 - c2 * b1) / D;
                        Double Y = (a1 * c2 - a2 * c1) / D;
                        JOptionPane.showMessageDialog(null, "Solution \n\t x: " + X + "\n\t y: " + Y);

                    }
                    break;

                case 3:
                    Double A = Double.parseDouble(JOptionPane.showInputDialog("a*x^2 + b*x + c = 0 \n\t a: "));
                    Double B = Double.parseDouble(JOptionPane.showInputDialog("a*x^2 + b*x + c = 0 \n\t b: "));
                    Double C = Double.parseDouble(JOptionPane.showInputDialog("a*x^2 + b*x + c = 0 \n\t c: "));

                    Double discriminant = B * B - 4 * A * C;
                    if (discriminant > 0) {
                        double x_1 = (-B + Math.sqrt(discriminant)) / (2 * A);
                        double x_2 = (-B - Math.sqrt(discriminant)) / (2 * A);

                        JOptionPane.showMessageDialog(null,
                                "Two real and distinct solutions: \n\t x_1 =" + x_1 + "\n\t x_2 =" + x_2);
                    } else if (discriminant == 0) {
                        double X = -B / (2 * A);
                        JOptionPane.showMessageDialog(null, "One real solution: \n\t x =" + X);
                    } else {
                        JOptionPane.showMessageDialog(null, "No real solutions");
                    }
                    break;

                default:

                    break;
            }
        }
    }
}
