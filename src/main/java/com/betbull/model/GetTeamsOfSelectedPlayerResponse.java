package com.betbull.model;

import java.util.List;

public class GetTeamsOfSelectedPlayerResponse {

    List<String> teamsOfSelectedPlayerList;
    private int resultCode;
    private String resultDesc;

    public List<String> getTeamsOfSelectedPlayerList() {
        return teamsOfSelectedPlayerList;
    }

    public void setTeamsOfSelectedPlayerList(List<String> teamsOfSelectedPlayerList) {
        this.teamsOfSelectedPlayerList = teamsOfSelectedPlayerList;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

}
