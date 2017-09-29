package net.bojiu.server.test;

import net.bojiu.server.web.config.CommonConfig;
import net.bojiu.server.web.controller.TestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.mock.mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
/**
 * Created by laiyijie on 9/29/17.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(TestController.class)
public class ExampleTest {

    @Autowired
    private MockMvc mockMvc;
    @Test
    public void example() throws Exception {
        this.mockMvc.perform(get("/test/info").param("word","myword"))
                .andExpect(status().isOk());
    }

}
