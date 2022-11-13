package view;

import javax.swing.*;
import java.awt.*;

public class DialogBook extends JDialog {//Esta es una ventanita auxiliar que se abre cuando se quiere ver los detalles de un libro
    private JPanel bookPanel;
    private JButton rentButton;

    public DialogBook(JFrame parent, boolean modal, JPanel bookPanel){//El dialogo recibe el panel del libro que se quiere ver
        //parent es la ventana principal, modal es para que no se pueda interactuar con la ventana principal mientras esta esta abierta
        super(parent, modal);
        this.bookPanel = bookPanel;
        setTitle("Book");
        setSize(200, 300);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));//Este layout es para que los componentes se alineen verticalmente

        rentButton = new JButton("Rent");
        rentButton.setBorderPainted(false);//Se quita el borde del boton
        rentButton.setAlignmentX(Component.CENTER_ALIGNMENT);//Se alinea el boton al centro
        rentButton.setBackground(Color.WHITE);
        add(bookPanel);
        add(rentButton);
        setLocationRelativeTo(null);
    }
}
