# Week6
## 이번 주 읽은 범위
## 책에서 기억하고 싶은 내용
플러그인 아키텍처
* 중심이 되는 비즈니스 로직이 있다
* 비즈니스 로직에 세부 사항을 플러그인 형태로 꼽아 사용
* 이를 통해 확장 가능하며, 유지보수가 쉬운 시스템 확립 가능

정책
* 컴퓨터 프로그램은 각 입력을 출력으로 변환하는 정책을 기술한 것
* 동일한 시점에 변경되는 정책은 동일한 수준에 위치하며, 동일한 컴포넌트에 속해야 함
* 컴포넌트의 의존 방향은 저수준에서 고수준으로 행해야 한다

수준
* 수준이란 엄밀히 말하면 **입력과 출력까지의 거리**
* 입력과 출력으로부터 거리가 멀 수록 수준이 높은 것

엔티티
* 핵심 업무 데이터와 업무 규칙
* 업무의 대표자로써 독립적인 존재로, 어떤 시스템에서도 업무를 수행할 수 있으며
* 시스템의 세부 사항에 무관해야 한다

유스케이스
* 자동화된 시스템의 동작 방식을 정의
* 엔티티를 어떻게, 언제 호출할지 명시하는 규칙을 담는다
* 유스케이스가 엔티티를 제어
* 엔티티는 유스케이스에 대해 알아서는 안된다

## 읽은 분량에 대한 소감
수준이란 무엇인가에 대한 구체적인 내용이 나온 장이었습니다.

고수준에서 저수준이라는 표현이 조금 모호하다는 느낌을 많이 받았는데  
해당 장에서 수준이란 무엇인가에 대한 엄밀한 정의를 내려주어 이해하는데 도움이  
많이 되었습니다.

또한 엔티티와 유스케이스에 대한 언급이 나왔습니다.  
개발 하면서도 엔티티와 유스케이스 각자의 역할에 대한 의문점이 있었는데  
이 장에서 예시를 들어가며 설명해 주어 각자의 역할을 명확하게 알 수 있었습니다.

주변 사람들에게 정말 추천하고 싶은 책이에요.

## 궁금한 내용 혹은 잘 이해되지 않은 내용
저번 주 나온 멀티 모듈과 관련된 이야기입니다.  
멀티 모듈을 어떤 식으로 구성하는지 찾아보니 수평으로 자르기도 하는 것처럼 보이는데요,  
수직으로 자를 경우 즉, 한 프로젝트의 여러 서비스를 하나의 레포에 작업할 경우 공통 코드라던가 그런 것들을  
여러 서비스에 함께 사용하여 중복을 줄일 수 있다는 생각이 들었는데 아직 수평으로 자를 경우 어떤 이점이 있는지  
잘 모르겠습니다.

별개로 빈 주입이 안된다고 저번 주 말씀하셨던 내용, 생각해보니 스프링부트의 자동 빈 주입에 관련된 내용이었는데요,  
스프링과 달리 스프링부트는 어노테이션 기반으로 자동 빈 등록 및 주입을 지원하는데 main 함수가 있는 클래스의  
`@SpringbootApplication` 어노테이션이 있는 패키지 부터 하위 패키지를 스캔하며 `@Component` 어노테이션이 있는  
클래스를 찾게 됩니다. 이때 스프링 빈이 다른 패키지에 있어 빈을 찾지 못한 것으로 보입니다.

그냥 `@BasePackage` 였나 뭐였나 어노테이션으로 스캔할 패키지 명시해주면 빈 등록 될거에욥

https://www.notion.so/d4aae4c7201241db8164e19ca40cf99c?pvs=4