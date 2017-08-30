package com.example.mrzhang.uiwidgetest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Process;
import android.preference.DialogPreference;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    private EditText editText;
//    private ImageView imageView;
//    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.hide();
        }
//        Button button = (Button) findViewById(R.id.button1);
//        imageView = (ImageView) findViewById(R.id.image_view);
//        editText = (EditText) findViewById(R.id.edit_text);
//        progressBar = (ProgressBar) findViewById(R.id.process_bar);


//        button.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//
//
//                Toast.makeText(MainActivity.this,"hello",Toast.LENGTH_SHORT).show();//将输入的文字打印出来
//
////
////                Intent intent = new Intent(MainActivity.this,Send.class);
////                startActivity(intent);
////
////
////
////                //弹出一个对话框,显示进度条
////                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
////                progressDialog.setTitle("This is ProgressDialog");
////                progressDialog.setMessage("Loading...");
////                progressDialog.setCancelable(true);
////                progressDialog.show();
////
////
////
////
////
////                //弹出对话框
////                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
////                dialog.setTitle("This is Dialog"); //标题
////                dialog.setMessage("Somethisng important.");
////                dialog.setCancelable(false);//可撤销的
////                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener(){ //添加确定按钮点击事件
////                    @Override
////                    public void onClick(DialogInterface dialog, int which) {
////                    }
////                });
////                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() { //添加取消按钮点击事件
////                    @Override
////                    public void onClick(DialogInterface dialog, int which) {
////
////                    }
////                });
////                dialog.show();
////
////
////
////
////
////                //直线型 进度条
////                int progress = progressBar.getProgress();
////                progress = progress + 10;
////                progressBar.setProgress(progress);
////
////
////
////                //圆形 进度条
////                if (progressBar.getVisibility() ==View.GONE){ // 判断进度条是否显示,不显示就将其设为 可见 ,否则就设为不可见
////                    progressBar.setVisibility(View.VISIBLE);
////                }
////                else {
////                    progressBar.setVisibility(View.GONE);
////                }
////
////
////
////                imageView.setImageResource(R.drawable.img_2);//将图片更换为 image2
////
////
////
////                String inputText = editText.getText().toString();//获取输入的文字
////                Toast.makeText(MainActivity.this,inputText,Toast.LENGTH_SHORT).show();//将输入的文字打印出来
//            }
//        });
    }
}
