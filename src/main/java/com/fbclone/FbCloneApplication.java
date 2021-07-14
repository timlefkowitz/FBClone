package com.fbclone;

import com.fbclone.Repos.UserProfileRepository;
import com.fbclone.Repos.UsersRepository;
import com.fbclone.models.RelationshipHome.user;
import com.fbclone.models.RelationshipHome.userTable.userProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class FbCloneApplication  {

    public static void main(String[] args) {
        SpringApplication.run(FbCloneApplication.class, args);
    }


}
