package com.betbull.controller;

import com.betbull.Exception.ApiGatewayException;
import com.betbull.Exception.ErrorCodes;
import com.betbull.model.*;
import com.betbull.service.ApiGatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;

@RestController
@RequestMapping("/gateway")
public class ApiGateway {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ApiGatewayService apiGatewayService;

    @PostMapping("/createteam")
    public CreateTeamResponse createTeam(@Valid @RequestBody CreateTeamRequest request){
    CreateTeamResponse createTeamResponse = new CreateTeamResponse();
        try {
            validationControl(request);
        }catch (ApiGatewayException e){
            createTeamResponse.setResultCode(e.getErrorCode());
            createTeamResponse.setResultDesc(e.getMessage());
            return createTeamResponse;
        }catch (Exception e){
            createTeamResponse.setResultCode(ErrorCodes.GENERAL_ERROR);
            createTeamResponse.setResultDesc("GeneralError");
            return createTeamResponse;
        }
        return apiGatewayService.createTeam(request);
    }

    @PostMapping("/updateteam")
    public UpdateTeamResponse updateTeamInfo(@Valid @RequestBody UpdateTeamRequest request){
        UpdateTeamResponse updateTeamResponse = new UpdateTeamResponse();
        try{
            validationControl(request);
        }catch (ApiGatewayException e){
            updateTeamResponse.setResultCode(e.getErrorCode());
            updateTeamResponse.setResultDesc(e.getMessage());
            return updateTeamResponse;
        }catch (Exception e){
            updateTeamResponse.setResultCode(ErrorCodes.GENERAL_ERROR);
            updateTeamResponse.setResultDesc("GeneralError");
            return updateTeamResponse;
        }
        return apiGatewayService.updateTeam(request);

    }

    @PostMapping("/deleteteam")
    public DeleteTeamResponse deleteTeam(@Valid @RequestBody DeleteTeamRequest request){
        DeleteTeamResponse deleteTeamResponse = new DeleteTeamResponse();
        try{
            validationControl(request);
        }catch (ApiGatewayException e){
            deleteTeamResponse.setResultCode(e.getErrorCode());
            deleteTeamResponse.setResultDesc(e.getMessage());
            return deleteTeamResponse;
        }catch (Exception e){
            deleteTeamResponse.setResultCode(ErrorCodes.GENERAL_ERROR);
            deleteTeamResponse.setResultDesc("GeneralError");
            return deleteTeamResponse;
        }
        return apiGatewayService.deleteTeam(request);

    }

    @PostMapping("/createplayer")
    public CreatePlayerResponse playerTeamInfo(@Valid @RequestBody CreatePlayerRequest request){
        CreatePlayerResponse createPlayerResponse = new CreatePlayerResponse();
        try{
            validationControl(request);
        }catch (ApiGatewayException e){
            createPlayerResponse.setResultCode(e.getErrorCode());
            createPlayerResponse.setResultDesc(e.getMessage());
            return createPlayerResponse;
        }catch (Exception e){
            createPlayerResponse.setResultCode(ErrorCodes.GENERAL_ERROR);
            createPlayerResponse.setResultDesc("GeneralError");
            return createPlayerResponse;
        }
        return apiGatewayService.createPlayer(request);
    }

    @PostMapping("/createplayerhistory")
    public CreatePlayerHistoryResponse playerTeamInfo(@Valid @RequestBody CreatePlayerHistoryRequest request){
        CreatePlayerHistoryResponse createPlayerHistoryResponse = new CreatePlayerHistoryResponse();
        try{
            validationControl(request);
        }catch (ApiGatewayException e){
            createPlayerHistoryResponse.setResultCode(e.getErrorCode());
            createPlayerHistoryResponse.setResultDesc(e.getMessage());
            return createPlayerHistoryResponse;
        }catch (Exception e){
            createPlayerHistoryResponse.setResultCode(ErrorCodes.GENERAL_ERROR);
            createPlayerHistoryResponse.setResultDesc("GeneralError");
            return createPlayerHistoryResponse;
        }
        return apiGatewayService.createPlayerHistory(request);
    }

    @GetMapping("/getplayerlist")
    public GetPlayerListResponse getPlayerList(){
        GetPlayerListResponse getAllPlayerResponse = new GetPlayerListResponse();
        System.out.println("playerList");
        return apiGatewayService.getPlayerList();
    }

    @PostMapping("/getteamsofselectedplayer")
    public GetTeamsOfSelectedPlayerResponse getTeamsOfSelectedPlayer(@Valid @RequestBody GetTeamsOfSelectedPlayerRequest request){
        GetTeamsOfSelectedPlayerResponse get = new GetTeamsOfSelectedPlayerResponse();
        System.out.println("playerList");
        return apiGatewayService.getTeamsOfSelectedPlayer(request);
    }

    @GetMapping("/getteamlist")
    public GetTeamListResponse getTeamList(){
        GetTeamListResponse getTeamListResponse = new GetTeamListResponse();
        System.out.println("teamList");
        return apiGatewayService.getTeamList();
    }

    @PostMapping("/getplayerlisthascontract")
    public GetPlayerListHasContractResponse getPlayerListHasContract(@Valid @RequestBody GetPlayerListHasContractRequest request){
        GetPlayerListHasContractResponse getPlayerListHasContractResponse = new GetPlayerListHasContractResponse();
        try{
            validationControl(request);
        }catch (ApiGatewayException e){
            getPlayerListHasContractResponse.setResultCode(e.getErrorCode());
            getPlayerListHasContractResponse.setResultDesc(e.getMessage());
            return getPlayerListHasContractResponse;
        }catch (Exception e){
            getPlayerListHasContractResponse.setResultCode(ErrorCodes.GENERAL_ERROR);
            getPlayerListHasContractResponse.setResultDesc("GeneralError");
            return getPlayerListHasContractResponse;
        }
        return apiGatewayService.getPlayerListHasContract(request);
    }

    @GetMapping("/getplayersalaryinfo")
    public GetPlayerSalaryInfoResponse getPlayerSalaryInfoList(){
        GetPlayerSalaryInfoResponse getPlayerSalaryInfoResponse = new GetPlayerSalaryInfoResponse();

        return apiGatewayService.getPlayerSalaryInfo();
    }












    public void validationControl(CreateTeamRequest request) throws ApiGatewayException {
        if (request.getTeamId() == null) {
            throw new ApiGatewayException("TeamId is null", ErrorCodes.TEAM_ID_NULL);
        }else if(request.getTeamName() == null || request.getTeamName().trim().isEmpty()){
            throw new ApiGatewayException("Team Name is null", ErrorCodes.TEAM_NAME_NULL);
        }else if(request.getCountry() == null || request.getCountry().trim().isEmpty()){
            throw new ApiGatewayException("Country is null", ErrorCodes.COUNTRY_NULL);
        }else if(request.getCurrency() == null || request.getCurrency().trim().isEmpty()){
            throw new ApiGatewayException("Currency is null", ErrorCodes.CURRENCY_NULL);
        }
    }

    public void validationControl(UpdateTeamRequest request) throws ApiGatewayException {
        if (request.getTeamId() == null) {
            throw new ApiGatewayException("TeamId is null", ErrorCodes.TEAM_ID_NULL);
        }else if(request.getTeamName() == null || request.getTeamName().trim().isEmpty()){
            throw new ApiGatewayException("Team Name is null", ErrorCodes.TEAM_NAME_NULL);
        }else if(request.getCountry() == null || request.getCountry().trim().isEmpty()){
            throw new ApiGatewayException("Country is null", ErrorCodes.COUNTRY_NULL);
        }else if(request.getCurrency() == null || request.getCurrency().trim().isEmpty()){
            throw new ApiGatewayException("Currency is null", ErrorCodes.CURRENCY_NULL);
        }
    }

    public void validationControl(DeleteTeamRequest request) throws ApiGatewayException {
        if (request.getTeamId() == null) {
            throw new ApiGatewayException("TeamId is null", ErrorCodes.TEAM_ID_NULL);
        }
    }

    public void validationControl(CreatePlayerRequest request) throws ApiGatewayException {
        if (request.getPlayerId() == null) {
            throw new ApiGatewayException("playerId is null", ErrorCodes.PLAYER_ID_NULL);
        }else if(request.getPlayerName() == null || request.getPlayerName().trim().isEmpty()){
            throw new ApiGatewayException("playerName is null", ErrorCodes.PLAYER_NAME_NULL);
        }else if(request.getCitizenship() == null || request.getCitizenship().trim().isEmpty()){
            throw new ApiGatewayException("citizenship is null", ErrorCodes.CITIZENSHIP_NULL);
        }else if(request.getStartDateOfContract() == null  ){
            throw new ApiGatewayException("startDateOfContract is null", ErrorCodes.START_DATE_OF_CONTRACT_NULL);
        }else if(request.getEndDateOfContract() == null  ){
            throw new ApiGatewayException("endDateOfContract is null", ErrorCodes.END_DATE_OF_CONTRACT_NULL);
        }else if(request.getDateOfBirth() == null  ){
            throw new ApiGatewayException("dateOfBirth is null", ErrorCodes.DATE_OF_BIRTH_NULL);
        }
    }

    public void validationControl(CreatePlayerHistoryRequest request) throws ApiGatewayException {
        if (request.getPlayerId() == null) {
            throw new ApiGatewayException("playerId is null", ErrorCodes.PLAYER_ID_NULL);
        }else if(request.getPlayerName() == null || request.getPlayerName().trim().isEmpty()){
            throw new ApiGatewayException("playerName is null", ErrorCodes.PLAYER_NAME_NULL);
        }else if(request.getStartDateOfContract() == null  ){
            throw new ApiGatewayException("startDateOfContract is null", ErrorCodes.START_DATE_OF_CONTRACT_NULL);
        }else if(request.getEndDateOfContract() == null  ){
            throw new ApiGatewayException("endDateOfContract is null", ErrorCodes.END_DATE_OF_CONTRACT_NULL);
        }else if(request.getTeam() == null || request.getTeam().trim().isEmpty()  ){
            throw new ApiGatewayException("teamName is null", ErrorCodes.TEAM_NAME_NULL);
        }
    }


    public void validationControl(GetPlayerListHasContractRequest request) throws ApiGatewayException {
        if(request.getTeamName() == null || request.getTeamName().trim().isEmpty()){
            throw new ApiGatewayException("TeamName is null", ErrorCodes.TEAM_NAME_NULL);
        }else if(request.getYear() == null  ){
            throw new ApiGatewayException("year is null", ErrorCodes.YEAR_NULL);
        }
    }

}
