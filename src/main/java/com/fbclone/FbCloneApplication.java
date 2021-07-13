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
public class FbCloneApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FbCloneApplication.class, args);
    }




    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UserProfileRepository userProfileRepository;


    @Override
    public void run(String... args) throws Exception {

            // user Object
        user user = new user(usersRepository);
        user.setFirstName("Tim");
        user.setEmail("timothy.lefkowitz@gmail.com");
        user.setStatus("NTFS is just a copied unix with a bunch of added hashmaps :D LMAO");
        user.setDateOfBirth(LocalDate.of(1988, 10, 16));
//        user.setGender(Gender.MALE);

        // Adding User Profile Examples
        userProfile userProfile = new userProfile();
        userProfile.setUserBio("Born in Dallas, Tx. Raised in San Antonio");


        //adding the user
        user.setUserProfile(userProfile);
//        userProfile.setOwner(user);

        usersRepository.save(user);

    }
}
