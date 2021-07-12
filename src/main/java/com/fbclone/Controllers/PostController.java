package com.fbclone.Controllers;


import com.fbclone.Repos.UsersRepository;
import com.fbclone.Repos.UsersPostsRepository;
import com.fbclone.models.postTable.postTable;
import com.fbclone.models.userTable.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;

@Controller
public class PostController {


    @Autowired
    private UsersPostsRepository postDao;
    private UsersRepository userDao;

    public PostController(UsersPostsRepository postDao, UsersRepository userDao) {
        this.postDao = postDao;
        this.userDao = userDao;
    }




    // Show Constructors

    @GetMapping("/show")
    public String show(Model view){
        view.addAttribute("ads", userDao.findAll());
        return"orders/show";
    }

    @GetMapping("/show/{id}")
    public String showById(@PathVariable Long id, Model view){
        view.addAttribute("ads", userDao.getById(id));
        return "orders/show";
    }


    // Edit Constructors

    @GetMapping("/show/{id}/edit")
    public String viewEditForm(@PathVariable Long id, Model view)
    {
        view.addAttribute("ads", userDao.getById(id));
        return "orders/edit";
    }

//    @PostMapping("show/{id}/edit")
//    public String updateOrder(@PathVariable long id, @ModelAttribute Order orderToUpdate){
//        userDao.save(orderToUpdate);
//        return "redirect:/show" + orderToUpdate.getOrderNumber();
//    }

    @GetMapping("show/{id}/delete")
    public String showdelete(@PathVariable Long id, Model view)
    {
        view.addAttribute("ads", userDao.getById(id));
        return "orders/delete";
    }

    @PostMapping("show/{id}/delete")
    public String deleteOrder(@PathVariable Long id)
    {
        user user = userDao.getById(id);
        userDao.delete(user);
        return "redirect:/show";
    }






    @GetMapping("/userPost")
    public String saveAuserPost(@RequestParam(name = "title") String title,
                                @RequestParam(name = "description") String description,
                                @RequestParam(name = "authorId") long authorId,
                                @RequestParam(name = "parentId") long parentId,
                                @RequestParam(name = "slug") String slug,
                                @RequestParam(name = "summary") String summary,
                                @RequestParam(name = "published") String published,
                                @RequestParam(name = "createdAt") Timestamp createdAt,
                                @RequestParam(name = "updatedAt") Timestamp updatedAt,
                                @RequestParam(name = "publishedAt") Timestamp publishedAt,
                                @RequestParam(name = "content") String content

                                )
    {

        // In the future we want to update this to the current user

//        postTable postTable = postDao.getById(1L);
        postTable newPost = new postTable(title, description);
//        <<<   inputing user here is not working but i'm focused on creating a user so brb
        postTable savePost = postDao.save(newPost);
        return "redirect:/home" + savePost.getId();

    }
}
