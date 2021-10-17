package com.salvoventura.apps.android.roomcrud.data;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DataRecordDao_Impl implements DataRecordDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DataRecord> __insertionAdapterOfDataRecord;

  private final EntityDeletionOrUpdateAdapter<DataRecord> __deletionAdapterOfDataRecord;

  private final EntityDeletionOrUpdateAdapter<DataRecord> __updateAdapterOfDataRecord;

  public DataRecordDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDataRecord = new EntityInsertionAdapter<DataRecord>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `datarecords` (`id`,`record`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DataRecord value) {
        stmt.bindLong(1, value.getId());
        if (value.getRecord() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getRecord());
        }
      }
    };
    this.__deletionAdapterOfDataRecord = new EntityDeletionOrUpdateAdapter<DataRecord>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `datarecords` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DataRecord value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfDataRecord = new EntityDeletionOrUpdateAdapter<DataRecord>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `datarecords` SET `id` = ?,`record` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DataRecord value) {
        stmt.bindLong(1, value.getId());
        if (value.getRecord() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getRecord());
        }
        stmt.bindLong(3, value.getId());
      }
    };
  }

  @Override
  public Object insert(final DataRecord item, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDataRecord.insert(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final DataRecord[] items, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfDataRecord.handleMultiple(items);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final DataRecord[] items, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfDataRecord.handleMultiple(items);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<DataRecord>> getall() {
    final String _sql = "SELECT * from datarecords";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"datarecords"}, false, new Callable<List<DataRecord>>() {
      @Override
      public List<DataRecord> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfRecord = CursorUtil.getColumnIndexOrThrow(_cursor, "record");
          final List<DataRecord> _result = new ArrayList<DataRecord>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DataRecord _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpRecord;
            _tmpRecord = _cursor.getString(_cursorIndexOfRecord);
            _item = new DataRecord(_tmpId,_tmpRecord);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<DataRecord> get(final long id) {
    final String _sql = "SELECT * FROM datarecords WHERE datarecords.id == ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"datarecords"}, false, new Callable<DataRecord>() {
      @Override
      public DataRecord call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfRecord = CursorUtil.getColumnIndexOrThrow(_cursor, "record");
          final DataRecord _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpRecord;
            _tmpRecord = _cursor.getString(_cursorIndexOfRecord);
            _result = new DataRecord(_tmpId,_tmpRecord);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
