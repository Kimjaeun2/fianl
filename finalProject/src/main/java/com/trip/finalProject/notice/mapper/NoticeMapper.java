package com.trip.finalProject.notice.mapper;


import java.util.List;
import com.trip.finalProject.common.PagingVO;
import com.trip.finalProject.notice.service.NoticeVO;

public interface NoticeMapper {
	
	public NoticeVO insertpost(NoticeVO noticeVO);

	public List<NoticeVO> boardSelectList(NoticeVO vo) ;
	
	//리스트 화면에 뿌리기. 일반회원,로그아웃,권한신청중; T1(공개)N1(전체), 검색전은 가이드도 동일
	public List<NoticeVO> SelectAllNoticeList(PagingVO pagingVO);
	
	/*
	 * //리스트 화면에 뿌리기. 가이드; T1(공개)N1(전체) public List<NoticeVO>
	 * SelectByGuideNoticeList(PagingVO pagingVO);
	 */
	
	//리스트 화면에 뿌리기 by 관리자
	public List<NoticeVO> SelectByAdminNoticeList(PagingVO pagingVO);  
	
	//공지사항 작성
	public int noticeInsert(NoticeVO vo);
	
	// 전체 게시글 수 카운트(일반회원, 로그아웃상태, 권한신청중)
	public int getAllNoticeCount();
	
	//전체 게시글 수 카운트 (가이드)
	public int getGuideNoticeCount();
	
	//전체 게시글 수 카운트 (관리자)
	public int getAdminNoticeCount();
	
	//게시글 상세조회
	public NoticeVO getNoticeDetail(NoticeVO vo);
	
	//게시글 조회수 증가
	public int updateNoticetHit(NoticeVO vo);
	
	// 게시물 수정하기
	public int modifyNoticeInfo(NoticeVO vo);
	
	//글 속성이 공지사항인 총 결과값 카운트
	public int countNoticeType1n();
	//글 속성이 이벤트인 총 결과값 카운트
	public int countNoticeType2n();
	
	//공지사항 제목으로 게시글 검색
	public List<NoticeVO> searchByNoticeByTitle1n(NoticeVO noticeVO,PagingVO pagingVO);
	
	//이벤트 제목으로 게시글 검색
	public List<NoticeVO> searchByNoticeByTitle2n(NoticeVO noticeVO,PagingVO pagingVO);
	
	public void noticeDelete(NoticeVO vo);
	
	public int boardUpdate(NoticeVO vo);
	
	public int boardDelete(NoticeVO vo);
	
	public int boardSelectMax(NoticeVO vo);
	
	public NoticeVO boardDetail(NoticeVO vo);
	
	public int boardView(NoticeVO vo);
	
	public int boardReple(NoticeVO vo);

	
	
	


	
	
}