package com.geek.cloud.humanresources.repository;

import com.geek.cloud.humanresources.entity.UserMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserMasterRepository extends JpaRepository<UserMaster,Long>{
    @Query("from UserMaster um where um.userName =:userName")
    UserMaster findByUserName(@Param("userName") String userName);
}
