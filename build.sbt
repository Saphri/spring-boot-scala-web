name := "spring-boot-scala-web"

version := "1.0"

scalaVersion := "2.11.8"

sbtVersion := "0.13.9"

enablePlugins(JavaAppPackaging)

libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-web" % "1.4.0.RELEASE",
  "org.springframework.boot" % "spring-boot-starter-data-jpa" % "1.4.0.RELEASE",
  "org.webjars" % "bootstrap" % "3.1.1",
  "org.thymeleaf" % "thymeleaf-spring4" % "2.1.2.RELEASE",
  "org.hibernate" % "hibernate-validator" % "5.0.2.Final",
  "nz.net.ultraq.thymeleaf" % "thymeleaf-layout-dialect" % "1.2.1",
  "org.hsqldb" % "hsqldb" % "2.3.1",
  "org.springframework.boot" % "spring-boot-starter-tomcat" % "1.4.0.RELEASE" % "provided",
  "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided"
)
