package com.example.tihomirmitkov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration
@ComponentScan(basePackages = {"com.example.tihomirmitkov"})
public class WebConfig extends WebMvcConfigurationSupport {

    /*@Autowired
    private ApplicationContext applicationContext;
*/
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/../webapp");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index.jsp");
        registry.addViewController("/index").setViewName("index.jsp");
    }


    @Override
    public void configureViewResolvers(final ViewResolverRegistry registry) {
        //registry.jsp("classpath:/", ".jsp");

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        registry.viewResolver(resolver);
    }

}
