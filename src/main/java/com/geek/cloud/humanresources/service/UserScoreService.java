package com.geek.cloud.humanresources.service;


import com.geek.cloud.humanresources.entity.UserTechScore;
import com.geek.cloud.humanresources.repository.UserScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rest")
public class UserScoreService {

    @Autowired
    UserScoreRepository userscore;

    @RequestMapping(value = "/userscore/{userId}")
    public List<UserTechScore> getUserScores(@PathVariable Long userId){
        return userscore.getUserScoreByUserId(userId);
    }

}
