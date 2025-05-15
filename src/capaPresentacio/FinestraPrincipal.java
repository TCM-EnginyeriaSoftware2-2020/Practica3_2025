package capaPresentacio;


import capaDomini.AbstractProduct;
import capaDomini.GestorProductes;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class FinestraPrincipal extends JFrame {

        private JTable taulaProductes;
        private DefaultTableModel modelTaula;
        private JComboBox<String> comboOrdenacio;
        private GestorProductes gestor;

    private FinestraPrincipal() {
            super("Visualitzador de Productes");

            gestor = new GestorProductes();
            inicialitzarComponents();

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(700, 400);
            setLocationRelativeTo(null);
            setVisible(true);
        }

        private void inicialitzarComponents() {
            // Taula
            modelTaula = new DefaultTableModel(new Object[]{"ID", "Descripció", "Preu", "Venuts"}, 0);
            taulaProductes = new JTable(modelTaula);
            JScrollPane scroll = new JScrollPane(taulaProductes);

            // Combo d'ordenació
            comboOrdenacio = new JComboBox<>(); //TODO inclou un mètode estàtic al patró estratègia per obtenir els labels
            JButton botoOrdenar = new JButton("Ordenar");
            JButton botoAfegirExtern = new JButton("Importar externs");

            // Panell de control
            JPanel panellControls = new JPanel();
            panellControls.add(comboOrdenacio);
            panellControls.add(botoOrdenar);
            panellControls.add(botoAfegirExtern);

            // Layout
            setLayout(new BorderLayout());
            add(scroll, BorderLayout.CENTER);
            add(panellControls, BorderLayout.SOUTH);

            // Accions
            botoOrdenar.addActionListener(e -> ordenarProductes());
            botoAfegirExtern.addActionListener(e -> importarProductesExterns());

            // Inicialitzar amb productes buits
            refrescarTaula();
        }

        private void ordenarProductes() {
        // TODO utilitza el patró estratègia per ordenar les dades
            refrescarTaula();
        }

        private void importarProductesExterns() {
            gestor.importarProductesExterns();
            this.ordenarProductes();
        }

        private void refrescarTaula() {
            modelTaula.setRowCount(0); // Esborrar dades anteriors
            for (AbstractProduct p : gestor.getProductes()) {
                modelTaula.addRow(new Object[]{
                        p.getId(),
                        p.getDescripcio(),
                        String.format("%.2f", p.getPreu()),
                        p.getVenuts()
                });
            }
        }

        // Mètode main per executar la finestra
        public static void main(String[] args) {
            SwingUtilities.invokeLater(FinestraPrincipal::new);
        }
}
