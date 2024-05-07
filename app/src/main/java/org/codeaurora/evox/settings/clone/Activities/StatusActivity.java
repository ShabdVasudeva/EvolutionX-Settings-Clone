package org.codeaurora.evox.settings.clone.Activities;

import android.os.Bundle;
import android.preference.SwitchPreference;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import org.codeaurora.evox.settings.clone.R;
import org.codeaurora.evox.settings.clone.databinding.ActivityStatusBinding;
import org.codeaurora.evox.settings.clone.fragments.SettingsPreference;

public class StatusActivity extends AppCompatActivity {
    public ActivityStatusBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStatusBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        binding.toolbar.setNavigationOnClickListener(v ->{
            onBackPressed();
        });
        	getSupportFragmentManager().beginTransaction().replace(R.id.settings_container,new SettingsPreference()).commit();
    }
}
