package com.cbnusoftandriod.countryforoldman.repository;


import android.content.Context;
import android.widget.Toast;

import com.cbnusoftandriod.countryforoldman.DAO.OrderDAO;
import com.cbnusoftandriod.countryforoldman.MainActivity;
import com.cbnusoftandriod.countryforoldman.model.Order;
import com.cbnusoftandriod.countryforoldman.model.User;

public class OrderRepository {
    private DatabaseHelper databaseHelper;
    private OrderDAO orderDAO;
    private Context context;

    public OrderRepository(Context context) {
        this.context = context;
        databaseHelper = DatabaseHelper.getInstance(context);
        orderDAO = OrderDAO.getInstance(context); // context 전달하여 초기화
    }
    public long registerOrder(String menu,String pay,String price,String userReq) {
        // User 객체 생성
        User user= MainActivity.getUser();
        if(user==null){
            Toast.makeText(context, "로그인 정보가 필요합니다.", Toast.LENGTH_SHORT).show();
            return -1;
        }

        Order order = new Order(user,menu,pay,price,userReq);
        // UserDAO를 사용하여 데이터베이스에 사용자 추가
        return orderDAO.insert(order);
    }
}
