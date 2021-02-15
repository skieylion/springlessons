package SpringGroup;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(
    		ConfigApp.class
    	);
    	
    	//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
    		//"appContext.xml"
    	//);
    	
    	//Music mb=context.getBean("musicBean",Music.class);
    	
    	//������ ��������� �����������
    	//MusicPlayer mp=new MusicPlayer(mb);
    	MusicPlayer mp=context.getBean("musicPlayer",MusicPlayer.class);
    	//MusicPlayer mp2=context.getBean("musicPlayer",MusicPlayer.class);
    	mp.playMusic(MusicPlayer.KIND.ROCK);
    	//mp.getListMusic();
    	//System.out.println(mp==mp2);
    	//System.out.println(mp);
    	//System.out.println(mp2);
        System.out.println(mp.getVolume());
        
        context.close();
        
        /*
         * 
         * �� �� ��������� ����
         * https://youtu.be/stuAmyyootQ?list=PLAma_mKffTOR5o0WNHnY0mTjKxnCgSXrZ&t=927
         *����� ������ ���
         *https://youtu.be/jH17YkBTpI4?list=PLU2ftbIeotGpAYRP9Iv2KLIwK36-o_qYk
         *
         * */
        
    }
}
