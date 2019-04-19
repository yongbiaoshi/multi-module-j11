package com.my.test.sbmm2.web.test;

import com.my.sbmm2.user.entity.po.User;
import com.my.sbmm2.user.service.UserService;
import com.my.test.sbmm2.web.WebApplication;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.web.context.WebApplicationContext;

import java.util.Date;
import java.util.Optional;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(classes = WebApplication.class)
@AutoConfigureMockMvc
public class HomeControllerTests {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private MockMvc mvc;

    @Autowired
    private WebApplicationContext ctx;
    @MockBean
    private UserService userService;

    @Test
    public void getUserTest() throws Exception {

        User user = new User();
        user.setAge(18);
        user.setId(1L);
        user.setName("wlb");
        user.setEmail("wlb@qq.com");
        user.setCreateDate(new Date());
        user.setModifyDate(new Date());
        given(userService.findById(1L)).willReturn(Optional.of(user));
        MockHttpServletRequestBuilder rb = get("/users/{id}", "1").accept(MediaType.APPLICATION_JSON_UTF8);
        ResultActions r = mvc.perform(rb);
        r.andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$.name").value("wlb"))
        ;

    }

}
