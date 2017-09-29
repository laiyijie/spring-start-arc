package net.bojiu.server.web.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import net.bojiu.server.swagger.api.TestApi;
import net.bojiu.server.swagger.model.TestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotNull;
import net.bojiu.server.data.dao.tbUserMapper;
/**
 * Created by admin on 2017/9/28.
 */
@RestController
public class TestController implements TestApi {

    @RequestMapping(value = "/test/info",
            method = RequestMethod.GET)
    public ResponseEntity<TestResponse> testInfoGet(@NotNull @ApiParam(value = "你想说的话", required =
            true)
                                                    @RequestParam(value = "word", required = true) String word,
                                                    HttpServletRequest request,
                                                    HttpServletResponse response) throws Exception {
        TestResponse res = new TestResponse();
        res.setCount(10L);
        res.setMyWord(word);
        return ResponseEntity.ok(res);
    }

}
