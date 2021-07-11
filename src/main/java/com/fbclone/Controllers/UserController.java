package com.fbclone.Controllers;


import com.fbclone.Repos.UserRepos;
import com.fbclone.models.userTable.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;

@Controller
public class UserController {


    @Autowired
    private final UserRepos userDao;

    public UserController(UserRepos userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/signup")
    public String signup(@RequestParam(name = "firstName") String firstName,
                         @RequestParam(name = "middleName") String middleName,
                         @RequestParam(name = "lastName") String lastName,
                         @RequestParam(name = "userName") String userName,
                         @RequestParam(name = "email") String email,
                         @RequestParam(name = "passwordHash") String passwordHash,
                         @RequestParam(name = "registeredAt") Timestamp registeredAt,
                         @RequestParam(name = "lastLogin") Timestamp lastLogin,
                         @RequestParam(name = "intro") String intro,
                         @RequestParam(name = "profile") String profile,
                         @RequestParam(name = "mobile") long mobile,
                         @RequestParam(name = "status") String status
                         )
    {

        ///             in the future we will use the current logged in user.

        user user = userDao.getById(1l);
        user newUser = new user(userName, firstName, middleName, lastName, email, passwordHash, registeredAt, lastLogin, intro, profile, mobile, status);
        user saveNewUser = userDao.save(newUser);
        return "redirect:/home" + saveNewUser.getId();
    }
}
