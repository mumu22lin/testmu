package com.mu.muls.util;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by bolinluo on 2015/3/2.
 */
public class Test1 {
    private static String formatTime(long time){
        if (time <= 0L)
            return "";
        else if (time < 24 * 60 * 60 * 1000L) {
            Date d = new Date(time);
            Calendar c = Calendar.getInstance();
            c.setTimeInMillis(time);
            c.add(c.HOUR,-8);

            return  new SimpleDateFormat("HH时mm分ss秒").format(c.getTime());
        }
        else
            return  time / (24 * 60 * 60 * 1000L) + "天以上";

    }

    public static void  main(String args[]) throws UnknownHostException {
        byte bb = 21;
        InetAddress addr = InetAddress.getLocalHost();
        String ip=addr.getHostAddress().toString();//获得本机IP

        System.out.println("get time==>>>>>" + formatTime(1674000*4));
        System.out.println("get ip==>>>>>" + ip);

        String path ="layout/56000/63675/4123beaed4564a409af8f7210e18c3a8";
        //int i = path.indexOf();
        System.out.println(" path="+path.substring("layout".length()));

        Md5PasswordEncoder md5 = new Md5PasswordEncoder();
        String md5pwd = md5.encodePassword("111", "kisen");
        System.out.println("pwd===>>"+md5pwd);
        Map<Integer,Integer> map= new HashMap<Integer,Integer>(10);
        map.put(11,1);
        map.put(12,2);
        map.put(13,3);
        map.put(14,3);
        map.put(15,3);
        System.out.println("map =" + map.size() + " a=" + map.get(15).intValue());
        int validLayer = 0, times=0;
        Set mapSet = map.entrySet();
        Iterator<Map.Entry> iterator = mapSet.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,Integer> entry = iterator.next();
            int key = entry.getKey().intValue();
            int value = entry.getValue().intValue();
            if(value>times){
                validLayer = key ;
                times= value;
            }
            if(value==times && key>validLayer){
                validLayer = key;
            }
        }

        System.out.println("layer=" + validLayer + " times=" + times);

    }
}
