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
2. 安装配置 l-spring-log
8. idea中执行sping工程
9. 浏览器输入 http://127.0.0.1:36512/server/api/v1/test/info?word=123

结果显示为 {"myWord":"123","count":10}


## 更新/安装配置 l-spring-log 插件方式

1. git submodule update --init libs/l-spring-log
2. cd libs/l-spring-log
3. mvn clean install
4. cd /path/to/project
5. mvn clean install
6. 设置环境变量 L_LOGPATH 并重启idea使环境变量生效
    例如 L_LOGPATH=F:\logs

