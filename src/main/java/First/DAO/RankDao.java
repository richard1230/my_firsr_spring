package First.DAO;

import First.entity.RankItem;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RankDao {
    //mybatis里面需要手工写
    @Autowired
    private SqlSession sqlSession;



    public List<RankItem> getRank(){
        return sqlSession.selectList("MyMapper.selectRank");
    }

}
