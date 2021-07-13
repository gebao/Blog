1.搭建环境：idea2019, JDK8.0,  tomcat9, maven3.2, Lombok 插件
2.导入数据库：blog.sql
3.修改项目中的数据库连接信息  db.properties
4.配置tomcat:Deployment 下的applicaton context为 / 没有项目名

5.创建uploads 目录， 修改 UploadFileController.java 中上传路径，需要修改 rootPath 为你指定的 uploads 目录，如 `String rootPath ="D:/uploads/";` <br/>
               如果不修改，会出现无法上传失败。为 tomcat 设置 uploads 映射。