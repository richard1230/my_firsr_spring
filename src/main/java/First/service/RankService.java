package First.service;

import First.DAO.RankDao;
import First.DAO.UserMapper;
import First.entity.RankItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
     private RankDao rankDao;

    public List<RankItem> getRank(){
    return rankDao.getRank();
    }
}
