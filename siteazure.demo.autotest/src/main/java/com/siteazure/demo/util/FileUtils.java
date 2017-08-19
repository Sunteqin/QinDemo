package com.siteazure.demo.util;

import java.io.*;

/**
 * Created by family-sunte on 2017/6/3.
 */
public class FileUtils {

    public static final  String  imgFolderUrl = "E:\\Hello\\SiteShot";


    // 判断文件夹是否存在
    public static String judeDirExists(String  fileUrl) {
        fileUrl = "".equals(fileUrl)?imgFolderUrl:fileUrl;
        File file = new File(fileUrl);
        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println("dir exists");
            } else {
                System.out.println("the same name file exists, can not create dir");
            }
        } else {
            System.out.println("dir not exists, create it ...");
            if(file.mkdir()){

                System.out.println("创建成功 ...");
            }else{

                System.out.println("创建失败 ...");
            }
        }
        return fileUrl;

    }


    /**
     * 创建文件并写入内容
     * @param filePath 文件路径
     * @param content 文件内容
     */
    public static void createFile(String filePath , String content){
        File file=  new File(filePath);
        if(!file.getParentFile().exists())
            file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.print(filePath +" 创建文件失败！");
            return ;
        }

        //写入文件内容
        try {
            FileWriter fw = new FileWriter(file,false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}
