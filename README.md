## 开发环境

- **JDK 1.8 +**
- **Maven 3.5 +**
- **IntelliJ IDEA +** (*注意：务必使用 IDEA 开发，同时保证安装 `lombok` 插件*)
- **Mysql 5.7 +** (*尽量保证使用 5.7 版本以上，因为 5.7 版本加了一些新特性，同时不向下兼容。本 demo 里会尽量避免这种不兼容的地方，但还是建议尽量保证 5.7 版本以上*)

## 运行方式


1. 使用 IDEA 打开 clone 下来的项目
3. 在 IDEA 中 Maven Projects 的面板导入项目根目录下 的 `pom.xml` 文件
4. Maven Projects 找不到的童鞋，可以勾上 IDEA 顶部工具栏的 View -> Tool Buttons ，然后 Maven Projects 的面板就会出现在 IDEA 的右侧
5. 找到各个 Module 的 Application 类就可以运行各个 demo 了
6. **`注意：每个 demo 均有详细的 README 配套，使用 demo 前记得先看看哦~`**
7. **`注意：运行各个 demo 之前，有些是需要事先初始化数据库数据的，亲们别忘记了哦~`**

## 各 Module 介绍

| Module 名称                                                  | Module 介绍                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| [demo](./demo) | spring-boot 的一个demo初始化项目                                |
| [wjoinj-spring-mybatis](./wjoinj-spring-mybatis) | spring-boot 集成原生mybatis，使用 [mybatis-spring-boot-starter](https://github.com/mybatis/spring-boot-starter) 集成                               |
| [spring-boot-demo-properties](./spring-boot-demo-properties) | spring-boot 读取配置文件中的内容                             |
| [spring-boot-demo-actuator](./spring-boot-demo-actuator)     | spring-boot 集成 spring-boot-starter-actuator 用于监控 spring-boot 的启动和运行状态 |
| [spring-boot-demo-admin-client](./spring-boot-demo-admin/spring-boot-demo-admin-client) | spring-boot 集成 spring-boot-admin 来可视化的监控 spring-boot 程序的运行状态，可以与 actuator 互相搭配使用，客户端示例 |
| [spring-boot-demo-admin-server](./spring-boot-demo-admin/spring-boot-demo-admin-server) | spring-boot 集成 spring-boot-admin 来可视化的监控 spring-boot 程序的运行状态，可以与 actuator 互相搭配使用，服务端示例 |
| [spring-boot-demo-logback](./spring-boot-demo-logback)       | spring-boot 集成 logback 日志                                |
| [spring-boot-demo-log-aop](./spring-boot-demo-log-aop)       | spring-boot 使用 AOP 切面的方式记录 web 请求日志             |
| [spring-boot-demo-exception-handler](./spring-boot-demo-exception-handler) | spring-boot 统一异常处理，包括2种，第一种返回统一的 json 格式，第二种统一跳转到异常页面 |
| [spring-boot-demo-template-freemarker](./spring-boot-demo-template-freemarker) | spring-boot 集成 Freemarker 模板引擎                         |
| [spring-boot-demo-template-thymeleaf](./spring-boot-demo-template-thymeleaf) | spring-boot 集成 Thymeleaf 模板引擎                          |
| [spring-boot-demo-template-beetl](./spring-boot-demo-template-beetl) | spring-boot 集成 Beetl 模板引擎                              |
| [spring-boot-demo-template-enjoy](./spring-boot-demo-template-enjoy) | spring-boot 集成 Enjoy 模板引擎                              |
| [spring-boot-demo-orm-jdbctemplate](./spring-boot-demo-orm-jdbctemplate) | spring-boot 集成 Jdbc Template 操作数据库，并简易封装通用 Dao 层 |
| [spring-boot-demo-orm-jpa](./spring-boot-demo-orm-jpa)       | spring-boot 集成 spring-boot-starter-data-jpa 操作数据库     |
| [spring-boot-demo-orm-mybatis](./spring-boot-demo-orm-mybatis) | spring-boot 集成原生mybatis，使用 [mybatis-spring-boot-starter](https://github.com/mybatis/spring-boot-starter) 集成 |
| [spring-boot-demo-orm-mybatis-mapper-page](./spring-boot-demo-orm-mybatis-mapper-page) | spring-boot 集成[通用Mapper](https://github.com/abel533/Mapper)和[PageHelper](https://github.com/pagehelper/Mybatis-PageHelper)，使用 [mapper-spring-boot-starter](https://github.com/abel533/Mapper/tree/master/spring-boot-starter) 和 [pagehelper-spring-boot-starter](https://github.com/pagehelper/pagehelper-spring-boot) 集成 |
| [spring-boot-demo-orm-mybatis-plus](./spring-boot-demo-orm-mybatis-plus) | spring-boot 集成 [mybatis-plus](https://mybatis.plus/)，使用 [mybatis-plus-boot-starter](http://mp.baomidou.com/) 集成，集成 BaseMapper、BaseService、ActiveRecord 操作数据库 |
| [spring-boot-demo-orm-beetlsql](./spring-boot-demo-orm-beetlsql) | spring-boot 集成 [beetl-sql](http://ibeetl.com/guide/#beetlsql)，使用 [beetl-framework-starter](http://ibeetl.com/guide/#beetlsql) 集成 |
| [spring-boot-demo-upload](./spring-boot-demo-upload)         | spring-boot 文件上传示例，包含本地文件上传以及七牛云文件上传 |
| [spring-boot-demo-cache-redis](./spring-boot-demo-cache-redis) | spring-boot 整合 redis，操作redis中的数据，并使用redis缓存数据 |
| [spring-boot-demo-cache-ehcache](./spring-boot-demo-cache-ehcache) | spring-boot 整合 ehcache，使用 ehcache 缓存数据              |
| [spring-boot-demo-email](./spring-boot-demo-email)           | spring-boot 整合 email，包括发送简单文本邮件、HTML邮件（包括模板HTML邮件）、附件邮件、静态资源邮件 |
| [spring-boot-demo-task](./spring-boot-demo-task)             | spring-boot 快速实现定时任务                                 |
| [spring-boot-demo-task-quartz](./spring-boot-demo-task-quartz) | spring-boot 整合 quartz，并实现对定时任务的管理，包括新增定时任务，删除定时任务，暂停定时任务，恢复定时任务，修改定时任务启动时间，以及定时任务列表查询，`提供前端页面` |
| [spring-boot-demo-task-xxl-job](./spring-boot-demo-task-xxl-job) | spring-boot 整合[xxl-job](http://www.xuxueli.com/xxl-job/en/#/)，并提供绕过 `xxl-job-admin` 对定时任务的管理的方法，包括定时任务列表，触发器列表，新增定时任务，删除定时任务，停止定时任务，启动定时任务，修改定时任务，手动触发定时任务 |
| [spring-boot-demo-swagger](./spring-boot-demo-swagger)       | spring-boot 集成原生的 `swagger` 用于统一管理、测试 API 接口 |
| [spring-boot-demo-swagger-beauty](./spring-boot-demo-swagger-beauty) | spring-boot 集成第三方 `swagger` [swagger-bootstrap-ui](https://github.com/xiaoymin/Swagger-Bootstrap-UI) 美化API文档样式，用于统一管理、测试 API 接口 |
| [spring-boot-demo-rbac-security](./spring-boot-demo-rbac-security) | spring-boot 集成 spring security 完成基于RBAC权限模型的权限管理，支持自定义过滤请求，动态权限认证，使用 JWT 安全认证，支持在线人数统计，手动踢出用户等操作 |
| [spring-boot-demo-rbac-shiro](./spring-boot-demo-rbac-shiro) | spring-boot 集成 shiro 实现权限管理<br /> <span style="color:pink;">待完成</span> |
| [spring-boot-demo-session](./spring-boot-demo-session)       | spring-boot 集成 Spring Session 实现Session共享、重启程序Session不失效 |
| [spring-boot-demo-oauth](./spring-boot-demo-oauth)           | spring-boot 实现 oauth 服务器功能，实现授权码机制<br /> <span style="color:pink;">待完成</span> |
| [spring-boot-demo-social](./spring-boot-demo-social)         | spring-boot 集成第三方登录，集成 `justauth-spring-boot-starter` 实现QQ登录、GitHub登录、微信登录、谷歌登录、微软登录、小米登录、企业微信登录。 |
| [spring-boot-demo-zookeeper](./spring-boot-demo-zookeeper)   | spring-boot 集成 Zookeeper 结合AOP实现分布式锁               |
| [spring-boot-demo-mq-rabbitmq](./spring-boot-demo-mq-rabbitmq) | spring-boot 集成 RabbitMQ 实现基于直接队列模式、分列模式、主题模式、延迟队列的消息发送和接收 |
| [spring-boot-demo-mq-rocketmq](./spring-boot-demo-mq-rocketmq) | spring-boot 集成 RocketMQ，实现消息的发送和接收<br /> <span style="color:pink;">待完成</span> |
| [spring-boot-demo-mq-kafka](./spring-boot-demo-mq-kafka)     | spring-boot 集成 kafka，实现消息的发送和接收                 |
| [spring-boot-demo-websocket](./spring-boot-demo-websocket)   | spring-boot 集成 websocket，后端主动推送前端服务器运行信息   |
| [spring-boot-demo-websocket-socketio](./spring-boot-demo-websocket-socketio) | spring-boot 使用 netty-socketio 集成 websocket，实现一个简单的聊天室 |
| [spring-boot-demo-ureport2](./spring-boot-demo-ureport2)     | spring-boot 集成 ureport2 实现复杂的自定义的中国式报表<br /> <span style="color:pink;">待完成</span> |
| [spring-boot-demo-uflo](./spring-boot-demo-uflo)             | spring-boot 集成 uflo 快速实现轻量级流程引擎<br /> <span style="color:pink;">待完成</span> |
| [spring-boot-demo-urule](./spring-boot-demo-urule)           | spring-boot 集成 urule 快速实现规则引擎<br /> <span style="color:pink;">待完成</span> |
| [spring-boot-demo-activiti](./spring-boot-demo-activiti)     | spring-boot 集成 activiti 7  流程引擎<br /> <span style="color:pink;">待完成</span> |
| [spring-boot-demo-async](./spring-boot-demo-async)           | spring-boot 使用原生提供的异步任务支持，实现异步执行任务     |
| [spring-boot-demo-war](./spring-boot-demo-war)               | spring-boot 打成 war 包的配置                                |
| [spring-boot-demo-elasticsearch](./spring-boot-demo-elasticsearch) | spring-boot 集成 ElasticSearch，集成 `spring-boot-starter-data-elasticsearch` 完成对 ElasticSearch 的高级使用技巧，包括创建索引、配置映射、删除索引、增删改查基本操作、复杂查询、高级查询、聚合查询等 |
| [spring-boot-demo-dubbo](./spring-boot-demo-dubbo)           | spring-boot 集成 Dubbo，分别为公共模块 `spring-boot-demo-dubbo-common`、服务提供方`spring-boot-demo-dubbo-provider`、服务调用方`spring-boot-demo-dubbo-consumer` |
| [spring-boot-demo-mongodb](./spring-boot-demo-mongodb)       | spring-boot 集成 MongoDB，使用官方的 starter 实现增删改查    |
| [spring-boot-demo-neo4j](./spring-boot-demo-neo4j)           | spring-boot 集成 Neo4j 图数据库，实现一个校园人物关系网的demo |
| [spring-boot-demo-docker](./spring-boot-demo-docker)         | spring-boot 容器化                                           |
| [spring-boot-demo-multi-datasource-jpa](./spring-boot-demo-multi-datasource-jpa) | spring-boot 使用JPA集成多数据源                              |
| [spring-boot-demo-multi-datasource-mybatis](./spring-boot-demo-multi-datasource-mybatis) | spring-boot 使用Mybatis集成多数据源，使用 Mybatis-Plus 提供的开源解决方案实现 |
| [spring-boot-demo-sharding-jdbc](./spring-boot-demo-sharding-jdbc) | spring-boot 使用 `sharding-jdbc` 实现分库分表，同时ORM采用 Mybatis-Plus |
| [spring-boot-demo-tio](./spring-boot-demo-tio)               | spring-boot 集成 tio 网络编程框架<br /> <span style="color:pink;">待完成</span> |
| [spring-boot-demo-grpc](./spring-boot-demo-grpc)             | spring-boot 集成grpc，配置tls/ssl，参见[ISSUE#5](https://github.com/xkcoding/spring-boot-demo/issues/5)<br /> <span style="color:pink;">待完成</span> |
| [spring-boot-demo-codegen](./spring-boot-demo-codegen)       | spring-boot 集成 velocity 模板技术实现的代码生成器，简化开发 |
| [spring-boot-demo-graylog](./spring-boot-demo-graylog)       | spring-boot 集成 graylog 实现日志统一收集                    |
| spring-boot-demo-sso                                         | spring-boot 集成 SSO 单点登录，参见 [ISSUE#12](https://github.com/xkcoding/spring-boot-demo/issues/12)<br /> <span style="color:pink;">待完成</span> |
| [spring-boot-demo-ldap](./spring-boot-demo-ldap)             | spring-boot 集成 LADP，集成 `spring-boot-starter-data-ldap` 完成对 Ldap 的基本 CURD操作, 并给出以登录为实战的 API 示例，参见 [ISSUE#23](https://github.com/xkcoding/spring-boot-demo/issues/23)，感谢 [@fxbin](https://github.com/fxbin) |
| [spring-boot-demo-dynamic-datasource](./spring-boot-demo-dynamic-datasource) | spring-boot 动态添加数据源、动态切换数据源                   |
| [spring-boot-demo-ratelimit-guava](./spring-boot-demo-ratelimit-guava) | spring-boot 使用 Guava RateLimiter 实现单机版限流，保护 API  |
| [spring-boot-demo-ratelimit-redis](./spring-boot-demo-ratelimit-redis) | spring-boot 使用 Redis + Lua 脚本实现分布式限流，保护 API    |
| [spring-boot-demo-https](./spring-boot-demo-https)           | spring-boot 集成 HTTPS                                       |
| [spring-boot-demo-elasticsearch-rest-high-level-client](./spring-boot-demo-elasticsearch-rest-high-level-client) | spring boot 集成 ElasticSearch 7.x 版本，使用官方 Rest High Level Client 操作 ES 数据 |
| [spring-boot-demo-flyway](./spring-boot-demo-flyway)         | spring boot 集成 Flyway，项目启动时初始化数据库表结构，同时支持数据库脚本版本控制 |

### 官方提供的 starter 介绍

| 名称                                   | 描述                                                        |
| :------------------------------------- | :---------------------------------------------------------- |
| spring-boot-starter                    | Spring Boot 核心包，包括自动装配，日志，以及YAML文件解析    |
| spring-boot-starter-actuator           | 帮助在生产环境下监控和管理 Spring Boot 应用                 |
| spring-boot-starter-amqp               | Spring Boot 快速集成 RabbitMQ                               |
| spring-boot-starter-aop                | 提供切面编程特性，包含 spring-aop 和 AspectJ 依赖           |
| spring-boot-starter-batch              | 快速集成 Spring Batch 批处理框架，包括操作  HSQLDB 数据库   |
| spring-boot-starter-cache              | Support for Spring’s Cache abstraction.                     |
| spring-boot-starter-data-elasticsearch | Spring Boot 快速集成 ElasticSearch 查询分析引擎             |
| spring-boot-starter-data-jpa           | Spring Boot 快速集成 JPA 操作数据库                         |
| spring-boot-starter-data-mongodb       | Spring Boot 快速集成 MongoDB 非关系型数据库                 |
| spring-boot-starter-data-rest          | Spring Boot 暴露数据库查询端点为 REST 服务                  |
| spring-boot-starter-data-solr          | Spring Boot 快速集成 Solr 实现全文索引                      |
| spring-boot-starter-freemarker         | 提供 FreeMarker 模板引擎                                    |
| spring-boot-starter-groovy-templates   | 提供 Groovy 模板引擎                                        |
| spring-boot-starter-integration        | 提供通用的集成 spring-integration 模块                      |
| spring-boot-starter-jdbc               | 快速集成 JDBC 操作数据库                                    |
| spring-boot-starter-jersey             | 提供 Jersey 提供  RESTful 服务                              |
| spring-boot-starter-jta-atomikos       | 集成 JTA Atomikos 实现分布式事务                            |
| spring-boot-starter-jta-bitronix       | 集成 JTA Bitronix 实现分布式事务                            |
| spring-boot-starter-mail               | 快速邮件集成                                                |
| spring-boot-starter-mustache           | 提供 Mustache 模板引擎                                      |
| spring-boot-starter-redis              | Spring Boot 快速集成 Redis                                  |
| spring-boot-starter-security           | Support for spring-security.                                |
| spring-boot-starter-social-facebook    | Support for spring-social-facebook.                         |
| spring-boot-starter-social-linkedin    | Support for spring-social-linkedin.                         |
| spring-boot-starter-social-twitter     | Support for spring-social-twitter.                          |
| spring-boot-starter-test               | 提供通用单元测试依赖，包括 JUnit, Hamcrest , Mockito        |
| spring-boot-starter-thymeleaf          | 提供 Thymeleaf 模板引擎，包括 Thymeleaf 的自动装配等        |
| spring-boot-starter-velocity           | 提供 Velocity 模板引擎                                      |
| spring-boot-starter-web                | 提供全栈的 web 开发特性，包括 Spring MVC 依赖和 Tomcat 容器 |
| spring-boot-starter-websocket          | Spring Boot 集成 WebSocket 功能                             |
| spring-boot-starter-ws                 | Spring Boot 集成 WebService 功能                            |
