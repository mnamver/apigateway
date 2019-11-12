package com.betbull.model;

import java.util.List;

public class GetPlayerSalaryInfoResponse {

    List<GetPlayerSalary> getPlayerSalaryList;
    private int resultCode;
    private String resultDesc;

    public List<GetPlayerSalary> getGetPlayerSalaryList() {
        return getPlayerSalaryList;
    }

    public void setGetPlayerSalaryList(List<GetPlayerSalary> getPlayerSalaryList) {
        this.getPlayerSalaryList = getPlayerSalaryList;
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
