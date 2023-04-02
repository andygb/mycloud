---
## version 1.0
## 初始化三个服务
# orderService, userService 依赖musql
# tradeService 通过 restTemplate （@LoadBalance) 访问 order 和 user 服务
---