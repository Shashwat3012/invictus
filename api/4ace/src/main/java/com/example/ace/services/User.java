package com.example.ace.services;

import com.example.ace.data.request.*;
import com.example.ace.entity.*;

import java.util.List;

public interface User {
    String loginUser(LoginRequest userRequest);

    String registerUser(RegisterUserRequest userRequest);

    List<Events> getEvents();

    List<Trainings> getTrainings();

    List<MarketPlace> getMarketPlace();

    List<DiscussionQuestions> getDiscussionQuestion();

    String events(EventsRequest userRequest);

    String trainings(TrainingsRequest userRequest);

    String marketPlace(MarketPlaceRequest userRequest);

    String discussionQuestion(DiscussionQuestionRequest userRequest);

    String discussionAnswer(DiscussionAnswerRequest userRequest);

    String communityProfile(CommunityProfilesRequest userRequest);

    List<CommunityProfiles> getCommunity();

    CommunityProfiles getMyProfile(String userId);
}
