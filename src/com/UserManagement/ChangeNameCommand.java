package com.UserManagement;

public class ChangeNameCommand implements ProfileUpdateCommand {
    private User user;
    private String newName;
    private String oldName;

    public ChangeNameCommand(User user, String newName) {
        this.user = user;
        this.newName = newName;
        this.oldName = user.getName();
    }

    @Override
    public void execute() {
        user.setName(newName);
    }

    @Override
    public void undo() {
        user.setName(oldName);
    }
}
