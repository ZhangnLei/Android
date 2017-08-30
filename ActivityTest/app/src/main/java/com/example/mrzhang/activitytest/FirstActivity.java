package com.example.mrzhang.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("FirstActivity","Task id is "+ getTaskId());
        setContentView(R.layout.first_layout);//将layout加载到主函数中
        Button button1 = (Button) findViewById(R.id.buton_1);//调用 fingViewById 方法获得一个 View 对象, 将其转化为 Button
        button1.setOnClickListener(new View.OnClickListener(){ //添加 监听器
            @Override
            public void onClick(View v){
                //返回数据给上一个活动
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);//
                startActivityForResult(intent,1); // 使用 startActivityForResult() 方法来启动 SecondActivity, 1 是请求码(只要是一个唯一值就行)
//                Log.d("sout","跳转到button2");
//                Toast.makeText(FirstActivity.this,"You clicked Button 1",Toast.LENGTH_SHORT).show();//使用 Toast 提醒,
            }
        });
    }

    /**
     * 添加菜单<屏幕右上角的三个省略号即菜单>(使用重写方法)
     * @param menu
     * @return
     */
    @Override //通过 Ctrl + O 重写方法
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);//通过 getMenuInflater() 方法得到 MenuInflater 的对象,在调用他的inflate()方法就可以给当前活动创建菜单
        // 其包含两个参数: 1.通过那个资源文件来创建菜单 2.指定菜单项将添加到哪一个Menu 对象中,这里直接用 onCreateOptionsMenu() 方法中传入的 menu 参数
        return true; //返回 true 表示允许创建的菜单显示出来
    }


    /**
     * 添加菜单点击响应事件(使用重写方法)
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){ // 通过 item.getItemId() 来判断 点击的是哪一个菜单项
            case R.id.add_item:
                Toast.makeText(this,"you clicked add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"you clicket remove",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }


    /**
     * 获取下一个活动中 返回来的数据 (重写)
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 1:
                if (resultCode == RESULT_OK){
                    String returnedDate = data.getStringExtra("data_return");
                    Log.d("FirstActivity",returnedDate);
                }
                break;
            default:
        }
    }



}
