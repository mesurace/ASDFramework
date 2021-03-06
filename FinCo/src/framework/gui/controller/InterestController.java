package framework.gui.controller;


import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import framework.lib.account.AccountManager;
import singleton.SingletonProvider;

/**
 *
 * @author Manish Karki
 */
public class InterestController implements Controller {

    private AccountManager accountManager = null;

    public InterestController() {
        accountManager = SingletonProvider.getInstanceAccountManager();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            accountManager.addInterest();
            JOptionPane.showMessageDialog(SingletonProvider.getInstanceAccountFrm(), "Add interest to all accounts", "Add interest to all accounts", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(InterestController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
