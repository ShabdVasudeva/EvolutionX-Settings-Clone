package org.codeaurora.evox.settings.clone.Activities;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import org.codeaurora.evox.settings.clone.databinding.RootCheckerBinding;
import org.codeaurora.evox.settings.clone.utils.RootUtil;
public class RootChecker extends AppCompatActivity {
    private RootCheckerBinding root;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        root = RootCheckerBinding.inflate(getLayoutInflater());
        setContentView(root.getRoot());
        setSupportActionBar(root.toolbar);
        root.toolbar.setNavigationOnClickListener(v ->{
            onBackPressed();
        });
        if(RootUtil.isDeviceRooted()) {
            root.text.setText("Rooted");
            root.text.setTextColor(Color.GREEN);
        }
        else{
            root.text.setText("Non-Rooted");
            root.text.setTextColor(Color.RED);
        }
    }
}