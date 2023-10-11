# Common Config

To set common region and project id for any request, you can also overwrite it by request.

## Config Lists

| 配置             | 类型               | 描述                                                                                                                                                                                                                                                                                                                                                                                                 |
|----------------|------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **baseUrl**    | String           | （Optional）The access endpoint of the API service, the default is https://api.uspeedo.com/api                                                                                                                                                                                                                                                                                                       |
| **userAgent**  | String           | （Optional）UserAgent is a property unique to the SDK client and is used to distinguish the version of the SDK used. Please refer to the definition of User-Agent [MDN](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/User-Agent)。The user-defined UserAgent will be appended to the end of the SDK version number. For example “MyAPP/0.10.1” -> “PHP/8.0.6 PHP-SDK/0.1.0 MyAPP/0.10.1” |
| **timeout**    | Integer          | （Optional）Request timeout, default 30s                                                                                                                                                                                                                                                                                                                                                             |
| **maxRetries** | Integer          | （Optional）Maximum number of retries. Default retries 3 times. Setting this value greater than 0 will automatically retry network and service availability issues, use exponential backoff retry intervals, and automatically skip interfaces for resource creation classes.                                                                                                                        |
| **logger**     | org.slf4j.Logger | （Optional）To customize Logger, please refer to [SLF4J](https://www.slf4j.org/) SLF4J definition                                                                                                                                                                                                                                                                                                    |

## Advanced configuration options

### Access other gateways

```java
Config config = new Config();
config.setBaseUrl("xxx.api.uspeedo.com/api"); // Set other gateway addresses
```
