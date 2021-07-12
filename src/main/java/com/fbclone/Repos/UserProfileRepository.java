package com.fbclone.Repos;


import com.fbclone.models.RelationshipHome.userTable.userProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<userProfile, Long> {
}

