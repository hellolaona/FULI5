package Fuli;
import java.awt.event.*;  
import java.awt.*;   

import javax.swing.*;


public class Loading extends JFrame   //���õ�¼����
{
	    //���ý�����
	    int centerX;	                     			
	    int centerY;

	    //��ʼ���˵���
		private JMenuBar menu=new JMenuBar();
		private JMenu deposit=new JMenu("�������� |");
		private JMenu credit=new JMenu("�������  |");
		private JMenu invest=new JMenu("Ͷ�ʼ���  |");
		private JMenu music =new JMenu("  ����    |");
		private JMenu exit  =new JMenu("  �˳�    |");
		private JMenuItem on = new JMenuItem("��"); 
		private JMenuItem off = new JMenuItem("��");

		public Loading()
		{
			setTitle("���Ͷ�ʴ��������(־��)");

			MyPanel mp=new MyPanel();						//ͼƬ�����
			menu.add(deposit);
			menu.add(credit);
			menu.add(invest);
			music.add(on);
			music.add(off);
			menu.add(music);
			menu.add(exit);
			
			
			
			//���ͼƬ��嵽��������
			add(mp);                           
			setJMenuBar(menu);
			menulistenermethod();  //���ü�����

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //��������
			
			

			centerX=Toolkit.getDefaultToolkit().getScreenSize().width;				
			centerY=Toolkit.getDefaultToolkit().getScreenSize().height;
	
			//x�����������X���ϵ���� y�����������Y���ϵ���� width������ĳ��� height������Ŀ��
			setBounds(centerX/4, centerY/5, centerX/2,centerY/2 );
			setResizable(false);          //�ı䴰��
			setVisible(true);			
		
		}

		public void menulistenermethod() // ����¼�����Ϊ�����˵�������¼���Ӧ����
		{

			deposit.addMouseListener(new MouseAdapter() {//������
				public void mousePressed(MouseEvent e) {

					new Fuli();

				}
			});
			credit.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e)// mousePressed�Ǵ����������ʱ�������¼�
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
			
			//д��һ���������Ĺ��췽��.���������������û�в����������Ҳ��ʵ����,����յĹ��췽���������䣬Java�ڲ����е��ã�һ�㶼ͨ������ʵ�֣�
			public MyPanel(){}
			protected void paintComponent(Graphics g)	//��д�滭�������
			{
				//����java.net.URL�� ����һ�����Ķ���imgURL  
				//�����������ָ��JButtonApp.class.getResource(path) Ҳ����imgURL  ��ֵ����JButtonApp.class.getResource(path)
				java.net.URL imgURL =getClass().getResource("aaa.jpg");
				ImageIcon icon =new ImageIcon(imgURL);		
				
				//��������x,y��ͼƬ��Ⱥ͸߶ȣ�ת��ͼ��Ҫ֪ͨ�Ķ���
				g.drawImage(icon.getImage(),0,0,getSize().width,getSize().height,this);
				
			}
		}
		
		
		public static void main(String[] args) {

			new Loading();
			
		}
}



