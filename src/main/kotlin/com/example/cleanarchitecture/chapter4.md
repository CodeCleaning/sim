# Chapter4. 컴포넌트 원칙
# 책에서 기억하고 싶은 내용
컴포넌트란 시스템의 구성 요소로 **배포할 수 있는 가장 작은 단위**(자바라면 jar 파일 등등)

여러 컴포넌트를 서로 링크하여 실행 가능한 단일 파일로 생성할 수 있음


## 컴포넌트 응집도
어느 모듈들을 같은 컴포넌트에 포함시켜야 할까에 대해 다룬 장

### REP
재사용성을 위한 원칙

재사용되는 컴포넌트는 그 버전과 함께 별도로 분리되어야 함
그리고 버전과 그 관련 문서도 잘 관리되어야 함

이를 통해 재사용성을 향상시킬 수 있음


### CCP
유지보수성을 위한 원칙

동일한 이유로 동일한 시점에 변경되는 클래스를 같은 컴포넌트로 묶어야 함

컴포넌트간 의존성이 강화되어 함께 영향받는 모듈들을 한 컴포넌트로 묶어, 
관련된 변경사항을 함께 처리할 수 있기 때문에 유지보수하기 편함

한 컴포넌트에 변경의 이유들을 몰아넣기 때문에 변경이 다른 컴포넌트에 영향을 미치지 않음

CCP를 어길 경우 관련된 변경사항을 반영하기 위해 여러 컴포넌트를 수정해야 할 수 있음
또한, 관련된 모듈이 모여있지 않기 때문에 하나의 컴포넌트의 변경이 다른 컴포넌트에 예상치 못한 영향을 줄 수 있음

예로 FastDB
DynamoDB와 Redis 라는 두 컴포넌트가 있고, 두 컴포넌트를 정책에 따라 호출하는 모듈이 NXCharacterAPI 라는 프로젝트에 있었음

예를 들어 두 저장소 정책이 다음과 같았음
* Redis에는 최신 데이터가 있지만 최근 7일 데이터만 존재 
* DynamoDB는 30분 정도 동기화 시간이 늦지만 모든 데이터가 존재

따라서 조회하는 입장에서는 Reids 조회 후 DynamoDB 조회 가 필요, 만약 정책이 바뀐다면 거기에 맞게 조회 로직의 변경이 필요
-> 동일한 시점에 변경되지만 같은 컴포넌트가 아님
-> 정책의 변경이 다른 컴포넌트에 영향을 줌

현재는 FastDB 라는 컴포넌트 내에 저장소와 조회 로직이 함께 들어가 있어 FastDB의 변경이 외부에 영향을 미치지 않음

### CRP
함께 재사용되는 의존성이 높은 컴포넌트는 함께 묶어야 함

반대로 말하면 의존성이 높은 컴포넌트가 아니라면 함께 묶어서는 안됨

의존성이 높은 두 컴포넌트를 묶지 않는다면 재사용이 어려워 변경되는 부분을 따로 추출하거나 수정해야 할 수 있음
또한, 한 컴포넌트의 변경사항이 다른 컴포넌트에 예상치 못한 영향을 미칠 수 있음

### 컴포넌트 응집도에 대한 균형 다이어그램
CCP는 개발 가능성, REP는 유지보수성
프로젝트 초기에는 개발 가능성이 유지보수성보다 중요하지만, 상황에 따라 얼마든지 중요도가 바뀔 수 있음

변경되는 요구사항 사이에서 각 컴포넌트 사이 공통 컴포넌트 뽑아내고, 인터페이스 통일하고 하는 일이 쉬울 것 같지는 않아서 개발 가능성?

## 컴포넌트 결합
### ADP
의존성 순환이 있어서는 안된다

의존성 순환을 피하기 위한 주 단위 빌드 같은 방법은 결국 통합에 들어가는 비용이 증가할 수 밖에 없고 한계에 부딫히게 된다
그러므로 개발 환경을 개인 또는 각 팀이 감당 가능한 컴포넌트 단위로 분리한 후 각 컴포넌트 독립적으로 개발, 릴리즈 번호 관리

순환 의존성이 생긴다면 사실상 순환이 있는 컴포넌트들이 하나의 컴포넌트와 같아짐
올바른 빌드 순서 파악도 어려워지고 관리 힘들어진다

### SDP


### SAP

# 읽은 분량에 대한 소감
컴포넌트 수준이라는 것이 잘 와닫지가 않습니다
아직 개념이 잘 잡하지 않는 것 같아요

# 궁금한 내용 혹은 잘 이해되지 않은 내용