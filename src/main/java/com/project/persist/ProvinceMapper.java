package com.project.persist;

import com.project.model.DO.ProvinceDO;

/**
 * @author lingjun.jlj
 * @date 2017/12/2
 */
public interface ProvinceMapper {

    Long addProvince(ProvinceDO province);

    ProvinceDO selectProvinceById(Long id);
}
