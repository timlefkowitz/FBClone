package com.fbclone.Repos;

import com.fbclone.models.userTable.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepos extends JpaRepository<user, Long> {


}
