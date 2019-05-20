/**
 * Create Date:2019年5月20日
 */
package com.baojianye;

import org.junit.Test;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:鲍建业(870403315@qq.com)
 * <br>Date:2019年5月20日
 */

public class FileUtilsTest {

  //获取用户目录
  @Test
  public void funTest() {
    FileUtil fileUtil = new FileUtil();

    String userHome = fileUtil.getUserHome();

    System.out.println(userHome);
  }

  //获取临时目录
  @Test
  public void fun2Test() {
    FileUtil fileUtil = new FileUtil();

    String file = fileUtil.getTempFile();

    System.out.println(file);
  }

}
