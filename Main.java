import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args){
    
    String input;
    input = JOptionPane.showInputDialog("Number 1: ");
    
    String input2;
    input2 = JOptionPane.showInputDialog("Number 2: ");
    
    int a = Integer.parseInt(input);
    int b = Integer.parseInt(input2);
    
    Double c = Double.parseDouble(input);
    Double d = Double.parseDouble(input2);
    
    int sum = a + b;
    int minus = a - b;
    int multiply = a * b;    
    Double division = c /d;    
    
    System.out.println("Addition: " + sum);
    System.out.println("Subtraction: " + minus);
    System.out.println("Multiplication: " + multiply);
    System.out.println("Division: " + division);  
    
    
    
    }
}
