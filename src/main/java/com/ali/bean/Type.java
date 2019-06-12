/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: Type.java 
 * @Prject: wangzijian-movie
 * @Package: com.ali.bean 
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月11日 上午8:59:56 
 * @version: V1.0   
 */
package com.ali.bean;

/** 
 * @ClassName: Type实体类
 * @Description: TODO
 * @author: 大建
 * @date: 2019年6月11日 上午8:59:56  
 */
public class Type {
  private int tid;

  private String tname;

  /**
   * @return the tid
   */
  public int getTid() {
    return tid;
  }

  /**
   * @param tid the tid to set
   */
  public void setTid(int tid) {
    this.tid = tid;
  }

  /**
   * @return the tname
   */
  public String getTname() {
    return tname;
  }

  /**
   * @param tname the tname to set
   */
  public void setTname(String tname) {
    this.tname = tname;
  }

  /** 
   * @Title:Type
   * @Description:TODO 
   * @param tid
   * @param tname 
   */
  public Type(int tid, String tname) {
    super();
    this.tid = tid;
    this.tname = tname;
  }

  /** 
   * @Title:Type
   * @Description:TODO  
   */
  public Type() {
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
    return "Type [tid=" + tid + ", tname=" + tname + "]";
  }

}
