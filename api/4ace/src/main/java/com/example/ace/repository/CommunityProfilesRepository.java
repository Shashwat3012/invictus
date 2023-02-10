package com.example.ace.repository;

import com.example.ace.entity.CommunityProfiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CommunityProfilesRepository extends JpaRepository<CommunityProfiles, Long> {
    @Query("Select u from CommunityProfiles u WHERE u.uuid=:userId")
    CommunityProfiles findByUserId(@Param("userId") String userId);

}
