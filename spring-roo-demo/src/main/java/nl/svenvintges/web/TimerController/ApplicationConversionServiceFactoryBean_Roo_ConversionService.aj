// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package nl.svenvintges.web.TimerController;

import java.lang.String;
import nl.svenvintges.Timer;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    Converter<Timer, String> ApplicationConversionServiceFactoryBean.getTimerConverter() {
        return new Converter<Timer, String>() {
            public String convert(Timer timer) {
                return new StringBuilder().append(timer.getMessage()).append(" ").append(timer.getSven()).append(" ").append(timer.getDemo2()).toString();
            }
        };
    }
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(getTimerConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
}
