package com.mu.muls.util;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.*;

/**
 * Created by bolinluo on 2014/12/5.
 */

public class JsonLib {


    public static void main(String[] args) {
        JSONObject job = new JSONObject();
        job.put("aa","aa");
        job.put("age",32);
        System.out.println("job=" + job.toString());

        boolean[] boolArray = new boolean[]{true,false,true};
        JSONArray jsonArray = JSONArray.fromObject(boolArray);
        System.out.println( "jsonArray="+jsonArray );

        List list = new ArrayList();
        list.add( "first" );
        list.add( "second" );
        JSONArray jsonList = JSONArray.fromObject( list );
        System.out.println( "jsonList="+jsonList );

        Map map = new HashMap();
        map.put( "name", "json" );
        map.put( "bool", Boolean.TRUE );
        map.put( "int", new Integer(1) );
        map.put( "arr", new String[]{"a","b"} );
        map.put( "func", "function(i){ return this.arr[i]; }" );

        JSONObject jsonMap = JSONObject.fromObject( map );
        System.out.println( jsonMap );

        String jsonListStr="{list:['first','second']}";

        JSONObject jlist = JSONObject.fromObject(jsonListStr);
       // List<Object> list1 = (List<Object>) jlist.get("list");
        Map<Object,Object> list1 =(Map<Object,Object>)JSONObject.toBean(jlist,Map.class);
        System.out.println(list1.get("list"));


        JSONArray jsonArray1 = JSONArray.fromObject("[89,90,99]");
        Object array = JSONArray.toArray(jsonArray1);
        System.out.println(array);
        System.out.println(Arrays.asList((Object[]) array));


    }




}
