## 云数据操纵助手

When you develop a software such as an android application.you need to develop both android app and server app.But now,visit the datahelper-website,regist account and get a token.Download the sdk the website provided for you,you just need to develop the android app,ignore the sever app.It makes developing easier.

Like Bmob cloud service http://www.bmob.cn/ 

Its just a easy demo and I create it for the competition in my school (Hebei University of technology)

> Framework used in the project

Struts2 DBUtils

> Summary

算是一个小的实现吧

在此网站注册账户，可以获得一个网站提供给你的云端数据库，在你的应用程序中通过使用网站提供的SDK进行增删改查（SDK支持面向对象和SQL操作，SDK目前只有Java版本）

在此网站登录后，提供在线执行SQL的功能

每一个用户有一个属于自己的Token，对应一个自己的database，在SDK中通过传入Token创建SDK实例并进行增删改查

```
// 在网站后台管理中可以申请获得Token
String token = "xha812jqiwe&the...";
FexUtils sdk = FexUtils.regist(token);

List<Map<String,Object>> resultSet = sdk.query("select * from TABLE_NAME");
...
```

> 页面效果图如下

<img src="https://github.com/yogyue/hebut-datahelper-website/blob/master/document/%E4%BA%91%E6%95%B0%E6%8D%AE%E6%93%8D%E7%BA%B5%E5%8A%A9%E6%89%8B.png" width = "85%" alt="效果图" align=center />

