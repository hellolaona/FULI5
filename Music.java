package Fuli;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.URL;

import javax.swing.JFrame;


public class Music {
	private URL url;
	public AudioClip ac;

	boolean isplay=true;

	public Music() {
		if (isplay == true) {
			
			File f1 = new File("D:/eclipse/ch2/�����֪��.mid");
			try {
				url = f1.toURL();//File.toURL ������ ת��ΪURL��ʽ. 
			} catch (Exception e) {
				e.printStackTrace();
			}
			ac = Applet.newAudioClip(url);    //�Ӹ�����URL����ȡ��Ƶ����
			ac.play();
			ac.loop(); // ѭ����������
		}
		else if (isplay == false) {
			ac.stop();
		}

	}
}
