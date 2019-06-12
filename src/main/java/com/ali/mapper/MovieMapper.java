/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: MovieMapper.java 
 * @Prject: wangzijian-movie
 * @Package: com.ali.mapper 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月11日 上午9:00:59 
 * @version: V1.0   
 */
package com.ali.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ali.bean.Movie;

import aj.org.objectweb.asm.Type;

/** 
 * @ClassName: MovieMapper接口 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月11日 上午9:00:59  
 */
public interface MovieMapper {
  List<Map> getMovieList(@Param("mname") String mname, @Param("writer") String writer,
    @Param("years") String years, @Param("sydate") String sydate, @Param("jsdate") String jsdate,
    @Param("minprice") String minprice, @Param("maxprice") String maxprice);

  int del(String mids);

  List<Type> xial();

  void add(Movie movie);

  void update1(Integer mid);

  void update2(Integer mid);
}
