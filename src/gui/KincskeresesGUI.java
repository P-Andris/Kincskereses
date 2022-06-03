/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

/**
 *
 * @author pille
 */
public class KincskeresesGUI extends javax.swing.JFrame {

    /**
     * Creates new form KincskeresesGUI
     */
    public KincskeresesGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCim = new javax.swing.JLabel();
        lblKerdes = new javax.swing.JLabel();
        pnlSzovegek = new javax.swing.JPanel();
        lblBronzSzoveg = new javax.swing.JLabel();
        lblAranySzoveg = new javax.swing.JLabel();
        lblEzustSzoveg = new javax.swing.JLabel();
        pnlGombok = new javax.swing.JPanel();
        btnEzust = new javax.swing.JButton();
        btnBronz = new javax.swing.JButton();
        btnArany = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblCim.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCim.setText("Kincskeresés");

        lblKerdes.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblKerdes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKerdes.setText("Melyik ládában van a kincs?");

        pnlSzovegek.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "A ládákra vésett szövegek"));

        lblBronzSzoveg.setText("Az arany hazudik");

        lblAranySzoveg.setText("Nálam van a kincs");

        lblEzustSzoveg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEzustSzoveg.setText("Nem nálam van a kincs");

        javax.swing.GroupLayout pnlSzovegekLayout = new javax.swing.GroupLayout(pnlSzovegek);
        pnlSzovegek.setLayout(pnlSzovegekLayout);
        pnlSzovegekLayout.setHorizontalGroup(
            pnlSzovegekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSzovegekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAranySzoveg)
                .addGap(18, 18, 18)
                .addComponent(lblEzustSzoveg, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblBronzSzoveg)
                .addContainerGap())
        );
        pnlSzovegekLayout.setVerticalGroup(
            pnlSzovegekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSzovegekLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSzovegekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAranySzoveg)
                    .addComponent(lblEzustSzoveg)
                    .addComponent(lblBronzSzoveg))
                .addContainerGap())
        );

        pnlGombok.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnEzust.setBackground(new java.awt.Color(204, 204, 204));
        btnEzust.setText("Ezüst");
        btnEzust.setMaximumSize(new java.awt.Dimension(75, 75));
        btnEzust.setMinimumSize(new java.awt.Dimension(75, 75));
        btnEzust.setPreferredSize(new java.awt.Dimension(75, 75));

        btnBronz.setBackground(new java.awt.Color(255, 153, 51));
        btnBronz.setText("Bronz");
        btnBronz.setMaximumSize(new java.awt.Dimension(75, 75));
        btnBronz.setMinimumSize(new java.awt.Dimension(75, 75));
        btnBronz.setPreferredSize(new java.awt.Dimension(75, 75));

        btnArany.setBackground(new java.awt.Color(204, 204, 0));
        btnArany.setText("Arany");
        btnArany.setMaximumSize(new java.awt.Dimension(75, 75));
        btnArany.setMinimumSize(new java.awt.Dimension(75, 75));
        btnArany.setPreferredSize(new java.awt.Dimension(75, 75));

        javax.swing.GroupLayout pnlGombokLayout = new javax.swing.GroupLayout(pnlGombok);
        pnlGombok.setLayout(pnlGombokLayout);
        pnlGombokLayout.setHorizontalGroup(
            pnlGombokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGombokLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGombokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGombokLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnEzust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlGombokLayout.createSequentialGroup()
                        .addComponent(btnArany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBronz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlGombokLayout.setVerticalGroup(
            pnlGombokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGombokLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGombokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnArany, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGombokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEzust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBronz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKerdes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSzovegek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlGombok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCim)
                .addGap(26, 26, 26)
                .addComponent(lblKerdes)
                .addGap(29, 29, 29)
                .addComponent(pnlSzovegek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(pnlGombok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArany;
    private javax.swing.JButton btnBronz;
    private javax.swing.JButton btnEzust;
    private javax.swing.JLabel lblAranySzoveg;
    private javax.swing.JLabel lblBronzSzoveg;
    private javax.swing.JLabel lblCim;
    private javax.swing.JLabel lblEzustSzoveg;
    private javax.swing.JLabel lblKerdes;
    private javax.swing.JPanel pnlGombok;
    private javax.swing.JPanel pnlSzovegek;
    // End of variables declaration//GEN-END:variables
}