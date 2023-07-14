package guide.member;
 
/**
 * AppBase의 기능을 구현한 자식 class
 * AppBase의 기능을 상속받아 제시된 기능을 완성하시오.
 */
public class MemberManagement  extends AppBase
{

	@Override
	protected void isRun() {
		System.out.println("프로그램 시작!");
		while (isRun) {
			System.out.println("===========================================================");
			System.out.println("1.회원가입 |2.로그인 |3.회원목록|4.회원정보수정|5.회원탈퇴|6.프로그램종료");
			System.out.println("===========================================================");
			
			selectNo = getNumberData("메뉴 선택 > ");
			
			switch(selectNo) {
				case 1 :
					System.out.println("== 회원가입 ==");
					join();
					break;
				case 2 :
					System.out.println("== 로그인 ==");
					login();
					break;
				case 3 : 
					System.out.println("== 회원정보 ==");
					select();
					break;
				case 4 :
					System.out.println("== 회원정보 수정 ==");
					update();
					break;
				case 5 :
					System.out.println("== 회원탈퇴 ==");
					delete();
					break;
				case 6 :
					System.out.println("== 프로그램 종료 ==");
					terminate();
					break;
				default : 
					System.out.println("해당 메뉴가 존재하지 않습니다.");
			} // end switch;
		
		} // end while;
	}
	@Override
	protected void terminate() {
		isRun = false;
	}

	@Override
	protected void join() {
		
		while(true) {
			
			String mId;
			mId = getStringData("아이디를 입력해주세요 > ");
			// 아이디 중복 체크
			if(!memberIdCheck(mId)) {
				System.out.println("사용할 수 없는 아이디입니다. 다시 입력해주세요.");
				continue;
			}
			
			String pw,rePw;
			while(true) {
				pw = getStringData("비밀번호를 입력해주세요 > ");
				rePw = getStringData("비밀번호를 한번 더 입력해 주세요 > ");
				if(!pw.equals(rePw)) {
					System.out.println("비밀번호가 일치하지 않습니다.");
					continue;
				}
				break;
			}
			
			String name = getStringData("이름을 입력해 주세요 > ");
			Member member = new Member(number++,name,mId,pw,System.currentTimeMillis());
			memberList.add(member);
			System.out.println("회원가입이 완료되었습니다.");
			break;
		}
		
	}

	@Override
	protected void login() {
		// id pw가 일치하는 사용자 정보 검색
		String mId = getStringData("아이디를 입력해주세요 > ");
		String mPw = getStringData("비밀번호를 입력해주세요 > ");
		Member member = findMember(new Member(mId,mPw));
		
		if(member == null) {
			System.out.println("일치하는 회원 정보가 없습니다.(로그인 실패)");
			return;
		}
		
		loginMember = member;
		System.out.println("정상적으로 로그인되었습니다.");
		System.out.println(loginMember);	
		
		if(loginMember.equals(master)) {
			System.err.println("관리자 계정입니다.");
		}
		
	}

	@Override
	protected void select() {
		
		if(loginMember == null) {
			System.out.println("로그인 이후 사용할수있는 메뉴입니다.");
			return;
		}
		if(loginMember.equals(master)) {
			for(Member m : memberList) {
				System.out.println(m);
			}
		}else {
			System.err.println(loginMember);
		}
		
	}

	@Override
	protected void update() {
		// 일반회원 - 개인정보 수정
		// 관리자 - 전체회원 정보 수정
		if(loginMember == null) {
			System.out.println("로그인 후 사용가능한 메뉴입니다.");
			return;
		}
		
		if(loginMember.equals(master)) {
			// 관리자 계정
			System.out.println("== 관리자 회원정보 수정");
			select();
			int mNum = getNumberData("수정할 회원의 번호를 입력해 주세요 > ");
			for(Member m : memberList) {
				// 회원 목록에서 회원번호가 일치하는 Member 정보 검색
				if(m.getmNum() == mNum) {
					String name = getStringData("수정할 회원의 이름을 입력해주세요 > ");
					m.setmName(name);
					System.err.println("수정 완료");
					return;
				}
			}
			System.out.println("수정할 회원 정보를 찾지 못했습니다.");
		}else {
			// 일반 회원
			System.out.println("== 내 정보 수정 ==");
			String pw = getStringData("비밀번호를 한번 더 입력해주세요 > ");
			if(!loginMember.getmPw().equals(pw)) {
				System.out.println("비밀번호가 일치하지 않습니다.");
				return;
			}
			String name = getStringData("수정할 이름을 입력해주세요 > ");
			loginMember.setmName(name);
			System.err.println("수정이 완료되었습니다.");
			System.out.println(loginMember);
		}
		
	}

	@Override
	protected void delete() {
		if(master.equals(loginMember)) {
			System.out.println("회원정보를 삭제 할 수 없습니다.");
			return;
		}
		
		String answer = getStringData("정말로 삭제하시겠습니까? y/n");
		if(answer.equals("y")) {
			deleteMember();
		}else {
			System.out.println("회원 정보 삭제(탈퇴)가 취소되었습니다.");
		}
		
	}

	@Override
	protected void deleteMember() {
		memberList.remove(loginMember);
		loginMember = null;
		System.out.println("회원 탈퇴 완료");
	}

}
