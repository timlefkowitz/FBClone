package com.fbclone;

import com.fbclone.Repos.UserProfileRepo;
import com.fbclone.Repos.UserRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FbCloneApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FbCloneApplication.class, args);
    }


    @Autowired
    private UserRepos userRepos;

    @Autowired
    private UserProfileRepo userProfileRepo;


    @Override
    public void run(String... args) throws Exception {

    }
}
