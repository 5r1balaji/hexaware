package com.geek.cloud.humanresources.repository;

import com.geek.cloud.humanresources.entity.UserTechScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface UserScoreRepository extends JpaRepository<UserTechScore,Long> {
    @Query("from UserTechScore usr where usr.user.employeeId = :id ")
    List<UserTechScore> getUserScoreByUserId(@Param("id") Long userId);
}
