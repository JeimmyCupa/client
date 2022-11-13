package view;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.event.MouseAdapter;

public class MenuPanel extends JPanel {
    private ActionListener listener;
    private JButton btnProfile, btnMyBooks, btnSearchBooks, btnSingOut;

    public MenuPanel(ActionListener listener) {
        setSize(285, 636);
        setLayout(null);
        setBackground(WindowMain.colorFirst);
        this.listener = listener;
        initComponents();
    }

    //Metodo que inicializa todos los botones del menu
    public void initComponents() {
        btnProfile = new JButton();
        setFeatures(btnProfile);
        btnProfile.setText("Mi perfil");
        btnProfile.setIcon(new ImageIcon("data\\icons\\iconUserCircle.png"));
        btnProfile.setBounds(0, 136, 285, 53);
        btnProfile.setActionCommand("SHOWPROFILE");
        //Evento hover para el boton, necesita como parametro un objeto de MouseAdapter
        btnProfile.addMouseListener(this.mouseEntered());
        btnProfile.addMouseListener(this.mouseExited());
        add(btnProfile);

        btnSearchBooks = new JButton();
        setFeatures(btnSearchBooks);
        btnSearchBooks.setText("Buscar libros");
        btnSearchBooks.setIcon(new ImageIcon("data\\icons\\iconSearch.png"));
        btnSearchBooks.setBounds(0, 192, 285, 53);
        btnSearchBooks.setActionCommand("SEARCHBOOKS");
        btnSearchBooks.addMouseListener(this.mouseEntered());
        btnSearchBooks.addMouseListener(this.mouseExited());
        add(btnSearchBooks);

        btnMyBooks = new JButton();
        setFeatures(btnMyBooks);
        btnMyBooks.setText("Mis libros");
        btnMyBooks.setIcon(new ImageIcon("data\\icons\\iconBook.png"));
        btnMyBooks.setBounds(0, 247, 285, 53);
        btnMyBooks.setActionCommand("SEARCHBOOKS");
        btnMyBooks.addMouseListener(this.mouseEntered());
        btnMyBooks.addMouseListener(this.mouseExited());
        add(btnMyBooks);

        btnSingOut = new JButton();
        setFeatures(btnSingOut);
        btnSingOut.setText("Cerrar sesi\u00F3n");
        btnSingOut.setIcon(new ImageIcon("data\\icons\\iconSingOut.png"));
        btnSingOut.setBounds(0, 302, 285, 53);
        btnSingOut.setActionCommand("SEARCHBOOKS");
        btnSingOut.addMouseListener(this.mouseEntered());
        btnSingOut.addMouseListener(this.mouseExited());
        add(btnSingOut);
    }

    /***
     * Metodo que se encarga de darle las caracteristicas a los botones del menu
     * @param buttonToApply JButton al que se le aplicaran las caracteristicas
     */
    public void setFeatures(JButton buttonToApply) {//**Con este metodo te evitas repetir codigo
        buttonToApply.setIconTextGap(6);
        buttonToApply.setMargin(new Insets(2, 30, 2, 4));
        buttonToApply.setHorizontalTextPosition(SwingConstants.RIGHT);
        buttonToApply.setBorder(new MatteBorder(0, 0, 2, 0, WindowMain.colorLight));
        buttonToApply.setForeground(Color.white);
        buttonToApply.setFont(new Font("Segoe UI", Font.BOLD, 20));
        buttonToApply.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonToApply.setBackground(WindowMain.colorFirst);
        buttonToApply.addActionListener(listener);
    }
    //Metodos para obtener los objetos de la Clase MouseAdapter
    public MouseAdapter mouseEntered() {
        return new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JButton btnEvent = (JButton) e.getSource();
                btnMouseEntered(btnEvent, null);//Llama el metodo creado en la clase para cambiar el color al pasar sobre el boton.
            }
        };
    }

    public MouseAdapter mouseExited() {
        return new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent event) {
                JButton btnEvent = (JButton) event.getSource();//**Si creas la variable btn fuera del metodo, no es necesario que la crees cada vez que se ejecute el metodo mouseExited
                btnMouseExited(btnEvent, null);//Llama al metodo de la clase MenuPanel para volver al color original del boton.
            }
        };
    }
    //Metodos propios de la clase para el efecto Hover

    public void btnMouseEntered(JButton btnEvent, JButton btnChangeColor) {
        if (btnEvent.equals(btnProfile)) btnChangeColor = btnProfile;
        else if (btnEvent.equals(btnSearchBooks)) btnChangeColor = btnSearchBooks;
        else if (btnEvent.equals(btnMyBooks)) btnChangeColor = btnMyBooks;
        else if (btnEvent.equals(btnSingOut)) btnChangeColor = btnSingOut;
        btnChangeColor.setBackground(WindowMain.colorSecond);
    }

    public void btnMouseExited(JButton btnEvent, JButton btnChangeColor) {
        if (btnEvent.equals(btnProfile)) btnChangeColor = btnProfile;
        else if (btnEvent.equals(btnSearchBooks)) btnChangeColor = btnSearchBooks;
        else if (btnEvent.equals(btnMyBooks)) btnChangeColor = btnMyBooks;
        else if (btnEvent.equals(btnSingOut)) btnChangeColor = btnSingOut;
        btnChangeColor.setBackground(WindowMain.colorFirst);
    }
}
