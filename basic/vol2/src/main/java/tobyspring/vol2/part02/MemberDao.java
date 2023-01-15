package tobyspring.vol2.part02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.Comparator;

public class MemberDao {

    private JdbcTemplate jdbcTemplate;
    private SimpleJdbcInsert memberInsert;
    private SimpleJdbcCall memberFindCall;

    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Autowired
    public void init(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public static void main(String[] args) {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));

    }

}
