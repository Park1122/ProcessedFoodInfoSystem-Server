package com.plim.plimserver.domain.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plim.plimserver.domain.post.domain.PostImage;

public interface PostImageRepository extends JpaRepository<PostImage, Long>{

}
