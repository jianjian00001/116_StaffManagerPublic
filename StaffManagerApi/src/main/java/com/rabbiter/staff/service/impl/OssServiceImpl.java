package com.rabbiter.staff.service.impl;

import com.rabbiter.staff.service.OssService;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
public class OssServiceImpl implements OssService {
    @Override
    public String uploadFileAvatar(MultipartFile file) {
        String fileName = file.getOriginalFilename();

        //1.在文件名称中添加随机唯一值
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        fileName = uuid + fileName;

        String path = System.getProperty("user.dir")+"\\src\\main\\resources\\static\\files\\" + fileName;
        try {
            FileUtils.copyInputStreamToFile(file.getInputStream(), new File(path));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return "/files/" + fileName;
    }
}
