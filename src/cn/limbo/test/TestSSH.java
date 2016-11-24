package cn.limbo.test;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by limbo on 2016/11/8.
 */
public class TestSSH {

    private ApplicationContext ctx = null;

    @Test
    public void show() throws SQLException {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("数据源：" + ctx);
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println("打开数据连接" + dataSource.getConnection().toString());
        SessionFactory sessionFactory = ctx.getBean(SessionFactory.class);
        System.out.println("sessionFactory" + sessionFactory);
    }

}
