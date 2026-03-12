package com.UserManagement;

public class ChangePasswordCommand implements ProfileUpdateCommand 
{
    private User user;
    private String newPasswordHash;
    private String oldPasswordHash;

    public ChangePasswordCommand(User user, String newPassword) 
    {
        this.user = user;
        this.newPasswordHash = Integer.toHexString(newPassword.hashCode());
        this.oldPasswordHash = user.getPasswordHash();
    }

    @Override
    public void execute() 
    {
        user.setPasswordHash(newPasswordHash);
    }

    @Override
    public void undo() 
    {
        user.setPasswordHash(oldPasswordHash);
    }
}
