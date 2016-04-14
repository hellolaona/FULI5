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
			
			File f1 = new File("D:/eclipse/ch2/如果云知道.mid");
			try {
				url = f1.toURL();//File.toURL 方法是 转换为URL格式. 
			} catch (Exception e) {
				e.printStackTrace();
			}
			ac = Applet.newAudioClip(url);    //从给定的URL处获取音频剪辑
			ac.play();
			ac.loop(); // 循环播放音乐
		}
		else if (isplay == false) {
			ac.stop();
		}

	}
}
