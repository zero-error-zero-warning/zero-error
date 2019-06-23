package mapper;
import model.*;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: Zero_Error
 *
 * @description: 测试mapper
 *
 * @author: Mr.Wang
 *
 * @create: 2019-06-23 17:17
 **/


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/applicationContext*.xml")
public class MapperTest {
    @Autowired
    private EmployeesMapper employeesMapper;
    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private DiscountMapper discountMapper;

    @Autowired
    private GoodsCategoryMapper goodsCategoryMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private RestaurantTablesMapper restaurantTablesMapper;

    @Autowired
    private VipMapper vipMapper;
    /** 
    * @Description: 测试adminmapper
    * @Param:  
    * @return:  
    * @Author: 陈泯全
    * @Date: 2019/6/23 
    */ 
    @Test
    public void testAdminMapper(){
        //根据账号查询
        Admin em = new Admin();
        Map m =new HashMap();
        String username = "18200244217";
        String password = "aa123456";
        m.put("username",username);
        m.put("password",password);
        em= adminMapper.getAdminByAccount(m);
        System.out.println(em.getAdminId());
    }



    @Test
    public void testCustomerChhsedMenuMapper(){
        //添加选菜单
        List<CustomerChoosedMenu> ccm=new ArrayList<CustomerChoosedMenu>();
        String fina="";
        for(int x=0 ; x < 5 ; x++){
            CustomerChoosedMenu cc =new CustomerChoosedMenu();
            cc.setGoodsId(4);
            cc.setNum(2);

            ccm.add(cc);
        }
    }

    @Test
    public void testDiscountMapper(){
        //获取折扣
//        Discount d =null;
//        d = discountMapper.getDiscount();
//        System.out.println(d.getDiscount());

        //修改折扣
        Discount d =new Discount();
        d.setDiscount(0.9f);
        int i = discountMapper.updateDiscount(d);
        System.out.println(i);
    }

    @Test
    public void testEmployeesMapper(){
        //增加用户
//       Employees em = new Employees();
//        em.setName("代睿");
//        em.setPhoneNum("18200244227");
//        em.setText("哈哈哈");
//        int i = employeesMapper.addEmployee(em);
//        System.out.println(em.getEmployeeId());
//        System.out.println(i);

        //删除用户
//        int i = employeesMapper.deleteEmployeeById("1");
//        System.out.println(i);

        //查询用户
//        Employees em = new Employees();
//        em = employeesMapper.getEmployById("19");
//        System.out.println(em.getName());

        //查询
//        Map m = new HashMap();
//        m.put("username","18200244227");
//        m.put("password","aa123456");
//        em = employeesMapper.getEmployeesByAccount(m);
//        System.out.println(em.getName());

        //查询
//        List<Employees> le=null;
//        le = employeesMapper.getEmployeesByDefault();
//        System.out.println(le.size());

        //重置秘密
//        int i = employeesMapper.resetEmployeePwdById("22");
//        System.out.println(i);
    }

    @Test
    public void testGoodsCategoryMapper() {
        //添加
//        String [] category ={"小吃","饮料","汉堡","鸡翅","牛排"};
//        for(int i=0;i<5;i++)
//        {
//            GoodsCategory goodsCategory=new GoodsCategory();
//            goodsCategory.setCategory(category[i]);
//            System.out.println(goodsCategoryMapper.addGoodsCategory(goodsCategory));
//        }
        //删除
//        System.out.println(goodsCategoryMapper.deleteGoodsCategory("1"));

        //查询
//        System.out.println(goodsCategoryMapper.getGoodsCategoryById("2").getCategory());

        //查询
//        System.out.println(goodsCategoryMapper.getGoodsCategoryByDefault().size());


    }

    @Test
    public void testGoodsMapper(){
        //添加
        Goods goods = new Goods();
        goods.setName("鸡肉汉堡");
        goods.setGoodsCategoryId("3");
        goods.setPrice(16.5f);
        goods.setPictureUrl("etst.jpg");
        System.out.println(goodsMapper.addGoods(goods));

        //删除
//        System.out.println(goodsMapper.deleteGoodsById("3"));

        //删除
//        System.out.println(goodsMapper.deleteGoodsByCategoryId("3"));

        //查询
//        System.out.println(goodsMapper.getGoodsByDefault().size());

        //查询
//        System.out.println(goodsMapper.getGoodsByCategory("4").size());
    }

    @Test
    public void testRestaurantTabelsMapper(){
        //添加
//        RestaurantTables re =new RestaurantTables();
//        re.setStatus(1);
//        System.out.println(restaurantTablesMapper.addRestaurantTable(re));

        //删除
//        System.out.println(restaurantTablesMapper.deleteRestaurantTable("1"));

        //查询
//        System.out.println(restaurantTablesMapper.getRestaurantTabelsByDefault().size());

        //查询
//        System.out.println(restaurantTablesMapper.getRestaurantTabelsById("2").getStatus());
    }

//    @Test
//    public void testSalesOrderDetailMapper(){
//
//    }

//    @Test
//    public void testSalesOrderMapper(){
//
//    }

    @Test
    public void testVip(){
        //添加
//        Vip v =new Vip();
//        v.setName("代睿");
//        v.setPhoneNum("18200244217");
//        v.setGender("男");
//        System.out.println(vipMapper.addVip(v));

        //查询
        System.out.println(vipMapper.getVipByDefault().size());

        //查询
        System.out.println(vipMapper.getVipByNum("18200244217").getName());
    }

//    @Test
//    public void testWorkAttendanceMapper(){
//
//    }
}
