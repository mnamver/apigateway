package com.betbull.model;

public class GetPlayerSalary {

    private Double transferFee;
    private Double teamCommission;
    private Double contractPrice;
    private String currency;
    private String foot;
    private String position;
    private String playerName;

    public Double getTransferFee() {
        return transferFee;
    }

    public void setTransferFee(Double transferFee) {
        this.transferFee = transferFee;
    }

    public Double getTeamCommission() {
        return teamCommission;
    }

    public void setTeamCommission(Double teamCommission) {
        this.teamCommission = teamCommission;
    }

    public Double getContractPrice() {
        return contractPrice;
    }

    public void setContractPrice(Double contractPrice) {
        this.contractPrice = contractPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
