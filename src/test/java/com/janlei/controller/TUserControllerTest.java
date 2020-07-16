package com.janlei.controller;

import com.janlei.entity.TUser;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TUserControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private TUserController tUserController;

    @Test
    public void test_select_one() {
        TUser tUser = tUserController.selectOne(1000);
        Assertions.assertNotNull(tUser);
    }
}