package com.fbclone.Repos;

import com.fbclone.models.RelationshipHome.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersRepository extends JpaRepository<user, Long> {


}
