/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.63
 * Generated at: 2022-06-07 13:51:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class withdrawal_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public void setJspContext(javax.servlet.jsp.JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(this, ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public javax.servlet.jsp.JspContext getJspContext() {
    return this.jspContext;
  }

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
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    return _jsp_instancemanager;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
  }

  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException {
    javax.servlet.jsp.PageContext _jspx_page_context = (javax.servlet.jsp.PageContext)jspContext;
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) _jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse) _jspx_page_context.getResponse();
    javax.servlet.http.HttpSession session = _jspx_page_context.getSession();
    javax.servlet.ServletContext application = _jspx_page_context.getServletContext();
    javax.servlet.ServletConfig config = _jspx_page_context.getServletConfig();
    javax.servlet.jsp.JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,jspContext);

    try {
      out.write("\r\n");
      out.write("<!-- 취소해도 작동,,,//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    function del(){    	\r\n");
      out.write("        ans=confirm(\"회원님의 정보는 복구되지않습니다. \\n정말 탈퇴하시겠습니까?\");\r\n");
      out.write("    \r\n");
      out.write("        if(ans==true){\r\n");
      out.write("            document.withdrawal.submit();\r\n");
      out.write("        }\r\n");
      out.write("        else if(ans==false){\r\n");
      out.write("        	  window.location.href=\"https://jamesdreaming.tistory.com/43\";\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-12 total-wrap withdrawal\" id=\"login\">\r\n");
      out.write("	<div class=\"container-htag\">\r\n");
      out.write("		<h1>김개똥님!</h1>\r\n");
      out.write("		<h5>\r\n");
      out.write("			탈퇴에 앞서 봉사자님을 통해 행복을 다시 찾고있는<br>많은 우리 동물들을 위해 다시한번 고민을 부탁드립니다\r\n");
      out.write("		</h5>\r\n");
      out.write("	</div>\r\n");
      out.write("<!-- action수정하기//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// -->\r\n");
      out.write("	<form action=\"withdrawalDone.jsp\" method=\"post\" name=\"withdrawal\" class=\"withdrawalForm2\">\r\n");
      out.write("		<table id=\"tableStyle\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>비밀번호</td>\r\n");
      out.write("				<td><input type=\"password\" class=\"form-control\" name=\"supporter_password\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<table id=\"tableStyle\" style=\"margin-top: 20px;\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input type=\"submit\" class=\"btn btn-primary\"\r\n");
      out.write("					value=\"&nbsp;Delete My Account&nbsp;\" onclick=\"del()\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("	</form>\r\n");
      out.write("</div>");
    } catch( java.lang.Throwable t ) {
      if( t instanceof javax.servlet.jsp.SkipPageException )
          throw (javax.servlet.jsp.SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof java.lang.IllegalStateException )
          throw (java.lang.IllegalStateException) t;
      if( t instanceof javax.servlet.jsp.JspException )
          throw (javax.servlet.jsp.JspException) t;
      throw new javax.servlet.jsp.JspException(t);
    } finally {
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }
}
