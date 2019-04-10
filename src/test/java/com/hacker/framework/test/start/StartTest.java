package com.hacker.framework.test.start;

import com.alibaba.fastjson.JSON;
import com.hacker.framework.service.CommonQueryParam;
import com.hacker.framework.service.CommonQueryResult;
import com.hacker.framework.service.CommonQueryService;
import com.hacker.framework.test.base.CommonBaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by  on 2019/4/7 0007.
 */
public class StartTest extends CommonBaseTest{

    @Autowired
    private CommonQueryService commonQueryService;

    @Test
    public void startTest(){
        CommonQueryParam commonQueryParam = new CommonQueryParam();
        commonQueryParam.setServiceName("JXL_BEESCORE");
        Map<String, String> queryConditions = new LinkedHashMap<>();
        queryConditions.put("id_card", "150422199112095117");
        queryConditions.put("phone", "18368116334");
        queryConditions.put("name", "zhangsan");
        commonQueryParam.setQueryConditions(queryConditions);

        CommonQueryResult commonQueryResult = commonQueryService.query(commonQueryParam);
        Assert.assertNotNull(commonQueryResult.getResultMap());

        System.out.println(JSON.toJSON(commonQueryResult));
    }
}