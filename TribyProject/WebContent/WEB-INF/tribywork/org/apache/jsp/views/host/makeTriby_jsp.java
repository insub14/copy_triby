/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.45
 * Generated at: 2019-10-16 06:18:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.host;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.triby.host.model.vo.Host;

public final class makeTriby_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/host/header.jsp", Long.valueOf(1570963706000L));
    _jspx_dependants.put("/views/host/aside.jsp", Long.valueOf(1570791286000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.triby.host.model.vo.Host");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("    \r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.12/summernote-bs4.css\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("\t#wrap{\r\n");
      out.write("\t\tfloat:left;\r\n");
      out.write("\t\tmargin: 1%;\r\n");
      out.write("\t\tfont-family: 'Noto Sans KR', sans-serif;\r\n");
      out.write("\t\twidth:80%;\r\n");
      out.write("\t}\r\n");
      out.write("\t#title{font-size:18px; font-weight:bold; margin-bottom:1rem;}\r\n");
      out.write("\t#content{width:100%; height:77vh; margin: 0; padding:1rem 1rem 0 1rem; overflow-y: auto;}\r\n");
      out.write("\t#editor{height:60vh; background:white; width:100%;}\r\n");
      out.write("\t.btn{margin-top:5px;}\r\n");
      out.write("\t#plus{width:100%; height:570px;}\r\n");
      out.write("\t#contentImgArea1, #contentImgArea2, #contentImgArea3{\r\n");
      out.write("\t\twidth:240px;\r\n");
      out.write("\t\theight:120px;\r\n");
      out.write("\t\tbackground-image:url('resources/images/host/common/plus.png');\r\n");
      out.write("\t\tbackground-size: 50px 50px;\r\n");
      out.write("\t\tbackground-repeat: no-repeat;\r\n");
      out.write("\t\tbackground-position: center;\r\n");
      out.write("\t}\r\n");
      out.write("\ttable div{\r\n");
      out.write("\t\ttext-align:center;\r\n");
      out.write("\t\tdisplay:table-cell;\r\n");
      out.write("\t\tvertical-align:center;\r\n");
      out.write("\t}\r\n");
      out.write("\t#contentImgArea1:hover, #contentImgArea2:hover, #contentImgArea3:hover, .btn:hover, .cate:hover{cursor:pointer;}\r\n");
      out.write("\ttable tr td{text-align:center;}\r\n");
      out.write("\t#summernote{resize:none; width:100%; height:100%;}\r\n");
      out.write("\t.cate{width:70px; color:black; height:30px; line-height:30px;}\r\n");
      out.write("\t.btn{margin-bottom:10px;}\r\n");
      out.write("\t//table tr:nth-child(6), table tr:nth-child(7), table tr:nth-child(8), table tr:nth-child(6) td{border: 1px solid;}\r\n");
      out.write("\ttable{width:70%;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');
 String contextPath = request.getContextPath(); 
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\tbody{height:100%; overflow:auto;}\r\n");
      out.write("\t#aside{\r\n");
      out.write("\t\twidth:18%;\r\n");
      out.write("\t\theight:100vh;\r\n");
      out.write("\t\tfloat:left;\r\n");
      out.write("\t\tfont-family: 'Noto Sans KR', sans-serif;\r\n");
      out.write("\t}\r\n");
      out.write("\t#triby-manage, #member-manage{\r\n");
      out.write("\t\twidth:100%;\r\n");
      out.write("\t}\r\n");
      out.write("\t.none-bullet{list-style-type: none;}\r\n");
      out.write("\tli{margin-top:10px;}\r\n");
      out.write("\tli a{\r\n");
      out.write("\t\ttext-decoration:none;\r\n");
      out.write("\t\tcolor:black;\r\n");
      out.write("\t}\r\n");
      out.write("\tli a:hover{\r\n");
      out.write("\t\ttext-decoration:underline;\r\n");
      out.write("\t\tcolor:black;\r\n");
      out.write("\t\tcursor:pointer;\r\n");
      out.write("\t}\r\n");
      out.write("\t#list-header{font-size:18px;}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header\">");
      out.write('\r');
      out.write('\n');
 
	Host loginHost = (Host) session.getAttribute("loginHost");
	String joinSuccessMsg = (String)request.getAttribute("joinSuccessMsg");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/bootstrap.min.css\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Noto+Sans+KR&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script src=\"resources/js/popper.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/bootstrap.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\tvar joinSuccessMsg = \"");
      out.print(joinSuccessMsg);
      out.write("\"\r\n");
      out.write("$(function(){\r\n");
      out.write("\tif(joinSuccessMsg!=\"null\"){\r\n");
      out.write("\talert(joinSuccessMsg);\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t})\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("\thtml, body{height:100%; overflow:hidden;}\r\n");
      out.write("\t#wrapper{\r\n");
      out.write("    height: 10%;\r\n");
      out.write("    overflow:hidden;\r\n");
      out.write("    font-family: 'Noto Sans KR', sans-serif;\r\n");
      out.write("\t} \r\n");
      out.write("\t#logo-wrap{\r\n");
      out.write("\t\twidth:15%;\r\n");
      out.write("\t}\r\n");
      out.write("\t#logo{\r\n");
      out.write("\t\tmargin-left: auto;\r\n");
      out.write("\t\tmargin-right:auto;\r\n");
      out.write("\t\twidth:150px;\r\n");
      out.write("\t\theight:60px;\r\n");
      out.write("\t\tcolor:white;\r\n");
      out.write("\t\ttext-align:center;\r\n");
      out.write("\t}\r\n");
      out.write("\tlabel{\r\n");
      out.write("\t\tmargin-left:1%;\r\n");
      out.write("\t\tcolor:white;\r\n");
      out.write("\t\twidth:50%;\r\n");
      out.write("\t\tline-height: 50px;\r\n");
      out.write("\t\tmargin-top: auto;\r\n");
      out.write("\t\tmargin-bottom: auto;\r\n");
      out.write("\t}\r\n");
      out.write("\t#lb2{\r\n");
      out.write("\t\twidth:27%;\r\n");
      out.write("\t\tcolor:white;\r\n");
      out.write("\t\ttext-align:right;\r\n");
      out.write("\t\tline-height: 50px;\r\n");
      out.write("\t\tmargin-right:1%;\r\n");
      out.write("\t}\r\n");
      out.write("\t#logout{\r\n");
      out.write("\t\tmargin-left:2%;\r\n");
      out.write("\t}\r\n");
      out.write("\t#logo:hover{cursor:pointer;}\r\n");
      out.write("</style>\r\n");
      out.write("<title>관리자 페이지</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("<div id=\"header\" class=\"navbar navbar-expand-lg navbar-dark bg-primary\">\r\n");
      out.write("  <div id=\"logo-wrap\"><div id=\"logo\" onclick=\"goIndex();\"><img src=\"resources/images/triby5.png\"></div></div>\r\n");
      out.write("  <label>호스트 관리페이지</label>\r\n");
      out.write("   <div id=\"lb2\">");
      out.print( loginHost.getHost_name() );
      out.write(" 호스트님 반갑습니다!</div>\r\n");
      out.write("  <div id=\"logout\"><a href=\"");
      out.print( request.getContextPath());
      out.write("/logout.ho;\"><img src=\"resources/images/host/common/logout.png\"></a></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction goIndex(){\r\n");
      out.write("\tlocation.href=\"");
      out.print( request.getContextPath());
      out.write("/goIndex.ho\";\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("</div>\r\n");
      out.write("\t<div id=\"aside\" class=\"table-secondary\">\r\n");
      out.write("\t\t<div id=\"triby-manage\">\r\n");
      out.write("  \t\t\t<div id=\"list-header\" class=\"card-header\">트리비 관리</div>\r\n");
      out.write(" \t\t\t <div class=\"card-body\">\r\n");
      out.write(" \t\t\t <ul class=\"none-bullet\">\r\n");
      out.write(" \t\t\t \t<li><a onclick=\"makeTriby();\">트리비 만들기</a></li>\r\n");
      out.write("\t\t\t \t<li><a onclick=\"myTriby();\">마이 트리비</a></li>\r\n");
      out.write("\t\t\t </ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"member-manage\">\r\n");
      out.write("\t\t\t<div id=\"list-header\" class=\"card-header\">멤버 관리</div>\r\n");
      out.write(" \t\t\t <div class=\"card-body\">\r\n");
      out.write(" \t\t\t <ul class=\"none-bullet\">\r\n");
      out.write(" \t\t\t \t<li><a onclick=\"manageQna();\">Q&A 관리</a></li>\r\n");
      out.write("\t\t\t \t<li><a onclick=\"manageRev();\">리뷰 관리</a></li>\r\n");
      out.write("\t\t\t </ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"calculate-manage\">\r\n");
      out.write("\t\t\t<div id=\"list-header\" class=\"card-header\">정산 센터</div>\r\n");
      out.write(" \t\t\t <div class=\"card-body\">\r\n");
      out.write(" \t\t\t <ul class=\"none-bullet\">\r\n");
      out.write(" \t\t\t \t<li><a onclick=\"manageCal();\">정산 관리</a></li>\r\n");
      out.write("\t\t\t </ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"manage-center\">\r\n");
      out.write("\t\t\t<div id=\"list-header\" class=\"card-header\">지원 센터</div>\r\n");
      out.write(" \t\t\t <div class=\"card-body\">\r\n");
      out.write(" \t\t\t <ul class=\"none-bullet\">\r\n");
      out.write(" \t\t\t \t<li><a onclick=\"goNotice();\">공지사항</a></li>\r\n");
      out.write("\t\t\t </ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction makeTriby(){\r\n");
      out.write("\t\t\tlocation.href=\"");
      out.print( contextPath);
      out.write("/makeTriby.ho\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction myTriby(){\r\n");
      out.write("\t\t\t//location.href=\"");
      out.print( contextPath);
      out.write("/myTriby.ho?hno=\" + ");
      out.print( loginHost.getHost_no() );
      out.write(";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar form = document.createElement(\"form\");      // form생성\r\n");
      out.write("\r\n");
      out.write("\t\t\tform.setAttribute(\"method\", \"post\");                    // method 설정\r\n");
      out.write("\t\t\tform.setAttribute(\"action\", \"");
      out.print( contextPath );
      out.write("/myTriby.ho\");       // action 설정\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tdocument.body.appendChild(form);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar input_id = document.createElement(\"input\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tinput_id.setAttribute(\"type\", \"hidden\");\r\n");
      out.write("\r\n");
      out.write("\t\t\tinput_id.setAttribute(\"name\", \"hNo\");      //name 속성 지정\r\n");
      out.write("\t\t\tinput_id.setAttribute(\"value\", ");
      out.print( loginHost.getHost_no() );
      out.write(");        //value 값 설정\r\n");
      out.write("\r\n");
      out.write("\t\t\tform.appendChild(input_id);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar input_id2 = document.createElement(\"input\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tinput_id2.setAttribute(\"type\", \"hidden\");\r\n");
      out.write("\r\n");
      out.write("\t\t\tinput_id2.setAttribute(\"name\", \"status\");      //name 속성 지정\r\n");
      out.write("\t\t\tinput_id2.setAttribute(\"value\", 0);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tform.appendChild(input_id2);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar input_id3 = document.createElement(\"input\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tinput_id3.setAttribute(\"type\", \"hidden\");\r\n");
      out.write("\r\n");
      out.write("\t\t\tinput_id3.setAttribute(\"name\", \"page\");      //name 속성 지정\r\n");
      out.write("\t\t\tinput_id3.setAttribute(\"value\", 1);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tform.appendChild(input_id3);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tform.submit();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction manageQna(){\r\n");
      out.write("\t\t\t//location.href=\"");
      out.print( contextPath);
      out.write("/manageQna.ho\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar form = document.createElement(\"form\");      // form생성\r\n");
      out.write("\r\n");
      out.write("\t\t\tform.setAttribute(\"method\", \"post\");                    // method 설정\r\n");
      out.write("\t\t\tform.setAttribute(\"action\", \"");
      out.print( contextPath );
      out.write("/manageQna.ho\");       // action 설정\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\tdocument.body.appendChild(form);\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\tvar input_id = document.createElement(\"input\");\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\tinput_id.setAttribute(\"type\", \"hidden\");\r\n");
      out.write("\r\n");
      out.write("\t\t\tinput_id.setAttribute(\"name\", \"hNo\");      //name 속성 지정\r\n");
      out.write("\t\t\tinput_id.setAttribute(\"value\", ");
      out.print( loginHost.getHost_no() );
      out.write(");        //value 값 설정\r\n");
      out.write("\r\n");
      out.write("\t\t\tform.appendChild(input_id);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar input_id2 = document.createElement(\"input\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tinput_id2.setAttribute(\"type\", \"hidden\");\r\n");
      out.write("\r\n");
      out.write("\t\t\tinput_id2.setAttribute(\"name\", \"status\");      //name 속성 지정\r\n");
      out.write("\t\t\tinput_id2.setAttribute(\"value\", 0);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tform.appendChild(input_id2);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar input_id3 = document.createElement(\"input\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tinput_id3.setAttribute(\"type\", \"hidden\");\r\n");
      out.write("\r\n");
      out.write("\t\t\tinput_id3.setAttribute(\"name\", \"page\");      //name 속성 지정\r\n");
      out.write("\t\t\tinput_id3.setAttribute(\"value\", 1);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tform.appendChild(input_id3);\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\tform.submit();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction manageRev(){\r\n");
      out.write("\t\t\t//location.href=\"");
      out.print( contextPath);
      out.write("/manageRev.ho\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar form = document.createElement(\"form\");      // form생성\r\n");
      out.write("\r\n");
      out.write("\t\t\tform.setAttribute(\"method\", \"post\");                    // method 설정\r\n");
      out.write("\t\t\tform.setAttribute(\"action\", \"");
      out.print( contextPath );
      out.write("/manageRev.ho\");       // action 설정\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\tdocument.body.appendChild(form);\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\tvar input_id = document.createElement(\"input\");\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\tinput_id.setAttribute(\"type\", \"hidden\");\r\n");
      out.write("\r\n");
      out.write("\t\t\tinput_id.setAttribute(\"name\", \"hNo\");      //name 속성 지정\r\n");
      out.write("\t\t\tinput_id.setAttribute(\"value\", ");
      out.print( loginHost.getHost_no() );
      out.write(");        //value 값 설정\r\n");
      out.write("\r\n");
      out.write("\t\t\tform.appendChild(input_id);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar input_id2 = document.createElement(\"input\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tinput_id2.setAttribute(\"type\", \"hidden\");\r\n");
      out.write("\r\n");
      out.write("\t\t\tinput_id2.setAttribute(\"name\", \"page\");      //name 속성 지정\r\n");
      out.write("\t\t\tinput_id2.setAttribute(\"value\", 1);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tform.appendChild(input_id2);\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\tform.submit();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction manageCal(){\r\n");
      out.write("\t\t\tlocation.href=\"");
      out.print( contextPath);
      out.write("/manageCal.ho\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction goNotice(){\r\n");
      out.write("\t\t\tlocation.href=\"");
      out.print( contextPath);
      out.write("/listh.no\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.12/summernote-bs4.js\"></script>\r\n");
      out.write("    <script src=\"lang/summernote-ko-KR.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"wrap\">\r\n");
      out.write("\t<div id=\"title\">트리비 만들기</div>\r\n");
      out.write("\t<div id=\"content\" class=\"jumbotron\">\r\n");
      out.write("\t\t<form method=\"post\" action=\"");
      out.print( contextPath);
      out.write("/insert.tr\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"loginHostno\" value=\"");
      out.print( loginHost.getHost_no() );
      out.write("\">\r\n");
      out.write("\t\t<div><input class=\"form-control form-control-lg\" type=\"text\" name=\"title\" placeholder=\"트리비 제목을 입력하세요\" id=\"inputLarge\" required></div><br>\r\n");
      out.write("\t\t<div id=\"editor\">\r\n");
      out.write("\t\t\t<textarea id=\"summernote\" name=\"tribyContent\" required>Try new Hobby!</textarea>\r\n");
      out.write("\t\t</div> <br>\r\n");
      out.write("\t\t<div id=\"plus\">\r\n");
      out.write("\t\t<table align=\"center\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"100px\">썸네일 이미지</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"contentImgArea1\">\r\n");
      out.write("\t\t\t\t\t\t\t<img id=\"contentImg1\" width=\"240\" height=\"120\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"50px\">포함 사항</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"3\"><input type=\"text\" class=\"form-control\" name=\"content1\" required></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"50px\">세부 일정</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"3\"><input type=\"text\" class=\"form-control\" name=\"content2\" required></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"50px\">준비물</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"3\"><input type=\"text\" class=\"form-control\" name=\"content3\" required></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"50px\">진행 장소</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"3\"><input type=\"text\" class=\"form-control\" name=\"address\" required></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"50px\">가격</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"3\"><input type=\"number\" id=\"price\" name=\"price\" min=\"0\" value=\"0\" step=\"10000\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td rowspan=\"3\">카테고리<br>\r\n");
      out.write("\t\t\t\t(필수 선택 3)\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>액티비티</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"ac1\" name=\"category\" value=\"AC1\">\r\n");
      out.write("\t\t\t\t<label for=\"ac1\" class=\"cate\">아웃도어</label>\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"ac8\" name=\"category\" value=\"AC8\">\r\n");
      out.write("\t\t\t\t<label for=\"ac8\" class=\"cate\">실내체험</label>\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"ac2\" name=\"category\" value=\"AC2\">\r\n");
      out.write("\t\t\t\t<label for=\"ac2\" class=\"cate\">워터파크</label>\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"ac3\" name=\"category\" value=\"AC3\">\r\n");
      out.write("\t\t\t\t<label for=\"ac3\" class=\"cate\">수상레저</label> <br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"ac4\" name=\"category\" value=\"AC4\">\r\n");
      out.write("\t\t\t\t<label for=\"ac4\" class=\"cate\">투어</label>\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"ac5\" name=\"category\" value=\"AC5\">\r\n");
      out.write("\t\t\t\t<label for=\"ac5\" class=\"cate\">축제</label>\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"ac6\" name=\"category\" value=\"AC6\">\r\n");
      out.write("\t\t\t\t<label for=\"ac6\" class=\"cate\">공연</label>\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"ac7\" name=\"category\" value=\"AC7\">\r\n");
      out.write("\t\t\t\t<label for=\"ac7\" class=\"cate\">전시</label>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>스터디</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"st1\" name=\"category\" value=\"ST1\">\r\n");
      out.write("\t\t\t\t<label for=\"st1\" class=\"cate\">스포츠</label>\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"st2\" name=\"category\" value=\"ST2\">\r\n");
      out.write("\t\t\t\t<label for=\"st2\" class=\"cate\">음악</label>\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"st3\" name=\"category\" value=\"ST3\">\r\n");
      out.write("\t\t\t\t<label for=\"st3\" class=\"cate\">미술</label>\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"st4\" name=\"category\" value=\"ST4\">\r\n");
      out.write("\t\t\t\t<label for=\"st4\" class=\"cate\">공예</label>\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"st10\" name=\"category\" value=\"ST10\">\r\n");
      out.write("\t\t\t\t<label for=\"st10\" class=\"cate\">독서</label><br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"st5\" name=\"category\" value=\"ST5\">\r\n");
      out.write("\t\t\t\t<label for=\"st5\" class=\"cate\">요리</label>\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"st6\" name=\"category\" value=\"ST6\">\r\n");
      out.write("\t\t\t\t<label for=\"st6\" class=\"cate\">음료</label>\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"st7\" name=\"category\" value=\"ST7\">\r\n");
      out.write("\t\t\t\t<label for=\"st7\" class=\"cate\">영상</label>\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"st8\" name=\"category\" value=\"ST8\">\r\n");
      out.write("\t\t\t\t<label for=\"st8\" class=\"cate\">사진</label>\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"st9\" name=\"category\" value=\"ST9\">\r\n");
      out.write("\t\t\t\t<label for=\"st9\" class=\"cate\">외국어</label>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>헬스·뷰티</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"hb1\" name=\"category\" value=\"HB1\">\r\n");
      out.write("\t\t\t\t<label for=\"hb1\" class=\"cate\">피트니스</label>\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"hb2\" name=\"category\" value=\"HB2\">\r\n");
      out.write("\t\t\t\t<label for=\"hb2\" class=\"cate\">요가</label>\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"hb3\" name=\"category\" value=\"HB3\">\r\n");
      out.write("\t\t\t\t<label for=\"hb3\" class=\"cate\">필라테스</label><br>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"hb4\" name=\"category\" value=\"HB4\">\r\n");
      out.write("\t\t\t\t<label for=\"hb4\" class=\"cate\">스파</label>\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"hb5\" name=\"category\" value=\"HB5\">\r\n");
      out.write("\t\t\t\t<label for=\"hb5\" class=\"cate\">심리</label>\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" id=\"hb6\" name=\"category\" value=\"HB6\">\r\n");
      out.write("\t\t\t\t<label for=\"hb6\" class=\"cate\">상담</label>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"fileArea\">\r\n");
      out.write("\t\t\t\t<input type=\"file\" id=\"thumbnailImg1\" name=\"thumbnailImg1\" onchange=\"loadImg(this, 1);\">\r\n");
      out.write("\t\t\t\t<input type=\"file\" id=\"thumbnailImg2\" name=\"thumbnailImg2\" onchange=\"loadImg(this, 2);\">\r\n");
      out.write("\t\t\t\t<input type=\"file\" id=\"thumbnailImg3\" name=\"thumbnailImg3\" onchange=\"loadImg(this, 3);\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t<button id=\"complete\" type=\"submit\" class=\"btn btn-info\" disabled>저장</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("<script>\r\n");
      out.write("\t\t// 각 div 클릭할 때 파일 첨부 창이 뜨도록\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\t$(\"#fileArea\").hide();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#contentImgArea1\").click(function(){\r\n");
      out.write("\t\t\t\t$(\"#thumbnailImg1\").click();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(\"#contentImgArea2\").click(function(){\r\n");
      out.write("\t\t\t\t$(\"#thumbnailImg2\").click();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(\"#contentImgArea3\").click(function(){\r\n");
      out.write("\t\t\t\t$(\"#thumbnailImg3\").click();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction loadImg(value, num){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\tif(value.files && value.files[0]){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar reader = new FileReader();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\treader.onload = function(e){\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tswitch(num){\r\n");
      out.write("\t\t\t\t\tcase 1: $(\"#contentImg1\").attr(\"src\", e.target.result);\r\n");
      out.write("\t\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t\tcase 2: $(\"#contentImg2\").attr(\"src\", e.target.result);\r\n");
      out.write("\t\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t\tcase 3:  $(\"#contentImg3\").attr(\"src\", e.target.result);\r\n");
      out.write("\t\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\treader.readAsDataURL(value.files[0]);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"input[name^=cate]:checkbox\").change(function() {\r\n");
      out.write("\t\t\t\tvar limit = 3;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tif(limit==$(\"input[name^=cate]:checkbox:checked\").length) {\r\n");
      out.write("\t\t            $(\":checkbox:not(:checked)\").attr(\"disabled\", \"disabled\");\r\n");
      out.write("\t\t            $(\"#complete\").removeAttr(\"disabled\");\r\n");
      out.write("\t\t        } else {\r\n");
      out.write("\t\t            $(\"input[name^=cate]:checkbox\").removeAttr(\"disabled\");\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t    });\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\t $('#summernote').summernote({\r\n");
      out.write("\t\t\t        placeholder: 'Try new hobby',\r\n");
      out.write("\t\t\t        tabsize: 2,\r\n");
      out.write("\t\t\t        height: 370,\r\n");
      out.write("\t\t\t        lang: 'ko-KR'\r\n");
      out.write("\t\t\t      });\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
