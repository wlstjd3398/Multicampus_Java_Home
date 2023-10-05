package model;

public class TestMember {

	public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAO();
		
		MemberDO member = memberDAO.getMember("seong@gmail.com");
		System.out.printf("아이디: %s \n", member.getId());
		System.out.printf("비밀번호: %s \n", member.getPasswd());
		System.out.printf("이름: %s \n", member.getName());
		System.out.printf("등록일: %s \n", member.getRegdate());
		System.out.printf("등급: %s \n", member.getGrade());
	}
}