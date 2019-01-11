package view;

import view.action.IAccountOverviewViewAction;

import java.util.List;

public interface IAccountOverviewView extends IAccountOverviewViewAction {
    List<IAccountPreviewView> gerPreviews();
    void setAccounts(List<IAccountPreviewView> accounts);

}
