package com.example.huang.sudoku;

import android.os.Bundle;
import android.preference.PreferenceActivity;

    public class Prefs extends PreferenceActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.settings);

        }
    }
