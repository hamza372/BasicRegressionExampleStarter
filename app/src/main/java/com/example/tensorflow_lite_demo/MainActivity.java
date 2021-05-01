package com.example.tensorflow_lite_demo;

import android.content.res.AssetFileDescriptor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final TextView result = findViewById(R.id.textView);
        final EditText editText = findViewById(R.id.editText);
        Button run = findViewById(R.id.button);

        run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }



//    private MappedByteBuffer loadModelFile() throws IOException
//    {
//        AssetFileDescriptor assetFileDescriptor = this.getAssets().openFd("linear.tflite");
//        FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
//        FileChannel fileChannel = fileInputStream.getChannel();
//        long startOffset = assetFileDescriptor.getStartOffset();
//        long length = assetFileDescriptor.getLength();
//        return  fileChannel.map(FileChannel.MapMode.READ_ONLY,startOffset,length);
//    }



}

