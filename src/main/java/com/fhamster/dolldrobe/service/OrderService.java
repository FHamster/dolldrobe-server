package com.fhamster.dolldrobe.service;

import com.fhamster.dolldrobe.dao.BasicOrderMapper;
import com.fhamster.dolldrobe.dao.DetailIOrderMapper;
import com.fhamster.dolldrobe.model.BasicOrder;
import com.fhamster.dolldrobe.model.BasicOrderExample;
import com.fhamster.dolldrobe.model.DetailIOrderExample;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Transactional
@Service
public class OrderService {
    @Autowired
    private BasicOrderMapper orderMapper;

    @Autowired
    private DetailIOrderMapper detailIOrderMapper;


    /**
     * 获取当前用户的所有订单和详单
     *
     * @param UserAcc 目标用户
     * @return 目标用户的所有订单
     */
    public List<BasicOrder> getAllOrderList(String UserAcc) throws Exception {
        List<BasicOrder> basicOrderList;

        BasicOrderExample basicOrderExample = new BasicOrderExample();
        basicOrderExample.createCriteria()
                .andUAccountnumberEqualTo(UserAcc);

        //选取该用户订单列表
        PageHelper.startPage(1, 5)
                .setOrderBy("O_CTime");
        basicOrderList = orderMapper.selectByExample(basicOrderExample);


        //获取订单列表的详单记录
        DetailIOrderExample detailIOrderExample = new DetailIOrderExample();
        detailIOrderExample.createCriteria()
                .andONumIn(
                        basicOrderList.stream()
                                .map(BasicOrder::getoNum)
                                .collect(Collectors.toList())
                );
        detailIOrderMapper.selectByExample(detailIOrderExample);

        return basicOrderList;


    }

}
