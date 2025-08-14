/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defencesystem1;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class MainController extends javax.swing.JFrame {
    private final ArrayList<DefenceObserver> observers = new ArrayList<>();

    
    public MainController() {
        initComponents();
    }
    
   public void addObserver(DefenceObserver ob){
        observers.add(ob);
    }
    private void notifyObservers(boolean isCleared){
        for(DefenceObserver o : observers){
            o.updateAreaStatus(isCleared);
        }
    }
    private void notifyButtonLevels(int level){
        for(DefenceObserver o : observers){
            o.notifyObservers(level);
        }
    }
    public void broadCastMessage(String message){
        for(DefenceObserver o : observers){
            o.updateMessage("Main controller : ", message);
        }
    }
    public void recieveMessageFromObserver(String sender,String message){
        mainTxtArea.append((sender+":"+message+"\n"));
    }
    public static void main(String args[]){
        MainController mc=new MainController();
        Tank tank=new Tank();
        Submarine sub=new Submarine();
        Helicopter heli=new Helicopter();
        
        tank.setMainController(mc);
        sub.setMainController(mc);
        heli.setMainController(mc);

        mc.addObserver(tank);
        mc.addObserver(sub);
        mc.addObserver(heli);

        mc.setVisible(true);
        tank.setVisible(true);
        sub.setVisible(true);
        heli.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lbl1 = new javax.swing.JLabel();
        ComboBox1 = new javax.swing.JComboBox<>();
        Count = new javax.swing.JLabel();
        Count1 = new javax.swing.JLabel();
        Count2 = new javax.swing.JLabel();
        Count3 = new javax.swing.JLabel();
        mainSlider = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTxtArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtArea2 = new javax.swing.JTextArea();
        areaClearCheckBox = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        mainTxt1 = new javax.swing.JTextArea();
        CheckBox = new javax.swing.JCheckBox();
        Btn = new javax.swing.JButton();
        sendMain = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 153));

        Lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/defencesystem1/3.png"))); // NOI18N

        ComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecet Defence", "Helicopter", "Tank", "Submarine", " " }));
        ComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox1ActionPerformed(evt);
            }
        });

        Count.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Count.setText("Soldier Count");

        Count1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Count1.setText("Fuel Amount");

        Count2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Count2.setText("Ammo Amount");

        Count3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Count3.setText("Position");

        mainSlider.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mainSlider.setForeground(new java.awt.Color(255, 153, 0));
        mainSlider.setMajorTickSpacing(20);
        mainSlider.setMinorTickSpacing(10);
        mainSlider.setPaintLabels(true);
        mainSlider.setPaintTicks(true);
        mainSlider.setValue(0);
        mainSlider.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                mainSliderAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        mainSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mainSliderStateChanged(evt);
            }
        });

        mainTxtArea.setColumns(20);
        mainTxtArea.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        mainTxtArea.setForeground(new java.awt.Color(255, 102, 0));
        mainTxtArea.setRows(5);
        jScrollPane1.setViewportView(mainTxtArea);

        TxtArea2.setColumns(20);
        TxtArea2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        TxtArea2.setForeground(new java.awt.Color(255, 102, 0));
        TxtArea2.setRows(5);
        jScrollPane2.setViewportView(TxtArea2);

        areaClearCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        areaClearCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        areaClearCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        areaClearCheckBox.setText("Area Clear");
        areaClearCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaClearCheckBoxActionPerformed(evt);
            }
        });

        mainTxt1.setColumns(20);
        mainTxt1.setRows(5);
        jScrollPane3.setViewportView(mainTxt1);

        CheckBox.setBackground(new java.awt.Color(0, 0, 0));
        CheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CheckBox.setForeground(new java.awt.Color(255, 255, 255));
        CheckBox.setText("Send Private");

        Btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btn.setText("Collect information");

        sendMain.setBackground(new java.awt.Color(0, 0, 0));
        sendMain.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sendMain.setForeground(new java.awt.Color(255, 255, 255));
        sendMain.setText("Send");
        sendMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Count3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sendMain, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Count1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Count, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Count2))
                                .addGap(168, 168, 168))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(areaClearCheckBox)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CheckBox)
                                .addGap(129, 129, 129))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaClearCheckBox)
                    .addComponent(Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CheckBox)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Count)
                        .addGap(18, 18, 18)
                        .addComponent(Count1)
                        .addGap(18, 18, 18)
                        .addComponent(Count2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Count3)
                        .addGap(8, 8, 8)
                        .addComponent(mainSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(sendMain)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox1ActionPerformed

    private void areaClearCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaClearCheckBoxActionPerformed
        notifyObservers(areaClearCheckBox.isSelected());
    }//GEN-LAST:event_areaClearCheckBoxActionPerformed

    private void mainSliderAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_mainSliderAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_mainSliderAncestorAdded

    private void mainSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mainSliderStateChanged
        int value = mainSlider.getValue();
        notifyButtonLevels(value);
    }//GEN-LAST:event_mainSliderStateChanged

    private void sendMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMainActionPerformed
        String message = mainTxt1.getText().trim();
        if(!message.isEmpty()){
            broadCastMessage(message);
            mainTxt1.setText("");
        }
    }//GEN-LAST:event_sendMainActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn;
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JLabel Count;
    private javax.swing.JLabel Count1;
    private javax.swing.JLabel Count2;
    private javax.swing.JLabel Count3;
    private javax.swing.JLabel Lbl1;
    private javax.swing.JTextArea TxtArea2;
    private javax.swing.JCheckBox areaClearCheckBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSlider mainSlider;
    private javax.swing.JTextArea mainTxt1;
    private javax.swing.JTextArea mainTxtArea;
    private javax.swing.JButton sendMain;
    // End of variables declaration//GEN-END:variables
}
