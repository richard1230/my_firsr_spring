package First;


import First.DAO.UserMapper;
import First.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class HelloController {
    @Autowired
    private RankService rankService;


//    @Autowired
//    private UserMapper userMapper;

    @RequestMapping(value = "/")
    @ResponseBody
    public Object search(HttpServletRequest request, HttpServletResponse response) throws IOException {
        return rankService.getRank();
    }

}
