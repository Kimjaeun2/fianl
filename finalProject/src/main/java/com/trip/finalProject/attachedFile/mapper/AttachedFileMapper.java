package com.trip.finalProject.attachedFile.mapper;

import java.util.List;

import com.trip.finalProject.attachedFile.service.AttachedFileVO;

public interface AttachedFileMapper {
	public void insertAttachedFile(AttachedFileVO attachedFileVO);

	public List<AttachedFileVO> findByPostId(AttachedFileVO vo);

	public void delete(String postId);
}
