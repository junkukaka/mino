package com.test.mybatis;

import com.test.mybatis.minio.MinIOTemplate;
import io.minio.ObjectWriteResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class MinIOTest {

  @Resource
  MinIOTemplate minTemplate;

  //测试创建bucket
  @Test
  void testCreateBucket() throws Exception {
    minTemplate.makeBucket("test");
  }

  //测试上传文件对象
  @Test
  void testPutObject() throws Exception {
    ObjectWriteResponse response = minTemplate.putObject("test",
            "base/test2.png",
            "E:\\test\\123.png");
    System.out.println(response.object());
  }

  //测试删除文件对象
  @Test
  void testDeleteObject() throws Exception {
    minTemplate.removeObject("test",
            "base/springboot");
  }
}