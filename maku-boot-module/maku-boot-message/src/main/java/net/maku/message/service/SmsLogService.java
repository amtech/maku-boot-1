package net.maku.message.service;

import net.maku.framework.common.page.PageResult;
import net.maku.framework.common.service.BaseService;
import net.maku.message.entity.SmsLogEntity;
import net.maku.message.query.SmsLogQuery;
import net.maku.message.vo.SmsLogVO;

/**
 * 短信日志
 */
public interface SmsLogService extends BaseService<SmsLogEntity> {

    PageResult<SmsLogVO> page(SmsLogQuery query);

}