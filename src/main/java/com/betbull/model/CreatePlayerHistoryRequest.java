package com.betbull.model;

import java.util.Date;

public class CreatePlayerHistoryRequest {

    private Long id ;
    private Long playerId;
    private String playerName;
    private String team;
    private Date startDateOfContract;
    private Date endDateOfContract;

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

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Date getStartDateOfContract() {
        return startDateOfContract;
    }

    public void setStartDateOfContract(Date startDateOfContract) {
        this.startDateOfContract = startDateOfContract;
    }

    public Date getEndDateOfContract() {
        return endDateOfContract;
    }

    public void setEndDateOfContract(Date endDateOfContract) {
        this.endDateOfContract = endDateOfContract;
    }
}
