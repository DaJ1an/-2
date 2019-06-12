/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: MyService.java 
 * @Prject: wangzijian-movie
 * @Package: com.ali.service 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月11日 上午9:03:48 
 * @version: V1.0   
 */
package com.ali.service;

import java.util.List;
import java.util.Map;

import com.ali.bean.Movie;

import aj.org.objectweb.asm.Type;

/** 
 * @ClassName: MyService接口
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月11日 上午9:03:48  
 */
public interface MyService {
  List<Map> getMovieList(String mname, String writer, String years, String sydate, String jsdate,
    String minprice, String maxprice);

  int del(String mids);

  List<Type> xial();

  void add(Movie movie);

  void update1(Integer mid);

  void update2(Integer mid);
}
