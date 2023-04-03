package com.senlainc;

import com.senlainc.configuration.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

//        UserController userController = new UserController();
//        User user = new User();
//        user.setName("Bob");
//        user.setEmail("bod@mail.com");
//        userController.saveUser(user);
//        System.out.println(userController.get(user.getId()));
//        user.setName("Rock");
//        userController.update(user);
//        System.out.println(userController.get(user.getId()));
//        List<User> users = userController.getAll();
//        for (User u : users) {
//            System.out.println(u);
//        }
//        userController.remove(user.getId());
    }
}