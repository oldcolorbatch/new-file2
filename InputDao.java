package dao;

import domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import utils.JDBCUtils;

import java.util.List;

public class InputDao {
    public List< User > select(){
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql="select * from message1";
        List< User > query =
                template.query(sql, new BeanPropertyRowMapper< User >(User.class));
        System.out.println(query);
        return query;
    }
}
