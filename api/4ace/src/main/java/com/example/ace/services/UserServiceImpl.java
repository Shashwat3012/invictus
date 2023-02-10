package com.example.ace.services;

import com.example.ace.data.request.*;
import com.example.ace.entity.*;
import com.example.ace.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements User {
    @Autowired
    private CommunityProfilesRepository communityRepo;
    @Autowired
    private DiscussionAnswersRepository discussionAnsRepo;
    @Autowired
    private DiscussionQuestionRepository discussionQueRepo;
    @Autowired
    private EventsRepository eventsRepo;
    @Autowired
    private MarketPlaceRepository marketPlaceRepo;
    @Autowired
    private TrainingsRepository trainingsRepo;
    @Autowired
    private UserRepository userRepo;

    @Override
    public String loginUser(LoginRequest userRequest) {
        com.example.ace.entity.User user =
                userRepo.findByUsernameAndPassword(userRequest.getUserName(), userRequest.getPassword());
        if (user == null) {
            return "User Not Found!";
        } else {
            return user.getUuid();
        }
    }

    @Override
    public String registerUser(RegisterUserRequest userRequest) {
        String uuid = UUID.randomUUID().toString().substring(0, 6);
        System.out.println(userRequest.getUserName());
        communityRepo.save(new com.example.ace.entity.CommunityProfiles(
                userRequest.getFullName(),
                userRequest.getUserName(),
                userRequest.getEmail(),
                userRequest.getPhoneNo(),
                userRequest.getRole(),
                userRequest.getPassword(),
                userRequest.getGender(),
                userRequest.getBirthDate(),
                uuid));
        userRepo.save(new com.example.ace.entity.User(userRequest.getUserName(),userRequest.getPassword(),userRequest.getRole(),uuid));
        return uuid;
    }

    @Override
    public List<Events> getEvents() {
        List<Events> events = eventsRepo.findAll();
        return events;
    }

    @Override
    public List<Trainings> getTrainings() {
        List<Trainings> trainings = trainingsRepo.findAll();
        return trainings;
    }

    @Override
    public List<MarketPlace> getMarketPlace() {
        List<MarketPlace> marketPlaces = marketPlaceRepo.findAll();
        return marketPlaces;
    }

    @Override
    public List<DiscussionQuestions> getDiscussionQuestion() {
        List<DiscussionQuestions> discussionQuestions = discussionQueRepo.findAll();
        return discussionQuestions;
    }

    @Override
    public String events(EventsRequest userRequest) {
        return null;
    }

    @Override
    public String trainings(TrainingsRequest userRequest) {
        return null;
    }

    @Override
    public String marketPlace(MarketPlaceRequest userRequest) {
        String uuid = UUID.randomUUID().toString().substring(0, 6);
        marketPlaceRepo.save(new MarketPlace(
                userRequest.getItem(),
                userRequest.getOwner(),
                userRequest.getContact(),
                userRequest.getPrice(),
                userRequest.getFilename(),
                userRequest.getFilecontent(),
                uuid
        ));
        return "File saved";
    }

    @Override
    public String discussionQuestion(DiscussionQuestionRequest userRequest) {

        return null;
    }

    @Override
    public String discussionAnswer(DiscussionAnswerRequest userRequest) {
        return null;
    }

    @Override
    public String communityProfile(CommunityProfilesRequest userRequest) {
        String uuid = UUID.randomUUID().toString().substring(0, 6);
        communityRepo.save(new com.example.ace.entity.CommunityProfiles(
                userRequest.getFullName(),
                userRequest.getUserName(),
                userRequest.getEmail(),
                userRequest.getPhoneNo(),
                userRequest.getRole(),
                userRequest.getPassword(),
                userRequest.getGender(),
                userRequest.getBirthDate(),
                uuid));
        userRepo.save(new com.example.ace.entity.User(userRequest.getUserName(),userRequest.getPassword(),userRequest.getRole(),uuid));
        return uuid;
    }

    @Override
    public List<CommunityProfiles> getCommunity() {
        List<CommunityProfiles> profiles = communityRepo.findAll();
        return profiles;
    }

    @Override
    public CommunityProfiles getMyProfile(String userId) {
        CommunityProfiles profile = communityRepo.findByUserId(userId);
        return profile;
    }

}
