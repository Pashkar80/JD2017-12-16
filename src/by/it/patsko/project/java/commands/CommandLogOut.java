package by.it.patsko.project.java.commands;

import by.it.patsko.project.java.ActionCommand;
import by.it.patsko.project.java.Actions;

import javax.servlet.http.HttpServletRequest;

public class CommandLogOut implements ActionCommand {
    @Override
    public String execute(HttpServletRequest req) {
        return Actions.LOGOUT.jsp;
    }
}
