# DubboStudy
Dubbo整合SpringBoot最简单的实现，注册中心采用zookeeper.
走过的坑：
1. Dubbo对SpringBoot的最高支持版本为1.5.13
2. 服务暴露的接口package为com.winnie.service,暴露的服务需要在com.winnie.service.xxxx，配置中为spring.dubbo.scan=com.winnie.service，如果没有配置对。会导致zk加载失败。
