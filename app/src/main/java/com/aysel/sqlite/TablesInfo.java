package com.aysel.sqlite;

import android.provider.BaseColumns;

/*
 **created by Aysel
 */
public class TablesInfo {

    public static final class NoteEntry implements BaseColumns {
        public static final String TABLE_NAME = "notes";

        public static final String COLUMN_ID = "note_id";
        public static final String COLUMN_NOTE = "note_text";
    }
}