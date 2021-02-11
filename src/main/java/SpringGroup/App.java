package SpringGroup;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
    		"appContext.xml"
    	);
    	
    	//Music mb=context.getBean("musicBean",Music.class);
    	
    	//ручное внедрение зависимости
    	//MusicPlayer mp=new MusicPlayer(mb);
    	MusicPlayer mp=context.getBean("musicPlayer",MusicPlayer.class);
    	mp.playMusic();
    	
        //System.out.println(tb.getSong());
        
        context.close();
        
        /*
         * упражнение на следующий урок
         * https://youtu.be/dBxRmUH3Af8?list=PLAma_mKffTOR5o0WNHnY0mTjKxnCgSXrZ&t=1076
         * */
        
    }
}
