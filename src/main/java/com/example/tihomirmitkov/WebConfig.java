package com.example.tihomirmitkov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

//NOTE subclassing WebMvcConfigurationSupport is like annotating with @EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.example.tihomirmitkov"})
public class WebConfig extends WebMvcConfigurationSupport {

    /* Only by having this method static resources get served. */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/");
    }

    /* as if this used to work during my experiments, but now doesn't seem to */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index1.jsp");
        registry.addViewController("/index").setViewName("index.jsp");
    }


    /* The code here is practically a no-op. */
    @Override
    public void configureViewResolvers(final ViewResolverRegistry registry) {
        //registry.jsp("classpath:/", ".jsp");  //this doesn't work either

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        registry.viewResolver(resolver);
    }

}
