package pers.li.dao;

import org.springframework.stereotype.Repository;

/**
 * create by lishengbo 2018/11/11
 */
@Repository
public class TestDao2 implements  TestDaoInterface{

    public TestDao2() {
        System.err.println("dao-->instance");
    }

    public void test(){
        System.out.println("dao---->test2");
    }
}
