# spring-start-arc

本项目用于快速开始一个以 spring boot 为基础的项目框架

## 集成的框架

1. spring boot
2. mybatis && spring mybatis && mybatis generator
3. flyway 
4. l-spring-log

## 注意事项


## 使用方式

1. clone 项目到本地
2. git submodule update --init
3. cd libs/l-spring-log
4. mvn clean install
5. cd /path/to/project
6. mvn clean install
7. idea中执行sping工程
8. 浏览器输入 http://127.0.0.1:36512/server/api/v1/test/info?word=123

结果显示为 {"myWord":"123","count":10}


## swagger使用方式

1. git submodule update --remote libs/bojiu-swagger-api
2. 拷贝 libs/bojiu-swagger-api/spring 文件夹下 的 src 文件夹所有内容到 modules/web下，覆盖原有文件
3. net.bojiu.server.swagger文件夹下为swagger生成的文件，如果有删除的一类接口，需要删除整个文件夹后重复第二步骤
4. 在 net.bojiu.server.web.controller下新建对应的类，并且实现xxxApi接口（注意，此处如果使用 idea 2017 
以后版本，需要将注解copy到实现类，因为参数的注解无法继承）
5. 完成接口
