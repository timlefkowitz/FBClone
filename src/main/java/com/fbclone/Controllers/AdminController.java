package com.fbclone.Controllers;


import com.fbclone.Repos.GroupRepository;
import com.fbclone.Repos.UserProfileRepository;
import com.fbclone.Repos.UsersPostsRepository;
import com.fbclone.Repos.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {


        /*                      Repositories
    []
    []  lets take this repository list and make it an object?
    []  then import the object as one line? I'm not sure how to do that =D
    []
    []
     */


    @Autowired
    private final GroupRepository groupRepositoryDao;

    @Autowired
    private final UserProfileRepository usersProfileDao;

    @Autowired
    private final UsersPostsRepository usersPostsDao;

    @Autowired
    private final UsersRepository userDao;

    public AdminController(GroupRepository groupRepositoryDao, UserProfileRepository usersProfileDao, UsersPostsRepository usersPostsDao, UsersRepository userDao) {
        this.groupRepositoryDao = groupRepositoryDao;
        this.usersProfileDao = usersProfileDao;
        this.usersPostsDao = usersPostsDao;
        this.userDao = userDao;
    }


//    Admin home

    @GetMapping("/adminhome")
    public String landingpage(Model view)
    {
        return "admin/AdminsHome";
    }
}

