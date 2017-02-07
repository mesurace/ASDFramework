package com.asd.group1.framework.gui.components.ext;

import com.asd.group1.framework.gui.components.asd.ASDButton;
import com.asd.group1.framework.lib.account.AccountManager;
import com.asd.group1.framework.lib.mediator.IReceiverColleague;
import com.asd.group1.framework.lib.mediator.Mediator;
import com.asd.group1.framework.lib.mediator.Message;

public class AddInterestButton extends ASDButton implements IReceiverColleague {

    private static final String NAME = "ADD_INTEREST_BUTTON";

    private Mediator mediator;

    public AddInterestButton(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void receive(Message message) {
        if (message.getsub().equalsIgnoreCase(AccountManager.ACCOUNT_LIST_NOT_EMPTY)) {
            this.setEnabled(message.isStatus());
        }
    }

    public static String getNAME() {
        return NAME;
    }

}