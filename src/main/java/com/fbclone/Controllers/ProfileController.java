package com.fbclone.Controllers;

import com.fbclone.Repos.UserProfileRepository;
import com.fbclone.Repos.UsersRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ProfileController{


        /*                      Repositories
    []
    []  lets take this repository list and make it an object?
    []  then import the object as one line? I'm not sure how to do that =D
    []
    []
     */

//    private final UsersRepository userDao;
//
//    private final UserProfileRepository usersProfileDao;
//
//    public ProfileController(UsersRepository userDao, UserProfileRepository usersProfileDao) {
//        this.userDao = userDao;
//        this.usersProfileDao = usersProfileDao;
//    }




        /*                      GetMapping
    []
    []  lets take this repository list and make it an object?
    []  then import the object as one line? I'm not sure how to do that =D
    []
    []
     */




    // Show Constructors

//    @GetMapping("/show")
//    public String show(Model view){
//        view.addAttribute("ads", userDao.findAll());
//        return"orders/show";
//    }
//
//    @GetMapping("/show/{id}")
//    public String showById(@PathVariable Long id, Model view){
//        view.addAttribute("ads", userDao.getById(id));
//        return "orders/show";
//    }


    // Edit Constructors

//    @GetMapping("/show/{id}/edit")
//    public String viewEditForm(@PathVariable Long id, Model view)
//    {
//        view.addAttribute("ads", userDao.getById(id));
//        return "orders/edit";
//    }

//    @PostMapping("show/{id}/edit")
//    public String updateOrder(@PathVariable long id, @ModelAttribute UsersRepository profileToUpdate){
//        userDao.save(profileToUpdate);
//        return "redirect:/show";
//    }

//    @GetMapping("show/{id}/delete")
//    public String showdelete(@PathVariable Long id, Model view)
//    {
//        view.addAttribute("ads", userDao.getById(id));
//        return "orders/delete";
//    }

//    @PostMapping("show/{id}/delete")
//    public String deleteOrder(@PathVariable Long id)
//    {
//        user usersProfile = userDao.getById(id);
//        usersProfileDao.delete(usersProfile);
//        return "redirect:/show";
//    }


    /////////////// Create Controllers

//    @GetMapping("/create")
//    public String IndexForCreate(){
//        return"orders/create";
//    }

//    @PostMapping("/create")
//    public String addNewOrder(@RequestParam(name="email") String email, @RequestParam(name="totalPrice") Double totalPrice){
//
//        Order n = new Order();
//        n.setTotalPrice(totalPrice);
//        n.setEmail(email);
//        orderDao.save(n);
//        return "redirect:/show";
//    }




}
