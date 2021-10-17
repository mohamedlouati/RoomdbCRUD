package com.salvoventura.apps.android.roomcrud.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u001b\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0019H\u0000\u00a2\u0006\u0002\b\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/salvoventura/apps/android/roomcrud/adapters/DataRecordAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/salvoventura/apps/android/roomcrud/adapters/DataRecordAdapter$DataRecordViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "inflater", "Landroid/view/LayoutInflater;", "itemsList", "", "Lcom/salvoventura/apps/android/roomcrud/data/DataRecord;", "onClickListener", "Landroid/view/View$OnClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "items", "", "setItems$app_debug", "DataRecordViewHolder", "app_debug"})
public final class DataRecordAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.salvoventura.apps.android.roomcrud.adapters.DataRecordAdapter.DataRecordViewHolder> {
    private final android.view.LayoutInflater inflater = null;
    private java.util.List<com.salvoventura.apps.android.roomcrud.data.DataRecord> itemsList;
    private final android.view.View.OnClickListener onClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.salvoventura.apps.android.roomcrud.adapters.DataRecordAdapter.DataRecordViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.salvoventura.apps.android.roomcrud.adapters.DataRecordAdapter.DataRecordViewHolder holder, int position) {
    }
    
    public final void setItems$app_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<com.salvoventura.apps.android.roomcrud.data.DataRecord> items) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public DataRecordAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/salvoventura/apps/android/roomcrud/adapters/DataRecordAdapter$DataRecordViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/salvoventura/apps/android/roomcrud/adapters/DataRecordAdapter;Landroid/view/View;)V", "itemId", "Landroid/widget/TextView;", "getItemId", "()Landroid/widget/TextView;", "itemRecord", "getItemRecord", "app_debug"})
    public final class DataRecordViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView itemId = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView itemRecord = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getItemId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getItemRecord() {
            return null;
        }
        
        public DataRecordViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}