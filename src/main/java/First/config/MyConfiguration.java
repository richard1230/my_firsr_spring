package First.config;

import First.DAO.RankDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public RankDao getRankDao(){
        return null;
    }

}

