package tags;

import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author VINIT
 */

public class MyTagHandler extends  TagSupport
{

        @Override
        public int doStartTag() throws JspException {
  
                try 
                {
                        //Task... tag
                        JspWriter out = pageContext.getOut();
                        
                        out.println("<h1>This is my custom tag</h1>");
                        out.println("<h1>This is custom paragraph</h1>");
                        
                        out.println(new Date().toString());
                        
                }
                catch (Exception e) 
                {
                        e.printStackTrace();
                }
                
                
                
                return SKIP_BODY;
       
        }
 
        
}