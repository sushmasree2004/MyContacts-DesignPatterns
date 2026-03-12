package com.UserManagement;

import java.util.Stack;

public class CommandManager 
{
    private Stack<ProfileUpdateCommand> history = new Stack<>();
    private Stack<ProfileUpdateCommand> redoStack = new Stack<>();

    public void executeCommand(ProfileUpdateCommand command) 
    {
        command.execute();
        
        history.push(command);
        redoStack.clear();
    }

    public void undo() 
    {
        if (!history.isEmpty()) 
        {
            ProfileUpdateCommand command = history.pop();
            command.undo();
            
            redoStack.push(command);
        }
    }

    public void redo() 
    {
        if (!redoStack.isEmpty()) 
        {
            ProfileUpdateCommand command = redoStack.pop();
            
            command.execute();
            history.push(command);
        }
    }
}
