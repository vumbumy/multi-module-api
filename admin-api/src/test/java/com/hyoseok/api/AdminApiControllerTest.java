package com.hyoseok.api;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@WebMvcTest(AdminApiController.class)
@DisplayName("Admin API 테스트")
public class AdminApiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("상품을 생성한다.")
    public void createProduct() throws Exception {

    }

}