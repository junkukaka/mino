package com.test.mybatis.upload;

import com.test.mybatis.curd.service.PersonService;
import com.test.mybatis.minio.MinIOProperties;
import com.test.mybatis.minio.MinIOTemplate;
import com.test.mybatis.pojo.Person;
import io.minio.ObjectWriteResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class MinIOFileUploadController {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Resource
    MinIOTemplate minIOTemplate;

    @Resource
    PersonService personService;

    @Resource
    MinIOProperties minIOProperties;

    @PostMapping("/minio/upload")
    public String uploadFile(MultipartFile uploadFile, HttpServletRequest request) throws Exception{

        String format = sdf.format(new Date());
        InputStream inputStream = uploadFile.getInputStream();
        String originalFilename = uploadFile.getOriginalFilename();
        String contentType = uploadFile.getContentType();
        String fileName = "base/" +  format + originalFilename;

        System.out.println("contentType=" + contentType);

        ObjectWriteResponse objectWriteResponse = minIOTemplate.putObject(fileName, inputStream,contentType);

        //Person proses
        String name = request.getParameter("name");
        Integer age = Integer.parseInt(request.getParameter("age"));
        Person person = new Person();
        person.setPhoto(minIOProperties.getUrl()+objectWriteResponse.object());
        person.setName(name);
        person.setAge(age);
        //保存路径
        personService.savePerson(person);

        System.out.println(person.toString());

        return null;
    }
}
