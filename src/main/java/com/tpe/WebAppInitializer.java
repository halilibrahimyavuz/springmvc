package com.tpe;


import org.springframework.web.servlet.
        support.AbstractAnnotationConfigDispatcherServletInitializer;

//Bu class  web.xml yerine kullanılacak.
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override       // * db ve hibernate ile alakalı ayarlar ıcın kullanagım methoddur.
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
                RootContextConfig.class
        };
    }

    @Override       // * MVC Config ayarlarım ile alakalı
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                WebMvcConfig.class
        };
    }

    @Override       // * Hangi URL hangi servlet e gidecek onu belirleyecegiz
    protected String[] getServletMappings() {
        return new String[]{"/"};   //gelen butun requestleri bu servlet tarafından karsılanacagını soyluyor.
    }



}
