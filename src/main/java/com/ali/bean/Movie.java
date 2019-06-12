/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: Movie.java 
 * @Prject: wangzijian-movie
 * @Package: com.ali.bean 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月11日 上午8:56:58 
 * @version: V1.0   
 */
package com.ali.bean;

/** 
 * @ClassName: Movie实体类
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月11日 上午8:56:58  
 */
public class Movie {
  private Integer mid;

  private String mname;

  private String writer;

  private double price;

  private String mdate;

  private Integer tid;

  private String years;

  private String quyu;

  private Integer states;

  /**
   * @return the mid
   */
  public Integer getMid() {
    return mid;
  }

  /**
   * @param mid the mid to set
   */
  public void setMid(Integer mid) {
    this.mid = mid;
  }

  /**
   * @return the mname
   */
  public String getMname() {
    return mname;
  }

  /**
   * @param mname the mname to set
   */
  public void setMname(String mname) {
    this.mname = mname;
  }

  /**
   * @return the writer
   */
  public String getWriter() {
    return writer;
  }

  /**
   * @param writer the writer to set
   */
  public void setWriter(String writer) {
    this.writer = writer;
  }

  /**
   * @return the price
   */
  public double getPrice() {
    return price;
  }

  /**
   * @param price the price to set
   */
  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * @return the mdate
   */
  public String getMdate() {
    return mdate;
  }

  /**
   * @param mdate the mdate to set
   */
  public void setMdate(String mdate) {
    this.mdate = mdate;
  }

  /**
   * @return the tid
   */
  public Integer getTid() {
    return tid;
  }

  /**
   * @param tid the tid to set
   */
  public void setTid(Integer tid) {
    this.tid = tid;
  }

  /**
   * @return the years
   */
  public String getYears() {
    return years;
  }

  /**
   * @param years the years to set
   */
  public void setYears(String years) {
    this.years = years;
  }

  /**
   * @return the quyu
   */
  public String getQuyu() {
    return quyu;
  }

  /**
   * @param quyu the quyu to set
   */
  public void setQuyu(String quyu) {
    this.quyu = quyu;
  }

  /**
   * @return the states
   */
  public Integer getStates() {
    return states;
  }

  /**
   * @param states the states to set
   */
  public void setStates(Integer states) {
    this.states = states;
  }

  /** 
   * @Title:Movie
   * @Description:TODO 
   * @param mid
   * @param mname
   * @param writer
   * @param price
   * @param mdate
   * @param tid
   * @param years
   * @param quyu
   * @param states 
   */
  public Movie(Integer mid, String mname, String writer, double price, String mdate, Integer tid,
    String years, String quyu, Integer states) {
    super();
    this.mid = mid;
    this.mname = mname;
    this.writer = writer;
    this.price = price;
    this.mdate = mdate;
    this.tid = tid;
    this.years = years;
    this.quyu = quyu;
    this.states = states;
  }

  /** 
   * @Title:Movie
   * @Description:TODO  
   */
  public Movie() {
    super();
    // TODO Auto-generated constructor stub
  }

  /* (non Javadoc) 
   * @Title: toString
   * @Description: TODO
   * @return 
   * @see java.lang.Object#toString() 
   */
  @Override
  public String toString() {
    return "Movie [mid=" + mid + ", mname=" + mname + ", writer=" + writer + ", price=" + price + ", mdate="
      + mdate + ", tid=" + tid + ", years=" + years + ", quyu=" + quyu + ", states=" + states + "]";
  }

}
