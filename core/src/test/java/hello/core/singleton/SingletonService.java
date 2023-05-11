package hello.core.singleton;

public class SingletonService {

        //자기 자신을 private static으로 가지고 있음
        private static final SingletonService instance = new SingletonService();

        //자기 자신을 public static으로 가지고 있음
        public static SingletonService getInstance() {
            return instance;
        }

        //생성자를 private으로 선언해서 외부에서 new 키워드로 객체 생성을 못하게 막음
        private SingletonService() {
        }

        public void logic() {
            System.out.println("싱글톤 객체 로직 호출");
        }
}
