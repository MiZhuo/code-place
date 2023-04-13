package site.mizhuo.marry.config;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName PrometheusConfig
 * @Description:
 * @Author: MiZhuo
 * @Create: 2023-04-11 14:40
 * @Version 1.0
 **/
public class PrometheusConfig {
    @Bean
    MeterRegistryCustomizer<MeterRegistry> configurer(
            @Value("${spring.application.name}") String applicationName) {
        return (registry) -> registry.config().commonTags("application", applicationName);
    }
}
