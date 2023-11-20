package com.springboot.omem.crawling.repository;

import com.springboot.omem.crawling.entity.BlogMetaInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogMetaInfoRepository extends JpaRepository<BlogMetaInfo, Long> {
}
