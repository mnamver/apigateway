package com.betbull.model;

import java.util.List;

public class GetPlayerListResponse {

    List<GetPlayer> playerList;
    private int resultCode;
    private String resultDesc;


    public List<GetPlayer> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<GetPlayer> playerList) {
        this.playerList = playerList;
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
