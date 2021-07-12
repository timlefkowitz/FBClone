package com.fbclone.Repos;


import com.fbclone.models.userTable.userProfile;
import com.mysql.cj.jdbc.JdbcPreparedStatement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<userProfile, Long> {
}

