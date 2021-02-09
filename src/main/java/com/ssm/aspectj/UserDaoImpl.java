package com.ssm.aspectj;

import com.ssm.aspectj.Model.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemlate;

    public void setJdbcTemlate(JdbcTemplate jdbcTemlate) {
        this.jdbcTemlate = jdbcTemlate;
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    public int addUser(User user) {
        String sql ="INSERT INTO `spring_user` ( `username`, `password`) VALUES (?,?);";
        Object[] objects = new Object[]{
                user.getUsername(),
                user.getPassword()
        };
        int num = this.jdbcTemlate.update(sql,objects);
        return num;
    }

    /**
     * 删除用户
     * @param id
     */
    public int deleteUser(int id) {
        String sql ="delete from spring_user id = ?";
        int num = this.jdbcTemlate.update(sql,id);
        return num;
    }

    /**
     * 更新用户
     * @param user
     * @return
     */
    public int updateUser(User user) {
        String sql = "update spring_user set username=?,password=? where id=?";
        Object[] params =new Object[]{
                user.getId(),
                user.getUsername(),
                user.getPassword()
        };
        int num = this.jdbcTemlate.update(sql,params);
        return num;
    }

    public User findUserById(int id) {
        String sql ="select * from spring_user where id = ?";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper(User.class);
        return this.jdbcTemlate.queryForObject(sql,rowMapper,id);
    }

}
