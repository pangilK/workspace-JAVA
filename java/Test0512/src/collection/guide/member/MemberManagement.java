package collection.guide.member;

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
			System.out.println("메뉴 선택 > ");
			
			if(!sc.hasNextInt()){
				System.out.println("번호를 입력해주세요. ");
				sc.next();
				continue;
			}

			selectNo = sc.nextInt();
			switch (selectNo) {
				case 1:
					System.out.println("== 회원가입 == ");
					join();
					break;
				case 2:
					System.out.println("== 로그인 == ");
					login();
					break;
				case 3:
					System.out.println("== 회원목록 == ");
					select();
					break;
				case 4:
					System.out.println("== 회원정보수정 == ");
					update();
					break;
				case 5:
					System.out.println("== 회원탈퇴 == ");
					delete();
					break;
				case 6:
					System.out.println("== 종료 == ");
					terminate();
					break;
				default:
					System.out.println("선택할 수 없는 번호입니다.");
			}
		}
	}

	@Override
	protected void terminate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void join() {
		System.out.println("아이디를 입력해주세요 > ");
		String id = sc.next();
		System.out.println("비밀번호를 입력해주세요 > ");
		String pw = sc.next();
		System.out.println("비밀번호를 한번 더 입력해주세요 >");
		String rePw = sc.next();
		// 아이디 중복 체크 , 비밀번호 일치 체크
		if(!memberIdCheck(id) || !pw.equals(rePw)) {
			// 사용할 수 없는 중복 아이디
			System.err.println("사용할수없는 아이디 이거나 비밀번호가 일치하지 않습니다.");
			return;
		}
		System.out.println("이름을 입력해주세요 > ");
		String name = sc.next();
		
		
		memberList.add(new Member(number++,name,id,pw,System.currentTimeMillis()));
		System.err.println("회원가입 완료");
		System.out.println(memberList);
	}

	@Override
	protected void login() {
		System.out.println("아이디를 입력해주세요 > ");
		String mId = sc.next();
		System.out.println("비밀번호를 입력해주세요 >");
		String mPw = sc.next();
		Member member = new Member(mId,mPw);
		findMember(member);
		
		if(findMember(member) == null) {
			System.out.println("일치하는 사용자 존재가 정보하지 않습니다.");
			return;
		}
			System.out.println("정상적으로 로그인되었습니다.");
			loginMember = member;
			System.out.println(loginMember);			
		
		
		if(loginMember == master) {
			System.out.println("관리자 계정");
		}
		
	}

	@Override
	protected void select() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void deleteMember() {
		// TODO Auto-generated method stub
		
	}
	
}
