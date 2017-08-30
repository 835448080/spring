package com.yjg.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Mybatis {
    public static void main(String[] args) throws IOException {
        // try-with-resource
        try (InputStream inputStream
                     =  Resources.getResourceAsStream("mybatis/mybatis-config.xml");
             ){
            SqlSessionFactory sqlSessionFactory =
                    new SqlSessionFactoryBuilder()
                            .build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            UserDao userDao = session.getMapper(UserDao.class);
            userDao.userInfo("");
            session.close();
        }
    }
}
