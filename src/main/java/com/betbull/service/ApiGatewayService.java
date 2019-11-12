package com.betbull.service;


import com.betbull.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;

@Service
public class ApiGatewayService {

    @Autowired
    private RestTemplate restTemplate;


    public CreateTeamResponse createTeam(@Valid @RequestBody CreateTeamRequest request){

        String addTeamUrl = "http://localhost:8081//api/v1/createteam";

        CreateTeamResponse createTeamResponse = restTemplate.postForObject(addTeamUrl, request , CreateTeamResponse.class );

        return createTeamResponse;
    }

    public UpdateTeamResponse updateTeam(@Valid @RequestBody UpdateTeamRequest request){

        String updateTeamUrl = "http://localhost:8081//api/v1/updateteam";

        UpdateTeamResponse updateTeamResponse = restTemplate.postForObject(updateTeamUrl, request , UpdateTeamResponse.class );

        return updateTeamResponse;
    }

    public DeleteTeamResponse deleteTeam(@Valid @RequestBody DeleteTeamRequest request){
        String deleteTeamUrl = "http://localhost:8081//api/v1/deleteteam";

        DeleteTeamResponse deleteTeamResponse = restTemplate.postForObject(deleteTeamUrl, request , DeleteTeamResponse.class);

        return deleteTeamResponse;
    }

    public CreatePlayerResponse createPlayer(@Valid @RequestBody CreatePlayerRequest request) {
        String createPlayerUrl = "http://localhost:8082//api/player/createplayer";

        CreatePlayerResponse createPlayerResponse = restTemplate.postForObject(createPlayerUrl, request , CreatePlayerResponse.class);

        return createPlayerResponse;
    }

    public CreatePlayerHistoryResponse createPlayerHistory(@Valid @RequestBody CreatePlayerHistoryRequest request) {
        String createPlayerUrl = "http://localhost:8082//api/player/createplayerhistory";

        CreatePlayerHistoryResponse createPlayerHistoryResponse = restTemplate.postForObject(createPlayerUrl, request , CreatePlayerHistoryResponse.class);

        return createPlayerHistoryResponse;
    }

    public GetPlayerListResponse getPlayerList() {
        String createPlayerListUrl = "http://localhost:8082//api/player/getplayerlist";

        GetPlayerListResponse getPlayerListResponse = restTemplate.getForObject(createPlayerListUrl , GetPlayerListResponse.class);

        return getPlayerListResponse;
    }

    public GetTeamsOfSelectedPlayerResponse getTeamsOfSelectedPlayer(@Valid @RequestBody GetTeamsOfSelectedPlayerRequest request){

        String teamOfSelectedPlayerUrl = "http://localhost:8082//api/player/getteamsofselectedplayer";

        GetTeamsOfSelectedPlayerResponse getTeamsOfSelectedPlayerResponse = restTemplate.postForObject(teamOfSelectedPlayerUrl, request , GetTeamsOfSelectedPlayerResponse.class);

        return getTeamsOfSelectedPlayerResponse;
    }

    public GetTeamListResponse getTeamList() {
        String getTeamListUrl = "http://localhost:8081//api/v1/getteamlist";

        GetTeamListResponse getTeamListResponse = restTemplate.getForObject(getTeamListUrl , GetTeamListResponse.class);

        return getTeamListResponse;
    }

    public GetPlayerListHasContractResponse getPlayerListHasContract(@Valid @RequestBody GetPlayerListHasContractRequest request){

        String playerListHasContractUrl = "http://localhost:8082//api/player/getplayerlisthascontract";

        GetPlayerListHasContractResponse getPlayerListHasContractResponse = restTemplate.postForObject(playerListHasContractUrl ,request , GetPlayerListHasContractResponse.class);

        return getPlayerListHasContractResponse;
    }

    public GetPlayerSalaryInfoResponse getPlayerSalaryInfo(){
        String getPlayerSalaryInfoUrl = "http://localhost:8082//api/player/getplayersalaryinfo";

        GetPlayerSalaryInfoResponse getPlayerSalaryInfoResponse = restTemplate.getForObject(getPlayerSalaryInfoUrl , GetPlayerSalaryInfoResponse.class);

        return getPlayerSalaryInfoResponse;
    }




}
