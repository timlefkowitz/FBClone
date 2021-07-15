package com.fbclone.Controllers;


import com.fbclone.Repos.GroupRepository;
import com.fbclone.Repos.UserProfileRepository;
import com.fbclone.Repos.UsersPostsRepository;
import com.fbclone.Repos.UsersRepository;
import com.fbclone.models.RelationshipHome.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.persistence.*;
import java.security.Timestamp;
import java.time.LocalDate;
import java.util.List;


//{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}
//                  Lets see if I complete the Codeup capstone! Thank you if you are reading
//                      this < < < < < < -     -    -   -   << these are pacman like creatures
//{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}



@Controller
public class UserController {

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


//    @Autowired
//    private Timestamp Timestamp;


    public UserController(GroupRepository groupRepositoryDao, UserProfileRepository usersProfileDao, UsersPostsRepository usersPostsDao, UsersRepository userDao) {

        this.groupRepositoryDao = groupRepositoryDao;
        this.usersProfileDao = usersProfileDao;
        this.usersPostsDao = usersPostsDao;
        this.userDao = userDao;

    }


    // Show Constructors

    @GetMapping("/index")
    public String show(Model view){
        return"index";
    }
//
//    @GetMapping("/show/{id}")
//    public String showById(@PathVariable Long id, Model view){
//        view.addAttribute("ads", userDao.getById(id));
//        return "orders/show";
//    }


    // Edit Constructors
//
//    @GetMapping("/show/{id}/edit")
//    public String viewEditForm(@PathVariable Long id, Model view)
//    {
//        view.addAttribute("ads", userDao.getById(id));
//        return "orders/edit";
//    }

//    @PostMapping("show/{id}/edit")
//    public String updateOrder(@PathVariable long id, @ModelAttribute Order orderToUpdate){
//        userDao.save(orderToUpdate);
//        return "redirect:/show" + orderToUpdate.getOrderNumber();
//    }

//    @GetMapping("show/{id}/delete")
//    public String showdelete(@PathVariable Long id, Model view)
//    {
//        view.addAttribute("ads", userDao.getById(id));
//        return "orders/delete";
//    }
//
//    @PostMapping("show/{id}/delete")
//    public String deleteOrder(@PathVariable Long id)
//    {
//        user user = userDao.getById(id);
//        userDao.delete(user);
//        return "redirect:/show";
//    }

//    private void CODETALK()
//    {
//        String here = "" +
//                "                                                                                 " +
//                "                                                                                 " +
//                "                                                                                 " +
//                "                                                                                 " +
//                "           I was thinking that I could comment in green if this was a bit easier " +
//                "" +
//                "" +
//                "";
//    };
    /////////////// Create Controllers

//    @GetMapping("/create")
//    public String IndexForCreate(){
//        return"orders/create";
//    }

//    @PostMapping("/create")
//    public String addNewOrder(@RequestParam(name="email") String email, @RequestParam(name="totalPrice") Double totalPrice){
//
//        user user = new user(userDao);
//        user.setStatus("  The basic's edit modify delete and create are a blessing! ");
//        user.setEmail(email);
//        userDao.save(user);
//        return "redirect:/show";
//    }


//
//
//    @GetMapping("/signup")
//    public String signup(@RequestParam(name = "firstName") String firstName,
//                         @RequestParam(name = "middleName") String middleName,
//                         @RequestParam(name = "lastName") String lastName,
//                         @RequestParam(name = "userName") String userName,
//                         @RequestParam(name = "email") String email,
//                         @RequestParam(name = "passwordHash") String passwordHash,
////                         @RequestParam(name = "registeredAt") Timestamp registeredAt,
////                         @RequestParam(name = "lastLogin") Timestamp lastLogin,
//                         @RequestParam(name = "intro") String intro,
//                         @RequestParam(name = "profile") String profile,
//                         @RequestParam(name = "mobile") long mobile,
//                         @RequestParam(name = "owner") String owner,
////
////                         << I'm trying to problem solve here. Owner is not representing
////                         a parameter we need in new user. The owner would be the user. but we have to connect these two
////
////                         when you sign up you create your account.
////                          but you can also be the owner of objects. So I'm making these two variables. owner and user {}{}{}{}{}
//
//                            //      you can own an object
//                         //         the object will say who owns it.
//                         //         example
//
//                         //         private final owner = userName . the variable userName will be connected to our repo
//                         //         only the owner can change the objects owner;
//
//                         /*
//
//                         if (owner == writer)
//                             {
//                                Rewrite Method
//
//                                write to file
//
//                                there is a method for write. brb. by the way i'm writing to share my explanation of how things work. Thank you for reading! :D
//
//
//
//
//                               ProfileToBeEdited = new profile;
//                                      return profile
//                             }
//
//
//
//                          */
////
////
////
//                         @RequestParam(name = "status") String status, Model adduser
//
//    )
//    {
//
//        ///      EXAMPLE AREA       in the future we will use the current logged in user.
//
//
////        user user = userDao.getById(1l);
//        user newUser = new user(firstName,middleName,lastName, userName,email,passwordHash,intro,profile,mobile, owner);
//
//        // We need to do our sets
//        newUser.setFirstName(firstName);
//        newUser.setMiddleName(middleName);
//        newUser.setLastName(lastName);
//        newUser.setUserName(userName);
//        newUser.setPasswordHash(passwordHash);
//
//        user saveNewUser = userDao.save(newUser);
//        return "redirect:/UsersHome" + saveNewUser.getId();
//    }


//    @GetMapping("/showUsers")
//    public String showUsers(Model viewallusers)
//    {
//        viewallusers.addAttribute("allusers", userDao.findAll());
//        return "admin/showAllusers";
//
//    }
}
