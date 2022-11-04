### 간단 정리
1. 싱글스레드에선  IO가 발생하는 순간 다음 작업이 진행되지 않는다.
동기처리(synchronized block)가 되어있기 때문

2. 스레드를 생성할 땐 thread 클래스를 상속받는 사용자 정의 쓰레드를 만들던가 Runnable 인터페이스 구현체를 만들어 Thread 클래스에 주입해주어야 한다.  

Runnable의 경우는 Thread가 특정 Class를 상속해야할 때 사용하는 것이 적합하고 
Thread를 상속받는 경우가 일반적인 케이스이다.


