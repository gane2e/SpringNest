/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.96
 * Generated at: 2024-11-25 13:18:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/csss/joindo.css\" rel=\"stylesheet\"/> \r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"doJoin\" method=\"post\" class=\"joinForm\" onsubmit=\"DoJoinForm__submit(this); return false;\">\r\n");
      out.write("                                                                                               \r\n");
      out.write("      <h2>회원가입</h2>\r\n");
      out.write("      <div class=\"textForm\">\r\n");
      out.write("        <input name=\"email\" type=\"email\" class=\"id\" placeholder=\"아이디\">\r\n");
      out.write("        <button type=\"button\" onclick=\"checkEmailDuplication()\">아이디 중복 체크</button> <!-- 중복 체크 버튼 -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"textForm\">\r\n");
      out.write("        <input name=\"password\" type=\"password\" class=\"pw\" placeholder=\"비밀번호\">\r\n");
      out.write("      </div>\r\n");
      out.write("       <div class=\"textForm\">\r\n");
      out.write("        <input name=\"passwordConfirm\" type=\"password\" class=\"pw\" placeholder=\"비밀번호 확인\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"textForm\">\r\n");
      out.write("        <input name=\"name\" type=\"text\" class=\"name\" placeholder=\"이름\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"textForm\">\r\n");
      out.write("            <input name=\"phone\" type=\"text\" class=\"cellphoneNo\" placeholder=\"전화번호\" oninput=\"formatPhoneNumber(this)\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"textForm\">\r\n");
      out.write("        <input name=\"addr\" type=\"text\" class=\"addr\" placeholder=\"주소\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <input type=\"submit\" class=\"btn\" value=\"J O I N\"/>\r\n");
      out.write("    </form>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    // 아이디 중복 체크 함수\r\n");
      out.write("    function checkEmailDuplication() {\r\n");
      out.write("        let email = $(\"input[name='email']\").val();\r\n");
      out.write("        if (email) {\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: \"/user/checkEmail\",  // 이메일 중복 체크를 위한 URL\r\n");
      out.write("                type: \"POST\",\r\n");
      out.write("                data: { email : email },\r\n");
      out.write("                contentType: \"application/x-www-form-urlencoded; charset=UTF-8\",  // 이 부분 추가\r\n");
      out.write("                success: function(response) {\r\n");
      out.write("                    if (response == \"exists\") {\r\n");
      out.write("                        alert(\"이미 존재하는 아이디입니다.\");\r\n");
      out.write("                        $(\"input[name='email']\").val('');  //아이디칸 비움\r\n");
      out.write("                    } else {\r\n");
      out.write("                        alert(\"사용 가능한 아이디입니다.\");\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                error: function(xhr, status, error) {\r\n");
      out.write("                	console.log(\"AJAX error: \" + status + \", \" + error); // 에러 확인\r\n");
      out.write("                    alert(\"아이디 중복 체크 실패\");\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        } else {\r\n");
      out.write("            alert(\"아이디를 입력해주세요.\");\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    // 전화번호 하이픈 자동 포맷 함수\r\n");
      out.write("    function formatPhoneNumber(input) {\r\n");
      out.write("        let phoneNumber = input.value.replace(/[^\\d]/g, ''); // 숫자만 남기고 나머지 문자 제거\r\n");
      out.write("\r\n");
      out.write("        // 전화번호 길이에 따라 하이픈 추가\r\n");
      out.write("        if (phoneNumber.length < 4) {\r\n");
      out.write("            input.value = phoneNumber;\r\n");
      out.write("        } else if (phoneNumber.length < 7) {\r\n");
      out.write("            input.value = phoneNumber.slice(0, 3) + '-' + phoneNumber.slice(3);\r\n");
      out.write("        } else if (phoneNumber.length < 11) {\r\n");
      out.write("            input.value = phoneNumber.slice(0, 3) + '-' + phoneNumber.slice(3, 6) + '-' + phoneNumber.slice(6);\r\n");
      out.write("        } else {\r\n");
      out.write("            input.value = phoneNumber.slice(0, 3) + '-' + phoneNumber.slice(3, 7) + '-' + phoneNumber.slice(7, 11);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
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
