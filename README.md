# spring-cloud-security-oauth2-jwt
使用spring-cloud-security-oauth2来实现oauth server和resource server，oauth Server和resource Server分开，oauth Server和resource Server使用了jwt的方式进行了实现。认证服务器生成jwt格式的token，并不对其进行持久化，然后资源服务器使用密钥进行校验token。

授权登录时，使用用户名reader密码reader登录
