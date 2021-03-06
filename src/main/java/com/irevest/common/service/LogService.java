package com.irevest.common.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.irevest.common.domain.LogDO;
import com.irevest.common.domain.PageDO;
import com.irevest.common.utils.Query;
@Service
public interface LogService {
	void save(LogDO logDO);
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
