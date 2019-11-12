package com.betbull.model;

import java.util.List;

public class GetPlayerListHasContractResponse {

    List<String> playerListHasContract;
    private int resultCode;
    private String resultDesc;

    public List<String> getPlayerListHasContract() {
        return playerListHasContract;
    }

    public void setPlayerListHasContract(List<String> playerListHasContract) {
        this.playerListHasContract = playerListHasContract;
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
