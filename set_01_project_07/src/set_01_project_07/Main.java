package set_01_project_07;

import java.util.Locale;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // If locale is Polish, floating point numbers
        // have to be entered with  c o m m a  as the
        // decimal separator. Locale can be changed to,
        // e.g., American, by uncommenting the line below:
        //    Locale.setDefault(Locale.US);
        // (then the dot is is used as decimal separator).
        // When reading data, any nonempty sequence of
        // white characters is treated as a separator.

		double a = 0;
		double b = 0;
		double c = 0;

        Locale.setDefault(Locale.US);

        Object[] options = { "OK", "CANCEL" };

		while(a == 0) {
			try {
				String a_string = JOptionPane.showInputDialog("Enter value for \"a\"");
				a = Double.parseDouble(a_string);
				if(a == 0) {
					break;
				}
			} catch(NumberFormatException ex) {
				JOptionPane.showOptionDialog(null, "Got wrong \"a\" value", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

			}
		}

		while(b == 0) {
			try {
				String b_string = JOptionPane.showInputDialog("Enter value for \"b\"");
				b = Double.parseDouble(b_string);
				if(b == 0) {
					break;
				}
			} catch(NumberFormatException ex) {
				JOptionPane.showOptionDialog(null, "Got wrong \"b\" value", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

			}
		}

		while(c == 0) {
			try {
				String a_string = JOptionPane.showInputDialog("Enter value for \"c\"");
				c = Double.parseDouble(a_string);
				if(c == 0) {
					break;
				}
			} catch(NumberFormatException ex) {
				JOptionPane.showOptionDialog(null, "Got wrong \"c\" value", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

			}
		}

		double delta = Math.pow(b, 2) - (4 * a * c);

		if(delta < 0) {
			JOptionPane.showOptionDialog(null, "Delta cannot be a negative number", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
		} else {
			double delta_sq = Math.sqrt(delta);

			double solutuion_1 = (b*(-1) - delta_sq) / 2 * a;
			double solutuion_2 = (b*(-1) + delta_sq) / 2 * a;

			String answer = "\"x\" is both " + solutuion_1 + " and " + solutuion_2;

			JOptionPane.showOptionDialog(null, answer, "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

		}

	}
}
