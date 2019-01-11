package view;

import view.action.IAccountViewAction;

public interface IAccountView extends IAccountViewAction {
    String getEmail();
    String getUsername();
    String getPassword();
    String getAdditionalInformation();
    void setEmail(String email);
    void setUsername(String username);
    void setPassword(String password);
    void setAdditionalInformation(String additionalInformation);
}
