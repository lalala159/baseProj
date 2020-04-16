# baseProj

#2020/04/15 eureka服务注册
服务注册
1、注册中心相互注册(如对服务中心7001而言、有如下配置)
    eureka:
      instance:
        hostname: eruka7001.com #eureka服务端的实例名称
      client:
        #表示不向注册中心注册自己
        register-with-eureka: false
        #false表示表示自己端就是注册中心,我的职责就是维护服务实例，并不需要去检索服务
        fetch-registry: false
        service-url:
          #设置与eureka server交互的地址查询服务和注册服务都需要依赖这个地址
          defaultZone: http://eruka7003.com:7003/eureka/,http://eruka7002.com:7002/eureka/
2、服务往注册中心注册(相同的服务服务名称一致)
3、消费者通过注册中心调用服务
    ①、服务地址变为注册中心生成的服务地址：http://PAYMENT-SERVICE
    ②、通过在服务调用配置类获取RestTemplate的方法上添加@LoadBalanced注解、达到负载均衡。帮助应用端找到所在集群中的服务。
        @Bean
        @LoadBalanced
        public RestTemplate getRestTemplate(){
            return new RestTemplate();
        }
4、查看服务状态
在配置里面新增实例名称区分服务
eureka:
  instance:
    instance-id: payment8002
进入服务中心页面点击实例名称将info改成health返回up则服务正常、否则异常
/actuator/health 
5、自我保护关闭配置
    --注册中心
    server:
        #关闭自我保护机制
        enable-self-preservation: false
        eviction-interval-timer-in-ms: 2000
    --服务端
    服务心跳每隔1秒钟发送一次
    lease-renewal-interval-in-seconds: 1
    服务等待时间、超过将剔除
    lease-expiration-duration-in-seconds: 2
#27end

#2020/04/16
-----------Nacos(96-99)
Nacos服务注册---无需搭建环境只需下载安装包启动---在本地项目配置nacos地址即可

