package Fuli;
import java.awt.event.*;  
import java.awt.*;   

import javax.swing.*;


public class Loading extends JFrame   //设置登录界面
{
	    //设置界面宽高
	    int centerX;	                     			
	    int centerY;

	    //初始化菜单栏
		private JMenuBar menu=new JMenuBar();
		private JMenu deposit=new JMenu("复利计算 |");
		private JMenu credit=new JMenu("贷款计算  |");
		private JMenu invest=new JMenu("投资计算  |");
		private JMenu music =new JMenu("  音乐    |");
		private JMenu exit  =new JMenu("  退出    |");
		private JMenuItem on = new JMenuItem("开"); 
		private JMenuItem off = new JMenuItem("关");

		public Loading()
		{
			setTitle("存款投资贷款计算器(志杰)");

			MyPanel mp=new MyPanel();						//图片面板类
			menu.add(deposit);
			menu.add(credit);
			menu.add(invest);
			music.add(on);
			music.add(off);
			menu.add(music);
			menu.add(exit);
			
			
			
			//添加图片面板到顶层容器
			add(mp);                           
			setJMenuBar(menu);
			menulistenermethod();  //设置监听器

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //结束进程
			
			

			centerX=Toolkit.getDefaultToolkit().getScreenSize().width;				
			centerY=Toolkit.getDefaultToolkit().getScreenSize().height;
	
			//x：组件在容器X轴上的起点 y：组件在容器Y轴上的起点 width：组件的长度 height：组件的宽度
			setBounds(centerX/4, centerY/5, centerX/2,centerY/2 );
			setResizable(false);          //改变窗体
			setVisible(true);			
		
		}

		public void menulistenermethod() // 鼠标事件处理，为各个菜单项添加事件响应机制
		{

			deposit.addMouseListener(new MouseAdapter() {//适配器
				public void mousePressed(MouseEvent e) {

					new Fuli();

				}
			});
			credit.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e)// mousePressed是处理当按下鼠标时发生该事件
				{
					new Credit();
				}
			});
			invest.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					new Invest3();
				}
			});
			on.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					Music music = new Music();
					music.isplay=true;
				}
			});
			off.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					Music music = new Music();
					music.isplay=false;
				}
			});

		}
		
		private class MyPanel extends JPanel 
		{
			
			//写了一个带参数的构造方法.但又想让这个类在没有参数的情况下也能实例化,构造空的构造方法用作反射，Java内部会有调用，一般都通过反射实现，
			public MyPanel(){}
			protected void paintComponent(Graphics g)	//重写绘画组件方法
			{
				//就是java.net.URL类 声明一个它的对象imgURL  
				//而这个对象是指向JButtonApp.class.getResource(path) 也就是imgURL  的值就是JButtonApp.class.getResource(path)
				java.net.URL imgURL =getClass().getResource("aaa.jpg");
				ImageIcon icon =new ImageIcon(imgURL);		
				
				//对象，坐标x,y，图片宽度和高度，转换图像要通知的对象
				g.drawImage(icon.getImage(),0,0,getSize().width,getSize().height,this);
				
			}
		}
		
		
		public static void main(String[] args) {

			new Loading();
			
		}
}



