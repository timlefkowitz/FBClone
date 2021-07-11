package com.fbclone.Repos;

import com.fbclone.models.userTable.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepos extends JpaRepository<user, Long> {


}
