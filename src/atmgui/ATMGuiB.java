package atmgui;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATMGuiB extends javax.swing.JFrame {
    private String userName = "", task = "", pin = "", EUserName = "", EPin = "",
            Network = "", phoneNo = "", bankTransfer = "", accountNoTransfer = ""; 
    private int tri = 1, tid = 3;
    private double depositedAmount, rechargeAmount, F, NewF, transferAmount,
            withdrawAmount;
    private Map<String, String> userz;
    private Map<String, Double> amt ;
    
    public ATMGuiB() {
        initComponents();
        userz = new HashMap();
        userz.put("Muyiwa", "12345");
        userz.put("Ada", "83492");
        userz.put("Aisha", "48822");
        userz.put("Thomas", "89393");
        
        amt = new HashMap();
        amt.put("Muyiwa", 400000.00);
        amt.put("Ada", 550000.00);
        amt.put("Aisha", 700000.00);
        amt.put("Thomas", 850000.00);
    }
    
    public void collectNewUserName(){
        labelC.setText("");
        textField1.setText("");
        labelC.setText(labelC.getText() + "Please input your Name: ");
        task = "collectNewUserName";
    }
    
    public void collectNewPin(){
        labelC.setText(labelC.getText() + "Please input your Pin: ");
        task = "collectNewPin";
    }
    
    public void collectNewDepositedAmount(){
        labelC.setText(labelC.getText() + "How much do you want to deposit in this account: ");
        task = "collectNewDepositedAmount";
    }
    
    private void createAccount(){
        labelC.setText(labelC.getText() + "You have successfully created your "
                + "account...");
        textField1.setText(textField1.getText() + "Name: " + EUserName + "; "
                + "Pin: " + EPin + "; Amount: N" + depositedAmount);
        task = "createNewAccount";
    }
    
    public void NameCheck(String a){
        labelC.setText("");
        textField1.setText("");
        labelC.setText(labelC.getText() + "Please Input your Name: ");
        task = "NameCheck" + a;
    }
    
    public void PinCheck(String b){
        labelC.setText(labelC.getText() + "Please Input your Pin: ");
        task = "PinCheck" + b;
    }
    
    public void balanceCheck(){
        double j = amt.get(EUserName);
        labelC.setText("");
        textField1.setText("");
        labelC.setText(labelC.getText() + "Your Account Balance is: N" + j);
        task = "balanceCheck";
    }
    
    public void Network(){
        labelC.setText("");
        textField1.setText("");
        labelC.setText(labelC.getText() + "Input Network to be Recharged: ");
        task = "Network";
    }
    
    public void PhoneNo(){
        labelC.setText(labelC.getText() + "Input the Phone Number to be Recharged: ");
        task = "PhoneNo";
    }
    
    public void RechargeAmount(){
        labelC.setText(labelC.getText() + "Input the Amount of Money to be Recharged: ");
        task = "RechargeAmount";
    }
    
    public void BuyAirtime(){
        labelC.setText(labelC.getText() + "You have Recharged N" + rechargeAmount
        + " to " + Network + " line: " + phoneNo);
        F = amt.get(EUserName);
        F = F - rechargeAmount;
        amt.replace(EUserName, F);
        textField1.setText(textField1.getText() + "You have N" + amt.get(EUserName) + " "
                + "remaining in your Accouunt.");
        task = "BuyAirtime";
    }
    
    public void BankTransfer(){
        labelC.setText("");
        textField1.setText("");
        labelC.setText(labelC.getText() + "Input the Name of the Bank receiving the Transfer: ");
        task = "BankTransfer";
    }
    
    public void AccountNoTransfer(){
        labelC.setText(labelC.getText() + "Input the Account Number to be Transferred to: ");
        task = "AccountNoTransfer";
    }
    
    public void TransferAmount(){
        labelC.setText(labelC.getText() + "Input the Amount of Money to be Transferred: ");
        task = "TransferAmount";
    }
    
    public void TransferMoney(){
        labelC.setText(labelC.getText() + "You have Transferred N" + transferAmount
        + " to Account No.: " + accountNoTransfer + " from Bank: " + phoneNo);
        F = amt.get(EUserName);
        F = F - transferAmount;
        amt.replace(EUserName, F);
        textField1.setText(textField1.getText() + "You have N" + amt.get(EUserName) + " "
                + "remaining in your Accouunt.");
        task = "TransferMoney";
    }
    
    public void WithdrawAmount(){
        labelC.setText("");
        textField1.setText("");
        labelC.setText(labelC.getText() + "Input how much money you wish to withdraw: ");
        task = "WithdrawAmount";
    }
    
    public void WithdrawMoney(){
        labelC.setText(labelC.getText() + "You have Withdrawn N" + withdrawAmount);
        F = amt.get(EUserName);
        F = F - withdrawAmount;
        amt.replace(EUserName, F);
        textField1.setText(textField1.getText() + "You have N" + amt.get(EUserName) + " "
                + "remaining in your Accouunt.");
        task = "WithdrawMoney";
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelB = new java.awt.Label();
        buttonWithdraw = new java.awt.Button();
        buttonTransfer = new java.awt.Button();
        buttonCheckBalance = new java.awt.Button();
        buttonBuyAirtime = new java.awt.Button();
        buttonCreateAccount = new java.awt.Button();
        jPanel2 = new javax.swing.JPanel();
        labelC = new java.awt.Label();
        textField1 = new java.awt.TextField();
        enterButton = new java.awt.Button();
        labelA = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setForeground(new java.awt.Color(102, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        labelB.setAlignment(java.awt.Label.CENTER);
        labelB.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        labelB.setForeground(new java.awt.Color(255, 255, 255));
        labelB.setText("WHAT ACTION WOULD YOU LIKE TO PERFORM:");

        buttonWithdraw.setBackground(new java.awt.Color(102, 0, 0));
        buttonWithdraw.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonWithdraw.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        buttonWithdraw.setForeground(new java.awt.Color(255, 255, 255));
        buttonWithdraw.setLabel("WITHDRAWAL");
        buttonWithdraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonWithdrawMouseClicked(evt);
            }
        });

        buttonTransfer.setBackground(new java.awt.Color(102, 0, 0));
        buttonTransfer.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        buttonTransfer.setForeground(new java.awt.Color(255, 255, 255));
        buttonTransfer.setLabel("TRANSFER");
        buttonTransfer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonTransferMouseClicked(evt);
            }
        });

        buttonCheckBalance.setBackground(new java.awt.Color(102, 0, 0));
        buttonCheckBalance.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        buttonCheckBalance.setForeground(new java.awt.Color(255, 255, 255));
        buttonCheckBalance.setLabel("Check Account Balance");
        buttonCheckBalance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCheckBalanceMouseClicked(evt);
            }
        });

        buttonBuyAirtime.setBackground(new java.awt.Color(102, 0, 0));
        buttonBuyAirtime.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        buttonBuyAirtime.setForeground(new java.awt.Color(255, 255, 255));
        buttonBuyAirtime.setLabel("BUY AIRTIME");
        buttonBuyAirtime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBuyAirtimeMouseClicked(evt);
            }
        });

        buttonCreateAccount.setBackground(new java.awt.Color(102, 0, 0));
        buttonCreateAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonCreateAccount.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        buttonCreateAccount.setForeground(new java.awt.Color(255, 255, 255));
        buttonCreateAccount.setLabel("Create an Account");
        buttonCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCreateAccountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelB, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuyAirtime, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCheckBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(labelB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCheckBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonBuyAirtime, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));

        labelC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelC.setForeground(new java.awt.Color(255, 255, 255));

        textField1.setBackground(new java.awt.Color(102, 0, 0));
        textField1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textField1.setForeground(new java.awt.Color(255, 255, 255));

        enterButton.setBackground(new java.awt.Color(102, 0, 0));
        enterButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        enterButton.setForeground(new java.awt.Color(255, 255, 255));
        enterButton.setLabel("ENTER");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                    .addComponent(labelC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        labelA.setAlignment(java.awt.Label.CENTER);
        labelA.setBackground(new java.awt.Color(51, 0, 0));
        labelA.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        labelA.setForeground(new java.awt.Color(255, 255, 255));
        labelA.setText("ATM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelA, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelA, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCreateAccountMouseClicked
        collectNewUserName();
    }//GEN-LAST:event_buttonCreateAccountMouseClicked

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        try{   
            if (task.equals("collectNewUserName")){
                this.EUserName = this.textField1.getText();
                labelC.setText("");
                textField1.setText("");
                collectNewPin();
            }else if (task.equals("collectNewPin")){
                this.EPin = this.textField1.getText();
                labelC.setText("");
                textField1.setText("");
                collectNewDepositedAmount();
            }else if (task.equals("collectNewDepositedAmount")){
                this.depositedAmount = Double.parseDouble(this.textField1.getText());
                labelC.setText("");
                textField1.setText("");
                createAccount();
            }else if (task.equals("createNewAccount")){
                userz.put(EUserName, EPin);
                amt.put(EUserName, depositedAmount);
    //            Object u = amt.get(userName);
    //            labelC.setText((String) u);
                labelC.setText("");
                textField1.setText("");
            }

            else if (task.equals("NameCheckCB")){
                this.EUserName = this.textField1.getText();
                System.out.println(EUserName);
                labelC.setText("");
                textField1.setText("");
                PinCheck("CB");
            }else if (task.equals("PinCheckCB")){
                this.EPin = this.textField1.getText();
                labelC.setText("");
                textField1.setText("");
                String h = userz.get(EUserName);
                try{
                    if  (h.equals(EPin)){
                        labelC.setText("Password confirmed!!!");
                        System.out.println("Password confirmed!!!");
                        balanceCheck();
                    }else{
                        labelC.setText("h: " + h.length() + "EPin: " + EPin.length() + "EUserName: " + EUserName);
                        System.out.println("Password mismatch!!!");
                    }
                }catch(Exception e){
                    labelC.setText("Password Mismatch!!!");
                    System.out.println("Password MismatchE!!!");
                }
            }else if (task.equals("balanceCheck")){;
                labelC.setText("");
                textField1.setText("");
            }

            else if (task.equals("NameCheckBA")){
                this.EUserName = this.textField1.getText();
                labelC.setText("");
                textField1.setText("");
                PinCheck("BA");
            }else if (task.equals("PinCheckBA")){
                this.EPin = this.textField1.getText();
                labelC.setText("");
                textField1.setText("");
                String h = userz.get(EUserName);
                try{
                    if  (h.equals(EPin)){
                        labelC.setText("Password confirmed!!!");
                        System.out.println("Password confirmed!!!");
                        Network();
                    }else{
                        labelC.setText("h: " + h.length() + "EPin: " + EPin.length() + 
                                "EUserName: " + EUserName);
                        System.out.println("Password mismatch!!!");
                    }
                }catch(Exception e){
                    labelC.setText("Password Mismatch!!!");
                    System.out.println("Password MismatchE!!!");
                }
            }else if (task.equals("Network")){
                this.Network = this.textField1.getText();
                labelC.setText("");
                textField1.setText("");
                PhoneNo();
            }else if (task.equals("PhoneNo")){
                this.phoneNo = this.textField1.getText();
                labelC.setText("");
                textField1.setText("");
                RechargeAmount();
            }else if (task.equals("RechargeAmount")){
                this.rechargeAmount = Double.parseDouble(this.textField1.getText());
                labelC.setText("");
                textField1.setText("");
                if (transferAmount >= amt.get(EUserName)){
                    labelC.setText("Your Account Balance is too low to make this Transaction");
                }else{
                    BuyAirtime();
                }
            }else if (task.equals("BuyAirtime")){
                labelC.setText("");
                textField1.setText("");
            }

            else if (task.equals("NameCheckTM")){
                this.EUserName = this.textField1.getText();
                labelC.setText("");
                textField1.setText("");
                PinCheck("TM");
            }else if (task.equals("PinCheckTM")){
                this.EPin = this.textField1.getText();
                labelC.setText("");
                textField1.setText("");
                String h = userz.get(EUserName);
                try{
                    if  (h.equals(EPin)){
                        labelC.setText("Password confirmed!!!");
                        System.out.println("Password confirmed!!!");
                        BankTransfer();
                    }else{
                        labelC.setText("h: " + h.length() + "EPin: " + EPin.length() + "EUserName: " + EUserName);
                        System.out.println("Password mismatch!!!");
                    }
                }catch(Exception e){
                    labelC.setText("Password Mismatch!!!");
                    System.out.println("Password MismatchE!!!");
                }
            }else if (task.equals("BankTransfer")){
                this.bankTransfer = this.textField1.getText();
                labelC.setText("");
                textField1.setText("");
                AccountNoTransfer();
            }else if (task.equals("AccountNoTransfer")){
                this.accountNoTransfer = this.textField1.getText();
                labelC.setText("");
                textField1.setText("");
                TransferAmount();
            }else if (task.equals("TransferAmount")){
                this.transferAmount = Double.parseDouble(this.textField1.getText());
                labelC.setText("");
                textField1.setText("");
                if (transferAmount >= amt.get(EUserName)){
                    labelC.setText("Your Account Balance is too low to make this Transaction");
                }else{
                    TransferMoney();
                }
            }else if (task.equals("TransferMoney")){
                labelC.setText("");
                textField1.setText("");
            }

            else if (task.equals("NameCheckWM")){
                this.EUserName = this.textField1.getText();
                labelC.setText("");
                textField1.setText("");
                PinCheck("WM");
            }else if (task.equals("PinCheckWM")){
                this.EPin = this.textField1.getText();
                labelC.setText("");
                textField1.setText("");
                String h = userz.get(EUserName);
                try{
                    if  (h.equals(EPin)){
                        labelC.setText("Password confirmed!!!");
                        System.out.println("Password confirmed!!!");
                        WithdrawAmount();
                    }else{
                        labelC.setText("h: " + h.length() + "EPin: " + EPin.length() + "EUserName: " + EUserName);
                        System.out.println("Password mismatch!!!");
                    }
                }catch(Exception e){
                    labelC.setText("Password Mismatch!!!");
                    System.out.println("Password MismatchE!!!");
                }
            }else if (task.equals("WithdrawAmount")){
                this.withdrawAmount = Double.parseDouble(this.textField1.getText());
                labelC.setText("");
                textField1.setText("");
                if (transferAmount >= amt.get(EUserName)){
                    labelC.setText("Your Account Balance is too low to make this Transaction");
                }else{
                    WithdrawMoney();
                }
            }else if (task.equals("WithdrawMoney")){
                labelC.setText("");
                textField1.setText("");
            }
        }catch(Exception t){
            labelC.setText("System Error...");
            System.out.println("System Error...");
        }
    }//GEN-LAST:event_enterButtonActionPerformed

    private void buttonCheckBalanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCheckBalanceMouseClicked
        NameCheck("CB");
    }//GEN-LAST:event_buttonCheckBalanceMouseClicked

    private void buttonBuyAirtimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuyAirtimeMouseClicked
        NameCheck("BA");
    }//GEN-LAST:event_buttonBuyAirtimeMouseClicked

    private void buttonTransferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTransferMouseClicked
        NameCheck("TM");
    }//GEN-LAST:event_buttonTransferMouseClicked

    private void buttonWithdrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonWithdrawMouseClicked
        NameCheck("WM");
    }//GEN-LAST:event_buttonWithdrawMouseClicked

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
            java.util.logging.Logger.getLogger(ATMGuiB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATMGuiB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATMGuiB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATMGuiB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATMGuiB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button buttonBuyAirtime;
    private java.awt.Button buttonCheckBalance;
    private java.awt.Button buttonCreateAccount;
    private java.awt.Button buttonTransfer;
    private java.awt.Button buttonWithdraw;
    private java.awt.Button enterButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label labelA;
    private java.awt.Label labelB;
    private java.awt.Label labelC;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables

}
