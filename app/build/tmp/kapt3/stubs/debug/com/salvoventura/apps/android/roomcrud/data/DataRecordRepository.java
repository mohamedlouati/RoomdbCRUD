package com.salvoventura.apps.android.roomcrud.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0019\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/salvoventura/apps/android/roomcrud/data/DataRecordRepository;", "", "datarecordDao", "Lcom/salvoventura/apps/android/roomcrud/data/DataRecordDao;", "(Lcom/salvoventura/apps/android/roomcrud/data/DataRecordDao;)V", "allItems", "Landroidx/lifecycle/LiveData;", "", "Lcom/salvoventura/apps/android/roomcrud/data/DataRecord;", "getAllItems", "()Landroidx/lifecycle/LiveData;", "delete", "", "item", "(Lcom/salvoventura/apps/android/roomcrud/data/DataRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "id", "", "insert", "update", "app_debug"})
public final class DataRecordRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.salvoventura.apps.android.roomcrud.data.DataRecord>> allItems = null;
    private final com.salvoventura.apps.android.roomcrud.data.DataRecordDao datarecordDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.salvoventura.apps.android.roomcrud.data.DataRecord>> getAllItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.salvoventura.apps.android.roomcrud.data.DataRecord> get(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.salvoventura.apps.android.roomcrud.data.DataRecord item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.salvoventura.apps.android.roomcrud.data.DataRecord item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.salvoventura.apps.android.roomcrud.data.DataRecord item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public DataRecordRepository(@org.jetbrains.annotations.NotNull()
    com.salvoventura.apps.android.roomcrud.data.DataRecordDao datarecordDao) {
        super();
    }
}