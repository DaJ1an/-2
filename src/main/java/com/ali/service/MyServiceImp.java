/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: MyServiceImp.java 
 * @Prject: wangzijian-movie
 * @Package: com.ali.service 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月11日 上午9:04:17 
 * @version: V1.0   
 */
package com.ali.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ali.bean.Movie;
import com.ali.mapper.MovieMapper;

import aj.org.objectweb.asm.Type;

/** 
 * @ClassName: MyServiceImp实现类
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月11日 上午9:04:17  
 */
@Service
public class MyServiceImp implements MyService {
  @Autowired
  private MovieMapper mapper;

  /* (non Javadoc) 
   * @Title: getMovieList
   * @Description: 实现电影列表
   * @return 
   * @see com.ali.service.MyService#getMovieList() 
   */
  @Override
  public List<Map> getMovieList(String mname, String writer, String years, String sydate, String jsdate,
    String minprice, String maxprice) {
    // TODO Auto-generated method stub
    return mapper.getMovieList(mname, writer, years, sydate, jsdate, minprice, maxprice);
  }

  /* (non Javadoc) 
   * @Title: del
   * @Description:实现批量删除
   * @param mids
   * @return 
   * @see com.ali.service.MyService#del(java.lang.String) 
   */
  @Override
  public int del(String mids) {
    // TODO Auto-generated method stub
    return mapper.del(mids);
  }

  /* (non Javadoc) 
   * @Title: xial
   * @Description: TODO
   * @return 
   * @see com.ali.service.MyService#xial() 
   */
  @Override
  public List<Type> xial() {
    // TODO Auto-generated method stub
    return mapper.xial();
  }

  /* (non Javadoc) 
   * @Title: add
   * @Description: TODO
   * @param movie 
   * @see com.ali.service.MyService#add(com.ali.bean.Movie) 
   */
  @Override
  public void add(Movie movie) {
    // TODO Auto-generated method stub
    mapper.add(movie);
  }

  /* (non Javadoc) 
   * @Title: update1
   * @Description: TODO
   * @param mid 
   * @see com.ali.service.MyService#update1(java.lang.Integer) 
   */
  @Override
  public void update1(Integer mid) {
    // TODO Auto-generated method stub
    mapper.update1(mid);
  }

  /* (non Javadoc) 
   * @Title: update2
   * @Description: TODO
   * @param mid 
   * @see com.ali.service.MyService#update2(java.lang.Integer) 
   */
  @Override
  public void update2(Integer mid) {
    // TODO Auto-generated method stub
    mapper.update2(mid);
  }

}
