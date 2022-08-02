# spring_mvc_configuration
This project is about spring mvc configuration with all version

## xml version branch
  #### This branch is spring mvc configuration with web.xml and spring bean configuration file ( servlet-config.xml and root-config.xml )
  
  > servlet-config.xml is used for mvc configuration
   
  > root-config.xml is used for ioc container
  
  > web.xml is used for dispatcher servlet

## xml version without web.xml
  #### This branch is spring mvc configuration with ServletContainerInitializer and spring bean configuration file ( servlet-config.xml and root-config.xml )

  > servlet-config.xml is used for mvc configuration
   
  > root-config.xml is used for ioc container
  
  > AppInitializer is sub class of ServletContainerInitializer is used for dispatcher servlet.(note : src/main/resources/ -> create file META-INF/services/ javax.servlet.ServletContainerInitializer or Used WebApplicationInitializer class for dispatcher servlet that is no need to create any file.
  
 ### Extensible class for Initializer
    - ServletContainerInitializer 
    - WebApplicationInitializer
    - AbstractContextLoaderInitializer
    - AbstractAnnotationConfigDispatcherServletInitializer (Java Config)
