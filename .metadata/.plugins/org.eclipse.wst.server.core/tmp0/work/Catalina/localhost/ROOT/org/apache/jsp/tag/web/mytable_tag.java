/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.63
 * Generated at: 2022-06-07 12:39:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mytable_tag
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
      out.write("\r\n");
      out.write("<div class=\"twin container\">\r\n");
      out.write("	<div class=\"row\">\r\n");
      out.write("<!-- 정기후원중이 아니라면 테이블 대신 후원정보가 없습니다 노출//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// -->\r\n");
      out.write("		<div class=\"col-md-6\">\r\n");
      out.write("			<div class=\"twins-wrap\">\r\n");
      out.write("				<h2>정기후원내역</h2>\r\n");
      out.write("				<div>\r\n");
      out.write("					<div>\r\n");
      out.write("						<table class=\"board table\"\r\n");
      out.write("							style=\"text-align: center; margin-bottom: 14px;\">\r\n");
      out.write("							<tbody>\r\n");
      out.write("								<tr class=\"boardHead\">\r\n");
      out.write("									<td>은행</td>\r\n");
      out.write("									<td>계좌</td>\r\n");
      out.write("									<td>금액</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("							</tbody>\r\n");
      out.write("							<tbody class=\"boardTbottom\">\r\n");
      out.write("<!-- 데이터 불러오기//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// -->\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>신한은행</td>\r\n");
      out.write("									<td>110-123-456987</td>\r\n");
      out.write("									<td>50,000</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("								</tr>\r\n");
      out.write("							</tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("						<h6 style=\"float: right;\">후원 시작일 : 22.01.01</h6>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("<!-- 일시후원중이 아니라면 테이블 대신 후원정보가 없습니다 노출//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// -->\r\n");
      out.write("		<div class=\"col-md-6\">\r\n");
      out.write("			<div class=\"twins-wrap\">\r\n");
      out.write("				<h2>일시후원내역</h2>\r\n");
      out.write("				<div>\r\n");
      out.write("					<div>\r\n");
      out.write("						<table class=\"board table\" style=\"text-align: center;\">\r\n");
      out.write("							<tbody>\r\n");
      out.write("								<tr class=\"boardHead\">\r\n");
      out.write("									<td>은행</td>\r\n");
      out.write("									<td>계좌</td>\r\n");
      out.write("									<td>금액</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("							</tbody>\r\n");
      out.write("							<tbody class=\"boardTbottom\">\r\n");
      out.write("<!-- 데이터 불러온뒤 for문으로 구현//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// -->\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>신한은행</td>\r\n");
      out.write("									<td>110-123-456987</td>\r\n");
      out.write("									<td>50,000</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>국민은행</td>\r\n");
      out.write("									<td>33-2541-5326</td>\r\n");
      out.write("									<td>30,000</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>기업은행</td>\r\n");
      out.write("									<td>3333-11-9652369</td>\r\n");
      out.write("									<td>100,000</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>우리은행</td>\r\n");
      out.write("									<td>110-231-521365</td>\r\n");
      out.write("									<td>50,000</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("							</tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
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
