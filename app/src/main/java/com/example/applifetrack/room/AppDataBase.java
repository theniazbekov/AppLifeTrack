package com.example.applifetrack.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.applifetrack.models.TaskModel;

@Database(entities = {TaskModel.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract TaskDao taskDao();
}
