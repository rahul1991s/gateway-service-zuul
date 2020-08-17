# spring-cloud-zuul
How to configure SpringCloud Zuul – Routing and Filtering | SpringBoot

#3m-splier-service and jbl-supplier-service is the micro service application name
#bl-supplier-service has single end point i.e, get-products
#zuul.prefix=/api - Every end point which comes under /api should be proxied which zuul protected 


localhost:8081/api/products/getHammer
localhost:8081/api/jbl-supplier-service

# Can add eureka as well with zuul. 