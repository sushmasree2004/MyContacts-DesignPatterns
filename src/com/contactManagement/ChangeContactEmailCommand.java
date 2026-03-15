package com.contactManagement;
import java.util.List;

public class ChangeContactEmailCommand implements EditCommand {
    private Contact contact;
    private List<Email> newEmails;
    private List<Email> oldEmails;

    public ChangeContactEmailCommand(Contact contact, List<Email> newEmails) {
        this.contact = contact;
        this.newEmails = newEmails;
        this.oldEmails = contact.getEmails();
    }

    @Override
    public void execute() {
        contact.setEmails(newEmails);
    }

    @Override
    public void undo() {
        contact.setEmails(oldEmails);
    }
}
