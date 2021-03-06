/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package possystem;
import java.util.*;
import java.awt.*;
import java.text.NumberFormat;
/**
 *
 * @author russelndip
 */
public class POSmain extends javax.swing.JFrame {

   Sale newSale;
   Cashier newCashier;
   Inventory inventory;
   Return newReturn;
   protected ReceiptList salesReport;
    public POSmain() {
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

        jPanel1 = new javax.swing.JPanel();
        MainScreen = new javax.swing.JPanel();
        NewSaleButton = new javax.swing.JButton();
        NewReturnButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NewSale = new javax.swing.JPanel();
        SaleOptions = new javax.swing.JPanel();
        MainSale = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CompleteSale = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        yourTotalLabel = new javax.swing.JLabel();
        AmtPaidLabel = new javax.swing.JLabel();
        changeAmtLabel = new javax.swing.JLabel();
        changeTextField = new javax.swing.JTextField();
        NewReturn = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        enterItemTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        totalAmt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        saleTable = new javax.swing.JTable();
        quanField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1256, 800));

        jPanel1.setLayout(new java.awt.CardLayout());

        MainScreen.setBackground(new java.awt.Color(230, 232, 238));
        MainScreen.setPreferredSize(new java.awt.Dimension(1431, 749));

        NewSaleButton.setBackground(new java.awt.Color(138, 158, 202));
        NewSaleButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        NewSaleButton.setText("New Sale");
        NewSaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newsale(evt);
            }
        });

        NewReturnButton.setBackground(new java.awt.Color(138, 158, 202));
        NewReturnButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        NewReturnButton.setText("New Return");
        NewReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newReturn(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("PT Sans Narrow", 1, 70)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(34, 73, 130));
        jLabel6.setText("Littlest Pet Shop");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("Click to start");

        javax.swing.GroupLayout MainScreenLayout = new javax.swing.GroupLayout(MainScreen);
        MainScreen.setLayout(MainScreenLayout);
        MainScreenLayout.setHorizontalGroup(
            MainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainScreenLayout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(NewSaleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(NewReturnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(409, 409, 409))
            .addGroup(MainScreenLayout.createSequentialGroup()
                .addGap(558, 558, 558)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MainScreenLayout.createSequentialGroup()
                .addGap(418, 418, 418)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MainScreenLayout.setVerticalGroup(
            MainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainScreenLayout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NewSaleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MainScreenLayout.createSequentialGroup()
                        .addComponent(NewReturnButton, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addGap(140, 140, 140))
        );

        jPanel1.add(MainScreen, "mainscreencard");

        NewSale.setBackground(new java.awt.Color(230, 232, 238));

        SaleOptions.setLayout(new java.awt.CardLayout());

        jButton2.setText("Remove Item");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItem(evt);
            }
        });

        jButton4.setText("Cancel Sale");

        jButton6.setText("Complete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeSale(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Total");

        javax.swing.GroupLayout MainSaleLayout = new javax.swing.GroupLayout(MainSale);
        MainSale.setLayout(MainSaleLayout);
        MainSaleLayout.setHorizontalGroup(
            MainSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainSaleLayout.createSequentialGroup()
                .addGroup(MainSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainSaleLayout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel2))
                    .addGroup(MainSaleLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(MainSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        MainSaleLayout.setVerticalGroup(
            MainSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainSaleLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(160, 160, 160)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        SaleOptions.add(MainSale, "card2");

        jButton5.setText("Enter Payment");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("Print Receipt");

        yourTotalLabel.setText("Your Total is:");

        AmtPaidLabel.setText("Amt Paid:");

        changeAmtLabel.setText("Change Amount");

        changeTextField.setText("Enter Amount");

        javax.swing.GroupLayout CompleteSaleLayout = new javax.swing.GroupLayout(CompleteSale);
        CompleteSale.setLayout(CompleteSaleLayout);
        CompleteSaleLayout.setHorizontalGroup(
            CompleteSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CompleteSaleLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(CompleteSaleLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addGroup(CompleteSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changeAmtLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(CompleteSaleLayout.createSequentialGroup()
                        .addComponent(AmtPaidLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41))
                    .addGroup(CompleteSaleLayout.createSequentialGroup()
                        .addComponent(yourTotalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17)))
                .addGap(261, 261, 261))
            .addGroup(CompleteSaleLayout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(changeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CompleteSaleLayout.setVerticalGroup(
            CompleteSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CompleteSaleLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(yourTotalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addGap(102, 102, 102)
                .addComponent(AmtPaidLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addGap(82, 82, 82)
                .addComponent(changeAmtLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addGap(72, 72, 72)
                .addComponent(changeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(CompleteSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        SaleOptions.add(CompleteSale, "completeSalecard");

        jButton3.setText("Return Item");

        jButton8.setText("Return All");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnAll(evt);
            }
        });

        jButton9.setText("Complete Return");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeReturn(evt);
            }
        });

        javax.swing.GroupLayout NewReturnLayout = new javax.swing.GroupLayout(NewReturn);
        NewReturn.setLayout(NewReturnLayout);
        NewReturnLayout.setHorizontalGroup(
            NewReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewReturnLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(NewReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addGroup(NewReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)))
                .addGap(80, 80, 80))
        );
        NewReturnLayout.setVerticalGroup(
            NewReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewReturnLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        SaleOptions.add(NewReturn, "returncard");

        enterItemTextField.setText("Enter Item Sku");
        enterItemTextField.setToolTipText("");
        enterItemTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterItem(evt);
            }
        });

        jButton1.setText("Enter");
        jButton1.setToolTipText("");
        jButton1.setDisabledIcon(new javax.swing.ImageIcon("/Users/russelndip/Documents/enterbutton.jpg")); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Subtotal");

        jLabel8.setText("Taxes");

        jLabel9.setText("Total");

        jLabel10.setText("jLabel10");

        jLabel11.setText("jLabel11");

        totalAmt.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        totalAmt.setForeground(new java.awt.Color(204, 0, 51));
        totalAmt.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(320, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalAmt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(totalAmt))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        saleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Sku", "Description", "Price", "Quantity", "Total Price"
            }
        ));
        jScrollPane1.setViewportView(saleTable);

        quanField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Quanity");

        errorMessage.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout NewSaleLayout = new javax.swing.GroupLayout(NewSale);
        NewSale.setLayout(NewSaleLayout);
        NewSaleLayout.setHorizontalGroup(
            NewSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewSaleLayout.createSequentialGroup()
                .addGroup(NewSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewSaleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(NewSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NewSaleLayout.createSequentialGroup()
                                .addComponent(enterItemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quanField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(NewSaleLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(NewSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SaleOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        NewSaleLayout.setVerticalGroup(
            NewSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewSaleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NewSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewSaleLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NewSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterItemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(quanField, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(NewSaleLayout.createSequentialGroup()
                        .addComponent(SaleOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1.add(NewSale, "newsalecard");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1287, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1287, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newsale(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newsale
       //CardLayout card = (CardLayout)jPanel1.getLayout();
       //card.show(jPanel1, "newsalepanel");
       java.awt.CardLayout cards = (java.awt.CardLayout) jPanel1.getLayout();
       cards.show(jPanel1, "newsalecard");
       newSale = new Sale(CashierID); //remember to add the call method from logIn
       
    }//GEN-LAST:event_newsale

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void completeSale(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeSale
        //newSale = new Sale();
       // newSale.completeSale();
        
       java.awt.CardLayout cards = (java.awt.CardLayout) SaleOptions.getLayout();
        cards.show(SaleOptions, "completeSalecard");
               
    }//GEN-LAST:event_completeSale

    private void newReturn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newReturn
       java.awt.CardLayout cards = (java.awt.CardLayout) jPanel1.getLayout();
       cards.show(jPanel1, "newsalecard");
        java.awt.CardLayout cards2 = (java.awt.CardLayout) SaleOptions.getLayout();
        cards2.show(SaleOptions, "returncard");
        enterItemTextField.setText("Enter Receipt #");
        newReturn = new Return(CashierID); //same thing here as before
        
    }//GEN-LAST:event_newReturn

    private void completeReturn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeReturn
        java.awt.CardLayout cards = (java.awt.CardLayout) SaleOptions.getLayout();
        cards.show(SaleOptions, "completeSalecard");
        AmtPaidLabel.setVisible(false);
        changeAmtLabel.setVisible(false);
        changeTextField.setVisible(false);
        newReturn.finalizeReturn();
    }//GEN-LAST:event_completeReturn

    private void removeItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItem
       saleTable.getFocusListeners()
    }//GEN-LAST:event_removeItem

    private void returnAll(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnAll
       
    }//GEN-LAST:event_returnAll

    private void quanFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quanFieldActionPerformed

    private void enterItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterItem
       if(quanField.getText=" ")
           errorMessage.setText("enter quantity amount");
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) saleTable.getModel();
        Item addItem = inventory.findItem(parseDouble(enterItemTextField.getText()));
        int quantity = parseInt(quanField.getText());
        ReceiptNode saleItem= new ReceiptNode(addItem, quantity;
        model.addRow(saleItem);
        
        NumberFormat fmt = new NumberFormat.getCurrencyInstance();
        
        totalAmt.setText(fmt.format(newSale.getPayAmt()));
        
        
        
    }//GEN-LAST:event_enterItem

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
            java.util.logging.Logger.getLogger(POSmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POSmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POSmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POSmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POSmain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AmtPaidLabel;
    private javax.swing.JPanel CompleteSale;
    private javax.swing.JPanel MainSale;
    private javax.swing.JPanel MainScreen;
    private javax.swing.JPanel NewReturn;
    private javax.swing.JButton NewReturnButton;
    private javax.swing.JPanel NewSale;
    private javax.swing.JButton NewSaleButton;
    private javax.swing.JPanel SaleOptions;
    private javax.swing.JLabel changeAmtLabel;
    private javax.swing.JTextField changeTextField;
    private javax.swing.JTextField enterItemTextField;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField quanField;
    private javax.swing.JTable saleTable;
    private javax.swing.JLabel totalAmt;
    private javax.swing.JLabel yourTotalLabel;
    // End of variables declaration//GEN-END:variables
}
