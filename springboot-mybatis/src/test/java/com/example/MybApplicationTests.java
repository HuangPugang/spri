package com.example;

import com.example.business.UserBusiness;
import com.example.mq.Sender;
import com.example.repository.TeacherRepository;
import com.example.service.UserCacheService;
import com.example.service.RedisService;
import com.example.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybApplicationTests {

    @Autowired
    UserService userService;

    @Autowired
    private TeacherRepository teacherRepository;


    @Autowired
    UserCacheService userCacheService;

    @Autowired
    UserBusiness userBusiness;
    @Test
    public void contextLoads() {
//        Random random = new Random();
//        User user = new User();
//        User user2 = new User();
//        user.setId(random.nextInt(10000));
//        user.setAge(random.nextInt());
//        user.setEmail("htt0");
//        user.setName("haha");
//
//        userService.insert(user);
////		userService.insert(user2);
//		List<User> users = userService.findAll();
//		System.out.println(users.toString());

        // 创建三个User，并验证User总数
//        teacherRepository.save(new Teacher(1L, "didi", 30));
//        teacherRepository.save(new Teacher(2L, "gege", 40));
//        teacherRepository.save(new Teacher(3L, "jiejie", 45));

//        Teacher teacher = teacherRepository.findById(2L);
//        System.out.println(teacher.toString());

//        userCacheService.findUser(1L,"哈哈","嘿嘿");

        userBusiness.testTransitional();
    }



    @Autowired
    private Sender sender;

    /**
     * 使用代码配置方式使用rabbit
     */
    @Test
    public void rabbitHello() {
//        sender.send();
    }
    @Autowired
    RedisService redisService;
    /**
     * 后台配置
     */
    @Test
    public void rabbitTest() {
        sender.sendTest();
        redisService.set("textss","test22");
        System.out.println(redisService.get("textss"));
    }



}
