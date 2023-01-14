import  javax.swing.*;
import  java.io.File;
import java.io.FileNotFoundException;
import  java.util.Scanner;

public class pages {
    public static void main(String[] args) throws FileNotFoundException {

//        pages()
        for (; ; ) {
            int a = Integer.parseInt(JOptionPane.showInputDialog(null, "enter OPTION TO selct page  \\n\\n\\t(1) students  \\n\\n\\t(2) teacher  \\n\\n\\t(3)organization  \\n\\n\\t(4)privacy-policy  \\n\\n\\t(5) exit"));

//
            if (a == 1) {


                File file = new File("students.txt");
                Scanner sc = new Scanner(file);

                // we just need to use \\Z as delimiter
                sc.useDelimiter("\\Z");

                JOptionPane.showMessageDialog(null, sc.next());
            } else if (a == 2) {
                File file = new File("teacher.txt");
                Scanner sc = new Scanner(file);

                // we just need to use \\Z as delimiter
                sc.useDelimiter("\\Z");

                JOptionPane.showMessageDialog(null, sc.next());
            } else if (a == 3) {
                File file = new File("organization.txt");
                Scanner sc = new Scanner(file);

                // we just need to use \\Z as delimiter
                sc.useDelimiter("\\Z");

                JOptionPane.showMessageDialog(null, sc.next());
            } else if (a == 4) {
                File file = new File("privacy.txt");
                Scanner sc = new Scanner(file);

                // we just need to use \\Z as delimiter
                sc.useDelimiter("\\Z");

                JOptionPane.showMessageDialog(null, sc.next());

            } else if (a == 5) {
                break;
            }
            {

            }
        }
    }
}