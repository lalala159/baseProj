package com.jkgl.ribbonConfig;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonRuleConfig {

    @Bean
    public IRule grtRibbonRule(){

  /*    轮询：RoundRobinRulel;随机：RandomRule;
        先按照RoundRobinRulel的规则获取服务,如果失败重新开始RetryRule;
        响应快的：WeightedResponseTimeRule;
        过滤故障、选择并发量最小的:BestAvailableRule;
        过滤故障、选择并发量最小的:AvailabilityFilteringRule;
        默认规则，复合判断server所在区域的性能和server的可用性选择服务器;*/
        /*随机*/
        return new RandomRule();
    }
}
