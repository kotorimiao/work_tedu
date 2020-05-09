package cn.xm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootSsmApplication extends  SpringBootServletInitializer{
 @Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	// TODO Auto-generated method stub
	return application.sources(SpringBootSsmApplication.class);
}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSsmApplication.class, args);
	}
	/*
	 * Invalid character found in the request target. The valid characters are defined in RFC 7230 and RFC 3986
	 * pringBoot 2.0.0 以上都采用内置tomcat8.0以上版本，而tomcat8.0以上版本遵从RFC规范添加了对Url的特殊字符的限制
	 * ，url中只允许包含英文字母(a-zA-Z)、数字(0-9)、-_.~四个特殊字符以及保留字符( ! * ’ ( ) ; : @ & = + $ , / ? # [ ] ) (26*2+10+4+18=84)
	 * 这84个字符,请求中出现了{}大括号或者[],所以tomcat报错。设置RelaxedQueryChars允许此字符(建议)，设置requestTargetAllows选项(Tomcat 8.5中不推荐)
	 */

	                                                                                                                                                                                                       
}
