package com.nine.yome.unit.test;

/**
 * ユニットテスト用に作成したAndroidアプリケーション
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    
    private EditText    mEditTextFrom;  //エディットテキスト
    private TextView    mTextViewTo;    //テキストビュー
    private Button      mCopyButton;    //コピーボタン
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mEditTextFrom = (EditText) findViewById(R.id.EditTextFrom);
        mTextViewTo = (TextView) findViewById(R.id.EditTextTo);
        mCopyButton = (Button) findViewById(R.id.ButtonCopy);

        mCopyButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                mTextViewTo.setText(mEditTextFrom.getText().toString());
            }
        });
        
        
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if(mEditTextFrom.getText().toString().length() == 0) {
            mCopyButton.setEnabled(false);
        } else {
            mCopyButton.setEnabled(true);
        }
        
        return super.onKeyUp(keyCode, event);
    }
}