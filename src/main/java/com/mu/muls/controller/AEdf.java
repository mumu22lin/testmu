package com.mu.muls.controller;


import java.io.File;
import java.lang.reflect.Array;


/**
 * Created by bolinluo on 2015/3/6 12
 */
public class AEdf {


        public static  void main(String[] args){

            int[] aa ={1,2,3};
            Array.setInt(aa,1,44);
            System.out.println("aa is==>>>"+ aa[1]);

            String path = "G:\\test";
            File dir = new File(path);
            File[] imgFiles = dir.listFiles();
            int i=0;
            for(File img:imgFiles){
                System.out.println("img is==>>>"+img);
                System.out.println("img name==>>>"+img.getName());
                System.out.println("img absolute file==>>>"+img.getAbsoluteFile());
                System.out.println("img absolute path==>>>"+img.getAbsolutePath());
                System.out.println("img isFile==>>>" + img.isFile());
                System.out.println("img parent==>>>" + img.getParent());
                System.out.println("img getPath==>>>" + img.getPath());
                System.out.println("img length==>>>" + img.getTotalSpace()/(1024*1024*1024));
                i++;
                if(i>2){
                    break;
                }

            }
            System.out.println("assert1");
            assert 1==2:" assert fail";
            System.out.println("assert2");

        }



}
