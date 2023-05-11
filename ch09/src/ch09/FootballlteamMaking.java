package ch09;

public class FootballlteamMaking {
  public static void main(String[] args) {
    Footballteam player_01 = new Footballteam(); // Footballteam 클래스로부터 객체 생성
    player_01.이름 = "손흥민";
    player_01.등번호 = 7; // 등번호는 정수형
    player_01.포지션 = "공격수";
    player_01.패스하기(); // 패스하기 메소드 호출
    System.out.println("이름: " + player_01.이름);
    System.out.println("등번호: " + player_01.등번호); // 자동으로 문자열로 형변환 하여 출력된다. 
    System.out.println("포지션: " + player_01.포지션);

    Footballteam player_02 = new Footballteam(); // Footballteam 클래스로부터 객체 생성
    player_02.이름 = "김병지";
    player_02.등번호 = 8; 
    player_02.포지션 = "골키퍼";
    player_02.패스하기(); 
  } 
  /* 클래스를 잘 만들어 두면 재사용이 가능하다. */
}


