package com.fbclone.Controllers;


import com.fbclone.Repos.UserRepos;
import com.fbclone.Repos.postTableRepo;
import com.fbclone.models.postTable.postTable;
import com.fbclone.models.userTable.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;

@Controller
public class PostController {


    @Autowired
    private postTableRepo postDao;
    private UserRepos usersDao;

    public PostController(postTableRepo postDao, UserRepos usersDao) {
        this.postDao = postDao;
        this.usersDao = usersDao;
    }


    @GetMapping("/userPost")
    public String saveAuserPost(@RequestParam(name = "title") String title,
                                @RequestParam(name = "description") String description,
                                @RequestParam(name = "authorId") long authorId,
                                @RequestParam(name = "parentId") long parentId,
                                @RequestParam(name = "metaTitle") String metaTitle,
                                @RequestParam(name = "slug") String slug,
                                @RequestParam(name = "summary") String summary,
                                @RequestParam(name = "published") String published,
                                @RequestParam(name = "createdAt") Timestamp createdAt,
                                @RequestParam(name = "updatedAt") Timestamp updatedAt,
                                @RequestParam(name = "publishedAt") Timestamp publishedAt,
                                @RequestParam(name = "content") String content

                                )
    {
        user user = usersDao.getById(1L);
        postTable newPost = new postTable(title, description);
        postTable savePost = postDao.save(newPost);
        return "redirect:/home" + savePost.getId();

    }
}
