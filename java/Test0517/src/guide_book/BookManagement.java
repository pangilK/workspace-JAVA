package guide_book;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.List;


public class BookManagement  extends AppBase
{
	
	public static void main(String[] args) {
		new BookManagement();
	}

	@Override
	public void registerBook() {
		System.out.println("1. 도서등록");
		String title = getData("등록할 도서의 제목을 입력해주세요");
		String author = getData("등록할 도서의 저자를 입력해주세요");
//		for(int i = 0 ; i < bookList.size(); i++) {
//			if(bookList.get(i).getTitle().equals(title)) {
//				System.out.println("동일한 제목의 책이 존재합니다.");
//				return;
//			}
//		}
		Book book = new Book(count,title,author,System.currentTimeMillis());
		if(bookList.contains(book)) {
			System.out.println("동일한 제목의 책이 존재합니다.");
			return;
		}
		
		bookList.add(book);
		count++;
		System.out.println("등록 완료");
	}

	@Override
	public void selectBook() {
		System.out.println("2. 도서목록");
		if(bookList.size() == 0) {
			System.out.println("책이 없습니다");
			return;
		}else {
			for(Book b : bookList) {
				System.out.println(b);
			}			
		}
		
	}

	@Override
	public void updateBook() {
		System.out.println("3. 도서수정");
		int num = getNum("수정하실 책 관리번호를 입력해주세요");
		Book book = findBook(num);
		if(book == null) {
			System.out.println("책이 존재하지 않습니다.");
			return;
		};
		
		System.out.println(book);
		a : while(true) {
			System.out.println("=====================");
			System.out.println("1.제목수정 | 2.저자수정 | 3.입력완료");
			System.out.println("=====================");
			int sNum = getNum("번호 입력 >");
			switch(sNum) {
				case 1 :
					System.out.println("제목 수정");
					String title = getData("제목 입력 >");
					book.setTitle(title);
					System.out.println("제목 수정 완료");
					break;
				case 2 :
					System.out.println("저자수정");
					String author = getData("저자 입력 >");
					book.setAuthor(author);
					System.out.println("저자 수정 완료");
					break;
				case 3 : 
					System.out.println("수정 완료");
					break a;
				default :
					System.out.println("등록된 메뉴가 아닙니다.");
					break;
				}
		}

	}

	@Override
	public void deleteBook() {
		System.out.println("4. 도서 삭제 > ");
		int num = getNum("삭제할 도서의 관리번호를 입력해주세요");
		Book book = findBook(num);
		if(book == null) {
			System.out.println("삭제할 책이 존재하지않거나 번호를 잘못 입력하셨습니다.");
			return;
		};
		bookList.remove(book);
		System.out.println("삭제 완료");
	}

	@Override
	public void saveBook() {
		try {
			FileOutputStream fos = new FileOutputStream("book.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(bookList);
			oos.flush();
			oos.close();
		}catch (IOException e) {
			System.out.println("저장 실패 : " + e.getMessage());;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void readFileBookList() {
		try {
			FileInputStream fis = new FileInputStream("book.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// 리스트타입으로 데이터를넣어서 리스트로 반환해야댐
			bookList = (List<Book>) ois.readObject();
			
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			isRun = true;
			System.out.println(bookList.size()+"개의 책이 등록되어 있습니다.");		
			if(!bookList.isEmpty()) {
				Collections.sort(bookList);
				count = bookList.get(0).getNum();
			}
			count++;
		}
		
	}

}




