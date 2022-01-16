package com.example.mkauto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.mkauto.model.dao.ItpCrowdRecordDAO;
import com.example.mkauto.model.entity.ItpCrowdRecordDO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.statemachine.StateMachine;

import java.util.List;

@SpringBootTest
class MkAutoApplicationTests {

    @Autowired
    private StateMachine<States, Events> stateMachine;

    @Autowired
    private ItpCrowdRecordDAO dao;

    @Test
    void contextLoads() {
        stateMachine.start();
        stateMachine.sendEvent(Events.PAY);
        stateMachine.sendEvent(Events.RECEIVE);
    }

    @Test
    void test() {
        ItpCrowdRecordDO itpCrowdRecordDO = new ItpCrowdRecordDO();
        itpCrowdRecordDO.setTaskId(49L);
        itpCrowdRecordDO.setPhone("13895969926");

        dao.saveOrUpdate(itpCrowdRecordDO);

        LambdaQueryWrapper<ItpCrowdRecordDO> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(ItpCrowdRecordDO::getTaskId, 1);
        List<ItpCrowdRecordDO> list = dao.list(queryWrapper);
        //System.out.println(JSON.toJSONString(list));
    }

}
