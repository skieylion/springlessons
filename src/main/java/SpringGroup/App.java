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
    	
    	TestBean tb=context.getBean("testBean",TestBean.class);
    	
        System.out.println(tb.getName());
        
        context.close();
    }
}
