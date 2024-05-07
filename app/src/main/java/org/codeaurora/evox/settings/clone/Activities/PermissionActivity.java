package org.codeaurora.evox.settings.clone.Activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import org.codeaurora.evox.settings.clone.R;
import org.codeaurora.evox.settings.clone.databinding.ActivityPermissionBinding;
import org.codeaurora.evox.settings.clone.fragments.FragmentPermission;

public class PermissionActivity extends AppCompatActivity {
    private ActivityPermissionBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPermissionBinding.inflate(getLayoutInflater());
        setSupportActionBar(binding.toolbar);
        binding.toolbar.setNavigationOnClickListener(v ->{
            onBackPressed();
        });
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction().replace(R.id.settings_container,new FragmentPermission()).commit();
    }
}
