package com.salvoventura.apps.android.roomcrud.data;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\n\u001a\u00020\u000bH\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\tH\'J\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J%\u0010\u0011\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/salvoventura/apps/android/roomcrud/data/DataRecordDao;", "", "delete", "", "items", "", "Lcom/salvoventura/apps/android/roomcrud/data/DataRecord;", "([Lcom/salvoventura/apps/android/roomcrud/data/DataRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "Landroidx/lifecycle/LiveData;", "id", "", "getall", "", "insert", "item", "(Lcom/salvoventura/apps/android/roomcrud/data/DataRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
public abstract interface DataRecordDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from datarecords")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.salvoventura.apps.android.roomcrud.data.DataRecord>> getall();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.ABORT)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.salvoventura.apps.android.roomcrud.data.DataRecord item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM datarecords WHERE datarecords.id == :id")
    public abstract androidx.lifecycle.LiveData<com.salvoventura.apps.android.roomcrud.data.DataRecord> get(long id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.salvoventura.apps.android.roomcrud.data.DataRecord[] items, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.salvoventura.apps.android.roomcrud.data.DataRecord[] items, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}