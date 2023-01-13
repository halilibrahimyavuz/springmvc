package com.tpe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

   @Configuration                   // --> Configuration oldugunu anlaması ıcın notasyonu koyduk.mvc dırek bunu bulup ıcındekı verılerı alıp ayaga kaldıracak
   @EnableWebMvc                    // --> MVC ile çalısacagımı bildiriyorum.
   @ComponentScan("com.tpe")        // --> com.tpe dahıl olmak uzere taramaya buradan asagıya dogru basla ve gıt
  public class WebMvcConfig  implements WebMvcConfigurer {

    // --> viewResolver objemi Bean olarak ekliyoruz --> ModelAndView yapısından --> viewResolver a gidiyor o yuzden BEAN olusturduk
    @Bean
    public InternalResourceViewResolver resolver(){

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/views/");    // view dosyalarının yerinin yazdık
        resolver.setSuffix(".jsp");               // .jsp uzantılı dosyaları dıkkate al komutu verdık

        return resolver;
    }

    @Override           //resourceslara hangı dosya dan ulasılacak yolunu verdık
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/resources/")
                .setCachePeriod(0);
    }

}
