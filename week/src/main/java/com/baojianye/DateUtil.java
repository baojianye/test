/**
 * Create Date:2019年5月20日
 */
package com.baojianye;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:鲍建业(870403315@qq.com)
 * <br>Date:2019年5月20日
 */
public final class DateUtil {

  public static String DATA_PATTERN = "yyyy-MM-dd";

  public static String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:鲍建业(870403315@qq.com)
   * <br>Date:2019年5月20日
   */
  public DateUtil() {
    super();
    // TODO Auto-generated constructor stub
  }

  public static DateUtil dateToDateUtils(Date date) {
    return DateUtil.ofInstant(date.toInstant(), ZoneId.systemDefault());

  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:鲍建业(870403315@qq.com)
   * <br>Date:2019年5月20日
   * @param instant
   * @param systemDefault
   * @return
   */
  private static DateUtil ofInstant(Instant instant, ZoneId systemDefault) {

    return null;
  }

}
