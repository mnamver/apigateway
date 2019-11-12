package com.betbull.model;

import java.util.Date;

public class GetPlayer {

    private Long id;
    private Long playerId;
    private String playerName;
    private Date startDateOfContract;
    private String team;
    private Date endDateOfContract;
    private String position;
    private Date dateOfBirth;
    private String citizenship;
    private String foot;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Date getStartDateOfContract() {
        return startDateOfContract;
    }

    public void setStartDateOfContract(Date startDateOfContract) {
        this.startDateOfContract = startDateOfContract;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Date getEndDateOfContract() {
        return endDateOfContract;
    }

    public void setEndDateOfContract(Date endDateOfContract) {
        this.endDateOfContract = endDateOfContract;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }
}
