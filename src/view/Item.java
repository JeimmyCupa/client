package view;

import javax.swing.*;
import java.awt.*;

public class Item extends JPanel {
    private String source;
    private JButton frontPage, tittleButton, authorButton, yearButton;//Estos componentes son botones para que el usuario pueda interactuar con ellos
    public Item(String source, String tittle, String author, String year) {
        this.source = source;

        setBackground(Color.WHITE);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();//GridBagLayout constraints es la clase que define las restricciones para un componente de GridBagLayout.

        c.gridx = 0;//Se establece la posicion en x del componente
        c.gridy = 0;//Se establece la posicion en y del componente
        c.insets = new Insets(5, 5, 5, 5);//Se establece el espacio entre componentes

        frontPage = new JButton();
        ImageIcon frontPageIcon = new ImageIcon(source);//Se crea el objeto de la imagen
        //Se le da el tamaño a la imagen
        frontPage.setIcon(new ImageIcon(frontPageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_AREA_AVERAGING)));
        frontPage.setBorderPainted(false);//Se quita el borde del boton
        frontPage.setMargin(new Insets(5,5,5,5));//Se establece el margen del boton
        frontPage.setBackground(Color.WHITE);//Se establece el color de fondo del boton
        add(frontPage, c);//Se agrega el boton al panel junto con la posicion impuesta por el objeto c

        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(5, 5, 5, 5);
        tittleButton = new JButton(tittle);
        tittleButton.setBorderPainted(false);//Se quita el borde del boton
        tittleButton.setBackground(Color.WHITE);//Se establece el color de fondo del boton
        add(tittleButton, c);

        c.gridx = 0;
        c.gridy = 2;
        c.insets = new Insets(5, 5, 5, 5);
        authorButton = new JButton(author);
        authorButton.setBorderPainted(false);
        authorButton.setBackground(Color.WHITE);
        add(authorButton, c);

        c.gridx = 0;
        c.gridy = 3;
        c.insets = new Insets(5, 5, 5, 5);
        yearButton = new JButton(year);
        yearButton.setBorderPainted(false);
        yearButton.setBackground(Color.WHITE);
        add(yearButton, c);
    }
}
