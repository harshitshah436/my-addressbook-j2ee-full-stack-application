package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;


public class SearchDetail$jsp extends HttpJspBase {


    static {
    }
    public SearchDetail$jsp( ) {
    }

    private static boolean _jspx_inited = false;

    public final void _jspx_init() throws org.apache.jasper.runtime.JspException {
    }

    public void _jspService(HttpServletRequest request, HttpServletResponse  response)
        throws java.io.IOException, ServletException {

        JspFactory _jspxFactory = null;
        PageContext pageContext = null;
        HttpSession session = null;
        ServletContext application = null;
        ServletConfig config = null;
        JspWriter out = null;
        Object page = this;
        String  _value = null;
        try {

            if (_jspx_inited == false) {
                synchronized (this) {
                    if (_jspx_inited == false) {
                        _jspx_init();
                        _jspx_inited = true;
                    }
                }
            }
            _jspxFactory = JspFactory.getDefaultFactory();
            response.setContentType("text/html;ISO-8859-1");
            pageContext = _jspxFactory.getPageContext(this, request, response,
            			"", true, 8192, true);

            application = pageContext.getServletContext();
            config = pageContext.getServletConfig();
            session = pageContext.getSession();
            out = pageContext.getOut();

            // HTML // begin [file="/SearchDetail.jsp";from=(0,0);to=(36,13)]
                out.write("<html xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\" xmlns=\"http://www.w3.org/TR/REC-html40\">\r\n<head>\r\n\r\n<title>My Address Book---Search Details</title>\r\n\r\n<script>\r\n\r\nfunction form_validator()\r\n{\r\n\r\n  \tif(theForm.search.value == \"\") {\r\n\t\t alert(\"Please Enter Name To Search!\");\r\n\t\t theForm.search.focus();\r\n\t\t return(false);\r\n\t}\r\n}\r\n</script>\r\n</head>\r\n<BODY bgcolor=\"#ffffff\" bgproperties=\"fixed\" background=\"images/pusar.GIF\">\r\n\r\n<BLOCKQUOTE dir=ltr style=\"MARGIN-RIGHT: 0px\">\r\n\r\n<P align=center></P>\r\n\r\n<P align=center></P>\r\n\r\n<P align=center></P>\r\n\r\n<P align=center><strong><font face=\"Verdana\" color=\"#800000\">\r\n\r\n\r\n\r\n\r\n\r\n<form onsubmit=\"form_validator()\" name=\"theForm\" action=\"searchserver\">\r\n            <!--<input type=\"hidden\" value=\"0\" name=\"flag\">-->\r\n             ");

            // end
            // begin [file="/SearchDetail.jsp";from=(36,15);to=(48,12)]
                
                //    	String name=(String)session.getAttribute("u");
                //	String add=(String)session.getAttribute("uu");
                //    	out.println("this is Search Result page"+name +add );>
                  	String name=(String)session.getAttribute("username");
                
                              if(name==null){
                          response.sendRedirect("SessionExpire.jsp");
                        }
                
                	Object data=session.getAttribute("info");
                        out.println("This is data"+data);
                            
            // end
            // HTML // begin [file="/SearchDetail.jsp";from=(48,14);to=(191,7)]
                out.write("\r\n\r\n</font></strong></P>\r\n\r\n\r\n<div style=\"position:absolute; top:197; left:306; z-index:2; width:666; height:163\">\r\n  <i><font color=\"#99CCCC\" face=\"Monotype Corsiva\" size=\"5\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Please Enter Name /ID of\r\n  Person&nbsp;To View Details </font></i>\r\n  <p>&nbsp;<br>\r\n  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n  <input type=\"text\" style=\"background-color:#99CCCC\" size=\"28\" name=\"search\" style=\"color:green\"><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n    <input type=\"submit\" value=\"  Search  \" style=\"background-color:#EFEFEF\"> </div>\r\n\r\n<p>&nbsp;</p>\r\n<table cellSpacing=\"0\" cellPadding=\"0\" width=\"770\" align=\"center\" border=\"0\">\r\n  <tr>\r\n    <td>\r\n    <table cellSpacing=\"0\" cellPadding=\"2\" width=\"100%\" bgColor=\"#99cccc\" border=\"0\">\r\n      <tr>\r\n        <td vAlign=\"top\">&nbsp;<table cellSpacing=\"0\" cellPadding=\"0\" width=\"100%\" bgColor=\"#ffffff\" border=\"0\">\r\n          <tr>\r\n            <td noWrap width=\"1%\" height=\"1%\">\r\n            <img height=\"30\" src=\"blue_top.gif\" width=\"583\"></td>\r\n          </tr>\r\n        </table>\r\n        <table height=\"100%\" cellSpacing=\"0\" cellPadding=\"6\" width=\"100%\" bgColor=\"#ffffff\" border=\"0\">\r\n          <tr>\r\n            <td>\r\n\r\n            <p align=\"center\">&nbsp;</p>\r\n            <font face=\"VERDANA\" color=\"blue\" size=\"1\"><b>\r\n            <font face=\"verdana\" color=\"blue\" size=\"1\"><font color=\"blue\">\r\n            <table cellSpacing=\"0\" cellPadding=\"0\" width=\"152\" border=\"0\" height=\"45\">\r\n              <tr>\r\n            <font color=\"blue\" face=\"verdana\" size=\"1\">\r\n                <td height=\"34\" width=\"161\">\r\n                <img border=\"0\" src=\"new.GIF\" width=\"154\" height=\"34\"></td>\r\n              </font>\r\n              </tr>\r\n              <tr>\r\n            <font color=\"blue\" face=\"verdana\" size=\"1\">\r\n                <td width=\"161\" background=\"menu_02.gif\" height=\"18\">\r\n                <p align=\"center\"><font color=\"#99CCCC\" face=\"ms sans serif\">&nbsp;</font></font></font><font color=\"#314f6b\"><a style=\"text-decoration: none\" href=\"usermain.jsp\"><font color=\"#99CCCC\" face=\"Verdana\">HOME</font></a></font></td>\r\n              </font>\r\n              </tr>\r\n              <tr>\r\n            <font face=\"VERDANA\" color=\"blue\" size=\"1\">\r\n            <font color=\"blue\" face=\"verdana\" size=\"1\">\r\n                <td width=\"161\" background=\"menu_02.gif\" height=\"19\">&nbsp;</td>\r\n              </font>\r\n              </tr>\r\n              <tr>\r\n            <font face=\"VERDANA\" color=\"blue\" size=\"1\">\r\n                <font face=\"VERDANA\" size=\"1\" color=\"#99CCCC\">\r\n                <td width=\"161\" background=\"menu_02.gif\" height=\"1\"></font>\r\n            </font></font>\r\n            <font face=\"VERDANA\" color=\"blue\">\r\n                <p align=\"center\">\r\n                <font face=\"MS Sans Serif\" color=\"#99CCCC\">&nbsp;&nbsp;&nbsp;</font></font></font><font face=\"VERDANA\" color=\"blue\"><font face=\"VERDANA\" color=\"#99CCCC\"><a href=\"EnterDetail.jsp\" style=\"text-decoration: none\"><font color=\"#99CCCC\">ADD\r\n                CONTACT</font></a></font></p>\r\n                </font>\r\n                <font face=\"VERDANA\" color=\"#99CCCC\" size=\"1\">\r\n                <p>\r\n                </td>\r\n              </tr>\r\n              <tr>\r\n            <font face=\"VERDANA\" color=\"blue\" size=\"1\">\r\n            <font face=\"VERDANA\" color=\"blue\" size=\"1\">\r\n            <font color=\"blue\" face=\"verdana\" size=\"1\">\r\n                <td width=\"161\" background=\"menu_02.gif\" height=\"18\">\r\n                <p align=\"center\"><font color=\"#99CCCC\" face=\"ms sans serif\">&nbsp;</font></font></font></font></font></font><font color=\"blue\"><a style=\"text-decoration: none\" href=\"SearchDetail.jsp\"><font color=\"#99CCCC\" face=\"Verdana\">SEARCH\r\n                CONTACT</font></a></td>\r\n              </font>\r\n              </tr>\r\n              <tr>\r\n            <font face=\"VERDANA\" color=\"blue\" size=\"1\">\r\n            <font face=\"VERDANA\" color=\"blue\" size=\"1\">\r\n            <font face=\"VERDANA\" color=\"blue\" size=\"1\">\r\n            <font color=\"blue\" face=\"verdana\" size=\"1\">\r\n                <td width=\"161\" background=\"menu_02.gif\" height=\"19\">&nbsp;</td>\r\n              </font>\r\n              </font>\r\n              </tr>\r\n              <tr>\r\n            <font face=\"VERDANA\" color=\"blue\" size=\"1\">\r\n            <font face=\"VERDANA\" color=\"blue\" size=\"1\">\r\n            <font face=\"VERDANA\" color=\"blue\" size=\"1\">\r\n            <font color=\"blue\" face=\"verdana\">\r\n                <td width=\"161\" background=\"menu_02.gif\" height=\"18\">\r\n                <p align=\"center\"><font color=\"#99CCCC\" face=\"ms sans serif\">&nbsp;</font></font></font><font color=\"#99CCCC\"><a style=\"text-decoration: none\" href=\"Default.jsp\"><font color=\"#99CCCC\" face=\"Verdana\">SIGN\r\n                OUT</font></a></td>\r\n            </font>\r\n              </tr>\r\n              <tr>\r\n            <font face=\"VERDANA\" color=\"blue\" size=\"1\">\r\n            <font face=\"VERDANA\" color=\"blue\" size=\"1\">\r\n            <font face=\"VERDANA\" color=\"blue\" size=\"1\">\r\n            <font color=\"blue\" face=\"verdana\" size=\"1\">\r\n                <td width=\"161\" background=\"menu_02.gif\" height=\"19\">&nbsp;</td>\r\n              </font>\r\n              </tr>\r\n              <tr>\r\n            <font face=\"VERDANA\" color=\"blue\" size=\"1\">\r\n            <font face=\"VERDANA\" color=\"blue\" size=\"1\">\r\n            <font face=\"VERDANA\" color=\"blue\" size=\"1\">\r\n                <font face=\"VERDANA\" size=\"1\" color=\"#99CCCC\">\r\n                <td height=\"33\" width=\"161\">\r\n            <b>\r\n                <font face=\"VERDANA\" color=\"blue\" size=\"1\">\r\n                <img border=\"0\" src=\"newnew.GIF\" width=\"156\" height=\"33\"></font></b><p>&nbsp;</p>\r\n                <p>&nbsp;</p>\r\n                <p>&nbsp;</p>\r\n                <p></td>\r\n            </font>\r\n              </tr>\r\n            <font face=\"VERDANA\" color=\"blue\" size=\"1\">\r\n            <font face=\"verdana\" color=\"blue\" size=\"1\">\r\n              </font>\r\n              </font>\r\n            <font face=\"VERDANA\" color=\"blue\" size=\"1\"><font face=\"VERDANA\" size=\"1\" color=\"#99CCCC\">\r\n              </font><font face=\"VERDANA\" size=\"1\" color=\"#99CCCC\">\r\n              </table>\r\n            </font></font></b>\r\n            <p align=\"center\">&nbsp;</td>\r\n          </tr>\r\n        </table>\r\n        <table height=\"100%\" cellSpacing=\"0\" cellPadding=\"0\" width=\"100%\" bgColor=\"#ffffff\" border=\"0\">\r\n          <tr>\r\n            <td>&nbsp;</td>\r\n          </tr>\r\n        </table>\r\n        </td>\r\n      </tr>\r\n    </table>\r\n    </td>\r\n  </tr>\r\n</table>\r\n<p>&nbsp;</p>\r\n<p>&nbsp;</p>\r\n<p>&nbsp;</p>\r\n</form>\r\n\r\n</BODY>\r\n</HTML>");

            // end

        } catch (Throwable t) {
            if (out != null && out.getBufferSize() != 0)
                out.clearBuffer();
            if (pageContext != null) pageContext.handlePageException(t);
        } finally {
            if (_jspxFactory != null) _jspxFactory.releasePageContext(pageContext);
        }
    }
}
