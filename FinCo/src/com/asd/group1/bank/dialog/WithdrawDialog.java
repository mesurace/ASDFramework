/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asd.group1.bank.dialog;


import java.awt.event.ActionEvent;

import com.asd.group1.framework.gui.AccountFrm;
import com.asd.group1.framework.gui.JDialog_Dialogview;
import com.asd.group1.framework.gui.controller.WithdrawController;

public class WithdrawDialog extends JDialog_Dialogview {

    public WithdrawDialog(AccountFrm parent, String aaccnr) {
        super(parent, aaccnr);
        setTitle("Withdraw Money");
    }

    @Override
    protected void JButtonOK_actionPerformed(ActionEvent event) {
        String name = JTextField_NAME.getText();
        String amount = JTextField_Deposit.getText();
        new WithdrawController().withdraw(this.getAccnr(), amount, name);
        dispose();
        setVisible(false);
    }
}
