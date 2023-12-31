package com.trip.finalProject.specialties.service;

import java.util.List;
import java.util.Map;

import com.trip.finalProject.common.PagingVO;
import com.trip.finalProject.location.service.LocationVO;

public interface SpecialtiesService {
	
	
	
	
	//특산물 리스트
	public List<SpecialtiesVO> getSpecialtiesList(PagingVO pagingVO);
	
	//특산물 등록
	public void insertSepcialties(SpecialtiesVO specialtiesVO);
	
	//지역 코드 리스트
	public List<LocationVO> getLocationList();
	
	//특산물 옵션 리스트
	public List<SpecialtiesOptionVO> getOptionList(String postId);

	//특산물 정보
	public SpecialtiesVO getSpecialtiesInfo(String postId);
	
	//0904 창민 추가
	//특산물 전체 조회
	public Map<String, Object> selectAllSpecial(Integer nowPage, Integer cntPerPage);

	public int specialitesCount();

	public int specialtiesCountTitle(String keyword);

	public List<SpecialtiesVO> searchspecialtiesByTitle(SpecialtiesVO specialtiesVO, PagingVO pagingVO);

	public void updateSepcialties(SpecialtiesVO specialtiesVO);


}
