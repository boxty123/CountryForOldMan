//package com.cbnusoftandriod.countryforoldman;
//
//import android.Manifest;
//import android.content.pm.PackageManager;
//import android.os.Bundle;
//import android.telephony.SmsManager;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.app.ActivityCompat;
//import androidx.core.content.ContextCompat;
//
//import com.cbnusoftandriod.countryforoldman.model.Order;
//
//public class MessageActivity extends AppCompatActivity {
//
//    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS = 1;
//
//    Order order=new Order(MessageActivity.this);
//    String phonenumber=order.getPhonenumber();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_message);
//
//        if (ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS)
//                != PackageManager.PERMISSION_GRANTED) {
//            ActivityCompat.requestPermissions(this,
//                    new String[]{Manifest.permission.SEND_SMS}, MY_PERMISSIONS_REQUEST_SEND_SMS);
//        } else {
//            sendFormattedSMS(order);
//        }
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        if (requestCode == MY_PERMISSIONS_REQUEST_SEND_SMS) {
//            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//
//                sendFormattedSMS(order);
//            } else {
//                Toast.makeText(this, "SMS permission denied", Toast.LENGTH_SHORT).show();
//            }
//        }
//    }
//
//    private void sendFormattedSMS(Order order) {
//        String message = String.format("주소: %s\n"+"메뉴: %s\n"+"결제방식: %s\n"+"가격: %s\n"+"요청사항: %s\n"+"맛있게 해드릴게요!",
//                order.getAddress(),
//                order.getMenu(),
//                order.getPay(),
//                order.getPrice(),
//                order.getUserReq());
//        sendSMS(order.getPhonenumber(), message);
//    }
//
//    private void sendSMS(String phoneNumber, String message) {
//        SmsManager smsManager = SmsManager.getDefault();
//        smsManager.sendTextMessage(phoneNumber, null, message, null, null);
//        Toast.makeText(this, "SMS sent!", Toast.LENGTH_SHORT).show();
//    }
//}
//
