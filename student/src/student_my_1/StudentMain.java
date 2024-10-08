package student_my_1;

public class StudentMain {
	public static void main(String[] args) {
		// UI 담당
		
		// Create Read Update Delete (CRUD)
		// Read : 학번순 이름순 오름 내림
		// Delete : 학번을 입력해서 삭제
		
		
		// 필드는 private
		// 메서드는 public 
		// 생성자 public (싱글톤 일때만 private)
		
		StudentService ss = new StudentService();
		
		while(true) {

			int input = StudentUtils.nextInt("1. 조회  2.등록  3.수정  4.삭제  5.종료");
			
			switch (input) {
				case 1:
					ss.list();
					break;
				
				case 2:
					ss.add();
					break;
					
				case 3:
					ss.modify();
					break;
					
				case 4:
					ss.remove();
					break;
					
				case 5:
					ss.exit();
					System.out.println("bye");
					return;
				default:
					break;
			
			}
			
		}
		
		
	}
}
