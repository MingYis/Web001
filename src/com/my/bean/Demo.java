package com.my.bean;

import com.my.service.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo implements UserService {



    /*	智能补全  引包 alt+Enter
    	由方法自动生成返回值变量 ctrl+alt+v
    	跳到方法的实现类 ctrl+alt+b
    	实现接口或父类方法 ctrl +O    ctrl + i
    	查看方法参数 ctrl+p
    	查看方法文档  ctrl+q
    	复制行 ctrl+D
    	删除行 ctrl+Y
    	跳转到上一个/下一个位置   ctrl+alt+左右
    	大小写切换  ctrl+shift+u
    */
    public static void main(String[] args) {
        List list = new ArrayList();
        int a = 1;
        List<String> list1 = new ArrayList<>();
        System.out.println("list1 = " + list1);
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("list1 = " + list1);
    }

    public void a(){
        /*	查看快速录入列表 ctrl+j
        	foreach     iter
        	普通for循环  fori
        	循环数组   itar
        	迭代器遍历 itco
        	psvm  主函数
        	psf    常量
        	生成代码块： ctrl+alt+t   (try/ if / for/ while/ synchronized)
*/

        System.out.println("asd");
    }

    public void b(){
        System.out.println("asd");
    }

    @Override
    public void insert(String name) {
        System.out.println(name);
    }
}
