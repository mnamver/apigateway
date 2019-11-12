package com.betbull.model;

import java.util.Date;
import java.util.List;

public class GetPlayerListHasContractRequest {

    private String teamName;
    private Date year;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

}
