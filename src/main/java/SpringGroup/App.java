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
    	//MusicPlayer mp2=context.getBean("musicPlayer",MusicPlayer.class);
    	mp.playMusic();
    	mp.getListMusic();
    	//System.out.println(mp==mp2);
    	//System.out.println(mp);
    	//System.out.println(mp2);
        //System.out.println(tb.getSong());
        
        context.close();
        
        /*
         * ƒз сделать бин прототип и убедитьс€ что не вызываетс€ дестрой метод
         * */
        
    }
}
