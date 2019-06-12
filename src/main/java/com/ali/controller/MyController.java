/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: MyController.java 
 * @Prject: wangzijian-movie
 * @Package: com.ali.controller 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月11日 上午9:05:38 
 * @version: V1.0   
 */
package com.ali.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ali.bean.Movie;
import com.ali.service.MyService;
import com.ali.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import aj.org.objectweb.asm.Type;

/** 
 * @ClassName: MyController 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月11日 上午9:05:38  
 */
@Controller
public class MyController {
  @Autowired
  private MyService ms;

  @RequestMapping("list")
  public String getListMovie(Model model, @RequestParam(defaultValue = "1") Integer pageNum, String mname,
    String writer, String years, String sydate, String jsdate, String minprice, String maxprice) {
    PageHelper.startPage(pageNum, 3);
    List<Map> list = ms.getMovieList(mname, writer, years, sydate, jsdate, minprice, maxprice);
    PageInfo info = new PageInfo(list);
    PageUtils.page(model, info, "");
    model.addAttribute("list", list);
    model.addAttribute("mname", mname);
    model.addAttribute("writer", writer);
    model.addAttribute("years", years);
    model.addAttribute("sydate", sydate);
    model.addAttribute("jsdate", jsdate);
    model.addAttribute("minprice", minprice);
    model.addAttribute("maxprice", maxprice);
    return "list";
  }

  @RequestMapping("del")
  @ResponseBody
  public Object del(String mids) {
    int del = ms.del(mids);
    System.out.println(del);
    return del;
  }

  @RequestMapping("toAdd")
  public Object toAdd() {
    return "add";
  }

  @RequestMapping("toChaxun")
  public Object chaxun() {
    return "chaxun";
  }

  @RequestMapping("xial")
  @ResponseBody
  public Object xial() {
    List<Type> xial = ms.xial();
    return xial;
  }

  @RequestMapping("add")
  @ResponseBody
  public Object add(Movie movie) {
    ms.add(movie);
    return true;
  }

  @RequestMapping("update1")
  public String update1(Integer mid) {
    ms.update1(mid);
    return "redirect:list";
  }

  @RequestMapping("update2")
  public String update2(Integer mid) {
    ms.update2(mid);
    return "redirect:list";
  }
}
