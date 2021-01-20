# Spring Boot 개념과 활용

- 스프링부트 프로젝트 구조 

  : main application 보다 하위구조에 있는 클래스들은 모두 빈으로 등록되어
 스프링이 스캔한다. 
 
- 의존성 관리 이해 
 
  :parent pom을 통해 거슬러 올러가면 모든 버전들이 정의되어있어서 직접 버전을 명시하지 않아도
  자동으로 적절한 버전을 찾아와 사용할 수 있다.
  
  - 이점 : `관리해야할 의존성들이 줄어든다.` 
  * dependency 버전을 명시하는 버릇을 들이자
  
  (cf: ModelMapper dependency : DTO 랑 domain 객체랑 필드 값을 매핑해준다. )
  
 - 자동 설정 개요
 
 
  * @EnableAutoConfiguration(@SpringBootApplication 안에 있다)
  * Bean은 두 단계로 나눠서 읽힌다.
    - 1 : @ComponentScan
    - 2 : @EnableAutoConfiguration
    
    
  * @ComponentScan : component 어노테이션을 가진 애들은 스캔하여 bean으로 등록 
    - @Component : 개발자가 직접 작성한 class -> bean등록 
    - @Configuration : spring IOC 컨테이너에게 해당 클래스를 bean 구성 class 임을 명시
      
      @Repository
      
      @Service
      
      @Controller : view 반환
     
      @RestController : Json형태로 객체 데이터 반환 
      
      
  * @EnableAutoConfiguration
    - spring.factories 밑에 있다.
    - @Configuration
    - @ConditionalOn~~~ : 조건부여 
   
  