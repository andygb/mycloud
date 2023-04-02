---
## version 1.0
## 初始化三个服务 springboot , 并启动  eureka，支持springCloud
# orderService, userService 依赖mysql
# tradeService 通过 restTemplate （@LoadBalance) 访问 order 和 user 服务
---
