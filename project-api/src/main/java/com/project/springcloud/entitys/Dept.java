package com.project.springcloud.entitys;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@NoArgsConstructor //空参构造器
@AllArgsConstructor//全参构造器
@Data//get set
@Accessors(chain=true)//连式风格访问
public class Dept implements Serializable// entity --orm--- db_table
{
	private Long 	deptno; // 主键
	private String 	dname; // 部门名称
	private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	
	public Dept(String dname)
	{
		super();
		this.dname = dname;
	}
	
//	public static void main(String[] args) {
//		Dept user=new Dept().setDb_source("aaaa").setDname("bbbb"); //这就是链式写法 ...
//        System.out.println(user);
//    }
	
}
