package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BooksPanel extends JPanel {
    private ArrayList<Item> items;

    public ArrayList<Item> getItems() {
        return items;
    }

    public BooksPanel() {
        items = new ArrayList<>();
        GridLayout layout = new GridLayout();//Se crea un layout de tipo Grid para la vista de matriz
        layout.setColumns(5); //Se establece el numero de columnas, se puede cambiar sin problemas
        layout.setHgap(10); //Se establece el espacio entre columnas, se puede cambiar sin problemas
        layout.setVgap(10); //Se establece el espacio entre filas

        filThePanel(layout); //Este metodo se encarga de llenar el panel con los items

        setLayout(layout); //Se establece el layout en el panel
    }

    private void filThePanel(GridLayout layout) {
        int count = 0;
        for (int i = 0; i < 18; i++) {//La condicion del for es la cantidad de items que se quieren crear en el panel
            if (count == layout.getColumns()) {//cuando el contador llega a 5 se aumenta el numero de filas
                layout.setRows(layout.getRows()+1);
                count = 0;//se reinicia el contador
            }
            //Se crea un item y se agrega a la lista de items
            Item item = new Item("data/icons/iconUser.png", "Libro: "+i, "Autor: "+i, "Año: "+i);
            items.add(item);
            add(item);
            count++;
        }
    }

    private void initComponent() {

    }

    //Metodo main para probar la vista, es temporal y se puede borrar
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 300);
        frame.setLocationRelativeTo(null);

        BooksPanel booksPanel = new BooksPanel();
        JScrollPane scrollPane = new JScrollPane(booksPanel);//Este es el scroll que se agrega al panel, se debe añadir desde la ventana principal
        frame.add(scrollPane);

        DialogBook dialogBook = new DialogBook(frame, true, booksPanel.getItems().get(0));//Se crea el dialogo para ver el libro
        dialogBook.setVisible(true);

        frame.setVisible(true);
    }
}
