package com.example.ace.controllers;

import com.example.ace.data.request.*;
import com.example.ace.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RestController
public class UserController {
    @Autowired
    private com.example.ace.services.User userService;

    @PostMapping("/login")
    public String loginUser(@RequestBody LoginRequest userRequest) {
        return userService.loginUser(userRequest);
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody RegisterUserRequest userRequest) {
        return userService.registerUser(userRequest);
    }

    @GetMapping("/events")
    public List<Events> getEvents(){
        return userService.getEvents();
    }

    @GetMapping("/trainings")
    public List<Trainings> getTrainings(){
        return userService.getTrainings();
    }

    @GetMapping("/marketPlace")
    public List<MarketPlace> getMarketPlace(){
        return userService.getMarketPlace();
    }

    @GetMapping("/discussion")
    public List<DiscussionQuestions> getDiscussionQuestion(){
        return userService.getDiscussionQuestion();
    }

    @GetMapping("/community")
    public List<CommunityProfiles> getCommunity(){
        return userService.getCommunity();
    }

    @GetMapping("/myProfile")
    public CommunityProfiles getMyProfile(@RequestParam String userId){
        return userService.getMyProfile(userId);
    }

    @PostMapping("/saveEvents")
    public String events(@RequestBody EventsRequest userRequest){
        return userService.events(userRequest);
    }

    @PostMapping("/saveTrainings")
    public String trainings(@RequestBody TrainingsRequest userRequest){
        return userService.trainings(userRequest);
    }

    @PostMapping("/saveMarketPlace")
    public String marketPlace(@RequestBody MarketPlaceRequest userRequest){
        System.out.println(userRequest.getFilecontent());
        return userService.marketPlace(userRequest);
    }

    @PostMapping("/saveDiscussionQuestion")
    public String discussionQuestion(@RequestBody DiscussionQuestionRequest userRequest){
        return userService.discussionQuestion(userRequest);
    }

    @PostMapping("/saveDiscussionAnswer")
    public String discussionAnswer(@RequestBody DiscussionAnswerRequest userRequest){
        return userService.discussionAnswer(userRequest);
    }

    @PostMapping("/saveCommunityProfiles")
    public String communityProfile(@RequestBody CommunityProfilesRequest userRequest){
        return userService.communityProfile(userRequest);
    }



}
