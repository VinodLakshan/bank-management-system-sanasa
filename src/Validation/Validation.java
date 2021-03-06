package Validation;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.*;

/**
 *
 * @author Vihanga
 */
public class Validation {

    /**
     * Validate text to accept a mobile number
     *
     * @param textField
     * @param evt
     */
    public static void phoneNumber(JTextField textField, KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
        }
        String txt = textField.getText();
        int caretPosition = textField.getCaretPosition();
        if (!txt.matches("^[0-9]{0,10}$")) {
            txt = txt.substring(0, caretPosition - 1) + txt.substring(caretPosition);
            textField.setText(txt);
            textField.setCaretPosition(caretPosition - 1);
        }

    }

    /**
     * Validate double value to 2 decimal points including separators
     *
     * @return formated value
     */
    public static String formatDouble(double d) {
        return new DecimalFormat("#,###.00").format(d);
    }

    /**
     * Validate String price value(with or without separators) to 2 decimal
     * points including separators
     *
     * @return formated value
     */
    public static String formatDouble(String d) {
        return new DecimalFormat("#,###.00").format(Double.parseDouble(d.replace(",", "")));
    }

    /**
     * Validate text to accept a price
     */
    public static void priceText(JTextField textField) {
        String text = textField.getText();
        if (!text.isEmpty()) {
            boolean res = text.matches("[0-9]+[.]?[0-9]{0,2}");
            if (!res) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        }
    }

    /**
     * Validate text to accept a limited number of integers
     */
    public static void limitesIntegers(JTextField textField, int value) {
        String txt = textField.getText();
        int caretPosition = textField.getCaretPosition();
        if (!txt.matches("^[0-9]{0," + value + "}$")) {
            txt = txt.substring(0, caretPosition - 1) + txt.substring(caretPosition);
            textField.setText(txt);
            textField.setCaretPosition(caretPosition - 1);
        }
    }

    /**
     * Validate text to accept a limited number of integers with minus values
     */
    public static void limitesIntegerWithNegetive(JTextField textField, int value) {
        String txt = textField.getText();
        int caretPosition = textField.getCaretPosition();
        if (!txt.matches("^-?[0-9]{0," + value + "}$")) {
            txt = txt.substring(0, caretPosition - 1) + txt.substring(caretPosition);
            textField.setText(txt);
            textField.setCaretPosition(caretPosition - 1);
        }
    }

    /**
     * Validate text to accept a NIC
     */
    public static void textNIC(JTextField textField) {
        String text = textField.getText();
        if (!text.isEmpty()) {
            boolean res = text.matches("[0-9]{0,9}[v]{0,1}");
            if (!res) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        }
    }

    /**
     * Validate text to accept a vehicle registration number (Sri Lanka)
     */
    public static void vehicleRegistratioin(JTextField textField) {
        String txt = textField.getText();
        int caretPosition = textField.getCaretPosition();
        if (!txt.matches("^[A-Za-z]{0,2}[ ]{0,1}[A-Za-z0-9]{0,3}{0,2}+[-]{0,1}?[0-9]{0,4}")) {
            textField.setText(txt.substring(0, caretPosition - 1) + txt.substring(caretPosition));
            textField.setCaretPosition(caretPosition - 1);
        }
    }

    /**
     * Validate text to accept a year
     */
    public static void textYear(JTextField textField) {
        String text = textField.getText();
        if (!text.isEmpty()) {
            boolean res = text.matches("[0-9]{0,4}");
            if (!res) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        }
    }

    /**
     * Validate text to accept a new NIC
     */
    public static void textNewNIC(JTextField textField) {
        String text = textField.getText();
        if (!text.isEmpty()) {
            boolean res = text.matches("[0-9]{0,12}");
            if (!res) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        }
    }

    /**
     * Validate text to accept engine capacity
     */
    public static void engineCapacity(JTextField textField) {
        String text = textField.getText();
        if (!text.isEmpty()) {
            boolean res = text.matches("[0-9]{0,4}[c]{0,2}");//delete [c]{0,2} if "CC" is not needed
            if (!res) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        }
    }

    /**
     * Validate text to accept letters only
     */
    public static void name(JTextField textField) {
        String txt = textField.getText();
        int caretPosition = textField.getCaretPosition();
        if (!txt.matches("^[A-Za-z// ]*$")) {
            textField.setText(txt.substring(0, caretPosition - 1) + txt.substring(caretPosition));
            textField.setCaretPosition(caretPosition - 1);
        }
    }

    public static void Reason(JTextArea textArea) {
        String txt = textArea.getText();
        int caretPosition = textArea.getCaretPosition();
        if (!txt.matches("^[A-Za-z// ]*$")) {
            textArea.setText(txt.substring(0, caretPosition - 1) + txt.substring(caretPosition));
            textArea.setCaretPosition(caretPosition - 1);
        }
    }
    /**
     * Validate text to accept numbers only
     */
    public static void numberOnly(JTextField textField) {
        String txt = textField.getText();
        int caretPosition = textField.getCaretPosition();
        if (!txt.matches("^[\\d]*")) {
            textField.setText(txt.substring(0, caretPosition - 1) + txt.substring(caretPosition));
            textField.setCaretPosition(caretPosition - 1);
        }
    }

    /**
     * Validate text to accept old NIC
     */
    public static void validateNIC(JTextField nicText) {
        String text = nicText.getText();
        boolean matches = text.matches("[\\d]{0,9}");
        if (!matches) {
            nicText.setText(text.substring(0, text.length() - 1));
        }
        boolean matches1 = text.matches("[\\d]{9}");
        if (matches1) {
            nicText.setText(nicText.getText() + "V");
        }
    }


    /*public static void validationEmail(JTextField textField) {
     String text = textField.getText();
     if (!text.isEmpty()) {
     boolean res = text.matches("^[(a-zA-Z-0-9-\\\\_\\\\+\\\\.)]+@[(a-z-A-z)]+\\\\.[(a-zA-z)]{2,3}$");
     if (!res) {
     textField.setText(text.substring(0, text.length() - 1));
     }
     }
     }*/
}
