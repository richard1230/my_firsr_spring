package First;


import First.entity.RankItem;
import First.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private RankService rankService;


//    @Autowired
//    private UserMapper userMapper;

//    @RequestMapping(value = "/")
//    @ResponseBody
//    public Object search(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        return rankService.getRank();
//    }
    @RequestMapping("/")
    public ModelAndView index()  {
        List<RankItem> items = rankService.getRank();
        HashMap<String,Object> model =new HashMap<>();
        model.put("items",items);
        return new ModelAndView("index",model);
    }

    @RequestMapping("/rankData")
    @ResponseBody
    public Object getRankData(){
        return rankService.getRank();
    }


}
