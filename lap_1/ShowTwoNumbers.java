package lap_1;

import javax.swing.JOptionPane;

public class ShowTwoNumbers {
       public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You're just entered: ";

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Inout the first number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " add ";

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Inout the second number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;

        Double num1 = Double.parseDouble(strNum1);
        Double num2 = Double.parseDouble(strNum2);
        Double sum = num1 + num2;
        
      
        JOptionPane.showMessageDialog(null,"Sum of " + num1 + " and "+ num2+ " is " + (num1 + num2) , "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"difference of " + num1 + " and "+ num2+ " is " + (num1 - num2) , "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"product of " + num1 + " and "+ num2+ " is " + (num1 * num2) , "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"quotient of " + num1 + " and "+ num2+ " is " + (num1 / num2) , "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
              
        System.exit(0);
       } 
}
