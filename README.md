# Thymeleaf - up too speed

Purpose of project is to showcase basic features of thymeleaf templating engine for Spring web MVC apps.

## Setting up automatic application restarts

* Include *Spring boot DevTools* dependency in your project
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
    <optional>true</optional>
</dependency>
```

* Install LiveReload - Web extension in your browser

![Live Reload for Firefox](/docs/images/LiveReloadFirefox.png)

* enable LiveReload (after you start the project and open your web page in browser)

![Enable Live Reload](/docs/images/EnableLiveReload.png)


* Disable thymeleaf caching by setting property in application.properties

```spring.thymeleaf.cache=false```

#### For IntelliJ IDEA

* Enable automatic build in settings

![Automatic build](/docs/images/IntelliJBuildAutomatically.png)


* Allow auto make in settings

![Automatic build](/docs/images/IntelliJAllowAutoMake.png)
