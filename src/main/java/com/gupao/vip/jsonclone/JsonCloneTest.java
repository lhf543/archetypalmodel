package com.gupao.vip.jsonclone;


import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试
 */
public class JsonCloneTest {

    public static void main(String[] args) {

        List<String> color = new ArrayList<>();
        color.add("红色");
        color.add("蓝色");
        color.add("白色");

        Phone phone = new Phone("IPone XS",28,8,color,6500D);

        Phone phone2 = null;
        phone2 =phone.clone(phone);


        System.out.println(phone2.getModel());
        System.out.println(phone2.getPrice());
        System.out.println(phone==phone2);
        System.out.println(phone.getColor()==phone2.getColor());
    }


}
