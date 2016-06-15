package com.test;
/**
 * 写个注释看看？
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("这是一个测试类");
		for(int i=0;i<10;i++){
			System.out.println("这是一个循环,循环第"+(i+1)+"次");
		}
		汽车 s = new 汽车();//这是中文类
		System.out.println(s.高度);
		Car c = new Car();//这是个英文的
		System.out.println(c.getName());
		
	}
}
