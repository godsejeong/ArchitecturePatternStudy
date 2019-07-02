# RxJava

### Map
  * flatMap
     - 데이터를 변형하고 Observable로 반환      
  * concatMap
     - flatMap랑 동일하지만 순서를 유지 하고 있음, 이전에 방출된 아이템이 처리중이면 끝날때까지 대기함
  * switchMap
     - 새로운 아이템이 방출될때 마다 이전의 Observable를 취소하고 현재 항목만 방출함
     
### Publish

  * publishSubject
      - Observable과 Observer을 모구 구현하고 있는 클래스
  * PublishProcessor
      - Asdf

### Schedulers
  * observableOn
    -  subscribeOn이후에 작업해야 될 쓰레드로 스케줄러를 변경

    - Schedulers.computation() 이벤트 룹에서 간단한 연산이나 콜백 처리를 위해 사용됩니다.,RxComputationThreadPool라는 별도의 스레드 풀에서 돌아감.

    - Schedulers.io() 기 I/O를 별도로 처리시켜 비동기 효율을 얻기 위한 스케줄러입니다.자체적인 스레드 풀 CachedThreadPool을 사용합니다. API 호출 등 네트워크를 사용한 호출 시 사용.

  * subscribeOn
    - Observable의 작업을 하는 쓰레드를 지정,여러개일 경우 마지막에 적힌 쓰레드에서 시작
	
❗️참고 : https://tiii.tistory.com/18
### Debounce
  
    Ex) debounce(300,TimeUnit.MILLISECONDS)
    300밀리세컨드 중에서 가장 마지막에 눌린걸 처리함

### distinctUntilChanged

	 변화가 있을때만 호출

### Filter

	true를 반환할때만 subscribe에서 데이터를 처리함

### MissingBackpressureException

	 MissingBackpressureException은 Observable에서 항목(item)을 보내는(emit) 속도보다 처리하는 속도가 느릴 때 발생함

 * onBackpressureDrop
    - Observable에서 바로 처리하지 못한 데이터는 무시함
 * onBackpressureBuffer
    -  큐를 쌓아 해당항목을 나중에 처리 할 수 있도록 해줌 onBackpressureBuffer(int)를 사용하여 쌓을수 있는 항목들을 제한 할 수 있음

❗️참고 : https://www.androidhuman.com/community/2016/02/08/gdg_korea_android_weekly_02_1/

### CompositeDisposable

    - 라이프사이클에 따라 구독을 해제할수 있음

### compose
    - 중복되어 있는걸 공통함수로 빼고 compose를 통해서 적용시킬수 있음

