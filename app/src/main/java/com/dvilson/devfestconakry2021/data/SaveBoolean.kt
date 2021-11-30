package com.dvilson.devfestconakry2021.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class SaveBoolean(private val context: Context) {

    // to make sure there's only one instance
    companion object {
        private val Context.dataStoree: DataStore<Preferences> by preferencesDataStore("onBoardinf")
        val ISFIRTIME = booleanPreferencesKey("fist_time")
    }

    //get the saved boolean
    val getisFistTime: Flow<Boolean> = context.dataStoree.data
        .map { preferences ->
            preferences[ISFIRTIME] ?: false
        }

    //save boolean into datastore
    suspend fun saveIsFirsttime(isFistTime: Boolean) {
        context.dataStoree.edit { preferences ->
            preferences[ISFIRTIME] = isFistTime
        }
    }


}