package com.gzhh.test;

import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class LambdaTest {

    @Test
    public void test(){

        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };

        TreeSet<String> sort = new TreeSet<String>(comparator);
        sort.add("gengzhenhua2");
        sort.add("gengzhenhua22");
        sort.add("gengzhenhua");
    }

    @Test
    public void test2(){

        TreeSet<String> sort = new TreeSet(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
    }

    @Test
    public void test3(){

        TreeSet<String> sort = new TreeSet<>((x ,y) -> Integer.compare(x.length(), y.length()));
    }
    @Test
    public void a(){


    }

}
