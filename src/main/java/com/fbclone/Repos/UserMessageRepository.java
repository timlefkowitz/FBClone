package com.fbclone.Repos;


import com.fbclone.models.RelationshipHome.userTable.userMessage.UserMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMessageRepository extends JpaRepository<UserMessage, Long> {
}
