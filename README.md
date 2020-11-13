## 问题记录
#### 1.Consul 获取不到service的dns,重启多次服务可能解决问题 
```
版本
spring cloud Hoxton.SR8
spring boot 2.3.5.RELEASE

"service:service-producer-7100":{
        "Node":"consul_server_1",
        "CheckID":"service:service-producer-7100",
        "Name":"Service 'service-producer' check",
        "Status":"critical",
        "Notes":"",
        "Output":"Get http://localhost:7100/actuator/health: dial tcp 127.0.0.1:7100: connect: connection refused",
        "ServiceID":"service-producer-7100",
        "ServiceName":"service-producer",
        "ServiceTags":[
            "secure=false"
        ],
        "Definition":{

        },
        "CreateIndex":0,
        "ModifyIndex":0
    }
```

#### 