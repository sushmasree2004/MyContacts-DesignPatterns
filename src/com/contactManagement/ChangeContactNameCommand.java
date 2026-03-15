package com.contactManagement;

public class ChangeContactNameCommand implements EditCommand {
    private Contact contact;
    private String newName;
    private String oldName;

    public ChangeContactNameCommand(Contact contact, String newName) {
        this.contact = contact;
        this.newName = newName;
        this.oldName = contact.getName();
    }

    @Override
    public void execute() 
    {
        contact.setName(newName);
    }

    @Override
    public void undo() 
    {
        contact.setName(oldName);
    }
}
