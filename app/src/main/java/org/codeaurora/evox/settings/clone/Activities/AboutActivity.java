package org.codeaurora.evox.settings.clone.Activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import org.codeaurora.evox.settings.clone.databinding.ActivityAboutBinding;
import org.codeaurora.evox.settings.clone.R;
import org.codeaurora.evox.settings.clone.fragments.FragmentAbout;

public class AboutActivity extends AppCompatActivity {
    private ActivityAboutBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAboutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        binding.toolbar.setNavigationOnClickListener(v ->{
            onBackPressed();
        });
        getSupportFragmentManager().beginTransaction().replace(R.id.settings_container,new FragmentAbout()).commit();
    }
}
