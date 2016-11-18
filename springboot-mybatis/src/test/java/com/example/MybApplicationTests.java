package com.example;

import com.example.domain.Teacher;
import com.example.domain.User;
import com.example.mapper.UserMapper;
import com.example.mq.Sender;
import com.example.repository.TeacherRepository;
import com.example.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MybApplication.class)
public class MybApplicationTests {

    @Autowired
    UserService userService;

    @Autowired
    private TeacherRepository teacherRepository;


    @Test
    public void contextLoads() {
//		Random random = new Random();
//		User user = new User();
//		User user2 = new User();
//		user.setId(random.nextInt(10000));
//		user.setAge(random.nextInt());
//		user.setEmail("htt0");
//		user.setName("haha");
//
//		userService.insert(user);
//		userService.insert(user2);
//		List<User> users = userMapper.findAll();
//		System.out.println(users.toString());

        // 创建三个User，并验证User总数
//        teacherRepository.save(new Teacher(1L, "didi", 30));
//        teacherRepository.save(new Teacher(2L, "gege", 40));
//        teacherRepository.save(new Teacher(3L, "jiejie", 45));

        Teacher teacher = teacherRepository.findById(2L);
        System.out.println(teacher.toString());
    }


    @Autowired
    private Sender sender;

    @Test
    public void rabbitHello(){
        sender.send();
    }
}
