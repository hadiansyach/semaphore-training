//package com.ps420.semaphoreapps.view.setting
//
//import android.os.Build
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.preference.ListPreference
//import androidx.appcompat.app.AppCompatDelegate
//import androidx.preference.Preference
//import androidx.preference.PreferenceFragmentCompat
//import com.ps420.semaphoreapps.R
//import com.ps420.semaphoreapps.databinding.ActivitySettingBinding
//class SettingActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_setting)
//        if (savedInstanceState == null) {
//            supportFragmentManager
//                .beginTransaction()
//                .replace(R.id.settings, SettingsFragment())
//                .commit()
//        }
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//
//    }
//
//    class SettingsFragment : PreferenceFragmentCompat() {
//        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
//            setPreferencesFromResource(R.xml.root_preferences, rootKey)
//
//            val switchDayNight: Preference? = findPreference(getString(R.string.pref_key_dark))
//            switchDayNight?.setOnPreferenceChangeListener { preference, newValue ->
//                val stringValue = newValue.toString()
//                if (stringValue == getString(R.string.pref_dark_follow_system)) {
//                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
//                        updateTheme(DarkMode.FOLLOW_SYSTEM.value)
//                    } else {
//                        updateTheme(DarkMode.ON.value)
//                    }
//                } else if (stringValue == getString(R.string.pref_dark_off)) {
//                    updateTheme(DarkMode.OFF.value)
//                } else {
//                    updateTheme(DarkMode.ON.value)
//                }
//                true
//            }
//        }
//
//        private fun updateTheme(mode: Int): Boolean {
//            AppCompatDelegate.setDefaultNightMode(mode)
//            requireActivity().recreate()
//            return true
//        }
//    }
//}
