package member;

import java.util.Scanner;

public class MemberManagement{

	// 사용자 입력
	Scanner sc = new Scanner(System.in);
	
	// 회원정보 저장
	Member[] members = new Member[100];
	int mNum = 1;
	
	// 관리자 계정
	Member master = new Member(100,"master","root","root");
	
	// 로그인한 회원
	Member loginMember = null;
	
	// 프로그램 flag (true : 진행 , false : 종료) 
	boolean isRun = true;
	
	// 메뉴 번호 선택
	int selectNo;

	// 프로그램 실행용 생성자
	MemberManagement() {
		// 회원목록 배열 마지막 인덱스에 관리자 계정 저장
		members[members.length-1] = master;
		// 회원관리 메소드 호출
		isRun();
	}
	
	/*
	 * 기능 관리 
	 */
	
	// 프로그램 실행
	void isRun() {
		while(isRun) {
			System.out.println("===========================================================");
			System.out.println("1.회원가입|2.로그인|3.회원목록|4.회원정보수정|5.회원탈퇴|6.프로그램 종료");
			System.out.println("===========================================================");
			System.out.println("메뉴 선택 > ");
			
			if(!sc.hasNextInt()) {
				System.out.println("번호를 입력해주세요>");
				sc.next();
				continue;
			}
			selectNo = sc.nextInt();
			switch(selectNo) {
				case 1 : 
					System.out.println("== 회원가입 == ");
					join();
					break;
				case 2 : 
					System.out.println("== 로그인 == ");
					login();
					break;
				case 3 : 
					System.out.println("== 회원목록 == ");
						select();						
					break;
				case 4 : 
					System.out.println("== 회원정보수정 == ");
					update();
					break;
				case 5 : 
					System.out.println("== 회원탈퇴 == ");
					delete();
					break;
				case 6 : 
					System.out.println("== 종료 == ");
					terminate();
					break;
				default :
					System.out.println("선택할 수 없는 번호입니다.");
			} // switch 종료
		} // while 종료
	} // run 종료
	
	// 프로그램 종료
	void terminate() {
		
	}

	// 회원 가입
	void join() {
		System.out.println("아이디를 입력해주세요 > ");
		String mId = sc.next();
		if(memberIdCheck(mId) == true) {
			System.out.println("비밀번호를 입력해주세요 > ");
			String mPw = sc.next();
			System.out.println("비밀번호를 확인해주세요 >");
			String mPw2 = sc.next();
			if(mPw.equals(mPw2) == true) {
				System.out.println("이름을 입력해주세요 >");
				String mName = sc.next();
				members[mNum] = new Member(mNum,mName,mId,mPw);
				mNum++;
				System.out.println("회원가입 완료");
			}else {
				System.out.println("비밀번호가 일치하지않습니다.");
			}
			
		}else {
			System.out.println("이미 사용중인 아이디입니다.");
		}
		
	}
	
	// 로그인
	void login() {
		System.out.println("아이디를 입력해주세요 > ");
		String id = sc.next();
		System.out.println("비밀번호를 입력해주세요 > ");
		String pw = sc.next();
//		for(int i = 0 ; i<members.length ; i++) {
//			if(members[i] != null && members[i].mId.equals(id)) {
//				if(members[i].mPw.equals(pw)) {
//					System.out.println("정상적으로 로그인되었습니다.");
//					System.out.println(members[i].toString());
//				}else {
//					System.out.println("비밀번호가 일치하지 않습니다.");
//				}
//			}else if(members[i] != null && members[i] == findMember(master)) {
//				if(members[i].mPw.equals(pw)) {
//					System.out.println("관리자 계정입니다.");
//				}
//			}
//		}
		loginMember = new Member(id,pw);
		
		Member login = findMember(loginMember);
		
		if(login != null && master == login) {
			System.out.println("관리자 계정입니다");
			loginMember = login;
		}else if(login != null) {
			System.out.println(login);
			System.out.println("로그인 되었습니다");
			loginMember = login;
		}else {
			System.out.println("일치하는 멤버가 없습니다");
		}
	}

	// 회원목록 - 로그인한 회원이 관리자 일때만 노출 
	void select() {
		
		if(loginMember.mNum == 100) {
			for(int i = 0 ; i<members.length; i++) {
				if(members[i] != null) {
					System.out.println(members[i]);				
				}
			}
		}else {
			System.out.println("관리자만 확인가능한 메뉴입니다.");
		}
	}
	
	// 회원정보 수정 - 로그인한 회원 정보랑 일치 하거나 관리자 일때만 수정(이름정보만 수정)
	void update() {
		
	}
	
	// 회원탈퇴 - 삭제 할려는 정보가 본인 정보일때만 삭제
	void delete() {
		
	}
	
	// 사용자 아이디 중복 체크 - 동일한 아이디 값으로 등록된 회원 정보 검색
	// 이미 존재하는 아이디 일경우 : false, 사용가능한 아이디 일 경우 : true
	boolean memberIdCheck(String mId) {
		for(Member m : members) {
			if(m != null && m.mId.equals(mId)) {
				return false;
			}
		}		
		return true;
	}
	
	// 회원 아이디와 비밀번호로 회원 찾기
	Member findMember(Member m) {
		for(Member member : members) {
			if(member != null && member.equals(m)) {
				return member;
			}
		}
		return null;
	}
	
	// 회원 정보 삭제
	void deleteMember() {
		for(int i=0; i<members.length; i++) {
			if(members[i].equals(loginMember)) {
				members[i] = null;
				loginMember = null;
				System.out.println("회원탈퇴 완료");
				return;
			}
		}
	}
}
