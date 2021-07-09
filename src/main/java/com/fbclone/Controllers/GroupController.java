package com.fbclone.Controllers;


import com.fbclone.Repos.GroupRepo;
import com.fbclone.Repos.UserRepos;
import com.fbclone.models.userTable.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;

@Controller
public class GroupController {


    @Autowired
    private final GroupRepo groupDao;

    public GroupController(GroupRepo groupDao) {
        this.groupDao = groupDao;
    }


    // Create a group
    @GetMapping("/createAgroup")
    public String signup(@RequestParam(name = "createdBy") long createdBy,
                         @RequestParam(name = "updatedBy") long updatedBy,
                         @RequestParam(name = "title") String title,
                         @RequestParam(name = "metaTitle") String metaTitle,
                         @RequestParam(name = "slug") String slug,
                         @RequestParam(name = "summary") String summary,
                         @RequestParam(name = "status") String status,
                         @RequestParam(name = "createdAt") Timestamp createdAt,
                         @RequestParam(name = "updatedAt") Timestamp updatedAt,
                         @RequestParam(name = "profile") String profile,
                         @RequestParam(name = "content") String content

    )
    {
        user newUser = new user(createdBy, updatedBy, title, metaTitle, slug, summary, status, createdAt, updatedAt, profile, content);
        user saveNewUser = userDao.save(newUser);
        return "redirect:/home" + saveNewUser.getId();
    }



}
