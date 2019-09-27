import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *This class creates a form which shows the necessary input output
 * areas
 * @author Osman Akkus
 */
public class SolverUI extends javax.swing.JFrame {
    /**
     * Creates new form SolverUI
     */
    public SolverUI() {
        initComponents();

        Solver method1 = new GaussianElimination();
        Solver method2 = new MatrixInversion();

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] textArea = inputsTextArea.getText().split("\n");

                Integer length = Integer.valueOf(textArea[0]);
                double[][] X = new double[length][length];
                double[] Y = new double[length];
                for (int i = 1; i <= length; i++) {
                    String[] row = textArea[i].split(",");
                    for (int j = 0; j < row.length; j++) {
                        X[i-1][j] = Double.valueOf(row[j]);
                    }
                }
                for (int i = 0; i< length; i++){
                    String[] row = textArea[length+1].split(",");
                    for (int j = 0; j < row.length; j++) {
                        Y[j] = Double.valueOf(row[j]);
                    }
                }

                String selectedItem = (String) cbChoices.getSelectedItem();
                if(selectedItem.equals("Gaussian Elimination")){
                    double[] result = method1.showRes(X, Y);
                    String text = "";
                    for (int i = 0; i < result.length; i++) {
                        text += result[i];
                        text += "\n";
                    }
                    linearEquationsTextArea.setText(text);
                }
                else if(selectedItem.equals("Matrix Inversion")){
                    double[] result = method2.showRes(X, Y);
                    String text = "";
                    for (int i = 0; i < result.length; i++) {
                        text += result[i];
                        text += "\n";
                    }
                    linearEquationsTextArea.setText(text);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        cbChoices = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        linearEquationsTextArea = new javax.swing.JTextArea();
        programLabel = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputsTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbChoices.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gaussian Elimination", "Matrix Inversion" }));

        linearEquationsTextArea.setColumns(20);
        linearEquationsTextArea.setRows(5);
        jScrollPane1.setViewportView(linearEquationsTextArea);

        programLabel.setText("LINUX SOLVER DELUXE");

        btnCalculate.setText("Calculate");

        inputsTextArea.setColumns(20);
        inputsTextArea.setRows(5);
        inputsTextArea.setText("3\n2,4,7\n6,7,-1\n2,0,1\n1,2,6");
        jScrollPane2.setViewportView(inputsTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(83, Short.MAX_VALUE)
                                .addComponent(cbChoices, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(162, 162, 162)
                                                                .addComponent(btnCalculate))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(105, 105, 105)
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(programLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(programLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbChoices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCalculate)
                                .addGap(13, 13, 13)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SolverUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolverUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolverUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolverUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SolverUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnCalculate;
    private javax.swing.JComboBox<String> cbChoices;
    private javax.swing.JTextArea inputsTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea linearEquationsTextArea;
    private javax.swing.JLabel programLabel;
    // End of variables declaration
}