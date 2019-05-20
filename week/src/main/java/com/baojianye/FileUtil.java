/**
 * Create Date:2019年5月20日
 */
package com.baojianye;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:鲍建业(870403315@qq.com)
 * <br>Date:2019年5月20日
 */
public class FileUtil {

  //用户目录
  public String getUserHome() {
    String userHome = System.getProperties().getProperty("user.home");
    return userHome;
  }

  //临时目录
  public String getTempFile() {
    String tempPath = System.getProperties().getProperty("java.io.temdir");
    return tempPath;
  }

}
