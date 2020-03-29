/*package com.edatachase.seagullsreuse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.FrameworkServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

@Configuration
public class WebInitializer extends
        AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class[]{WebConfig.class};
    }

    /*@Override
    protected String[] getServletMappings() {

        return new String[]{"/index.jsp=ResourceHttpRequestHandler"};
    }

    @Override
    protected FrameworkServlet createDispatcherServlet(WebApplicationContext servletAppContext) {
        DispatcherServlet dispatcher = (DispatcherServlet) super.createDispatcherServlet(servletAppContext);
        dispatcher.setThrowExceptionIfNoHandlerFound(true);
        return dispatcher;
    }

    /* public class MyWebAppInitializer implements WebApplicationInitializer {
        @Override
        public void onStartup(ServletContext container) {
            XmlWebApplicationContext context = new XmlWebApplicationContext();
            context.setConfigLocation("/WEB-INF/spring/dispatcher-config.xml");

            ServletRegistration.Dynamic dispatcher = container
                    .addServlet("dispatcher", new DispatcherServlet(context));

            dispatcher.setLoadOnStartup(1);
            dispatcher.addMapping("/");
        }
    }
}
*/