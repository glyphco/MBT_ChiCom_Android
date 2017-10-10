package com.myboringtown.chicagocomedy;


import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.infinite.LoadMore;

/**
 * Created by janisharali on 05/10/16.
 */
@Layout(R.layout.view)
public class LoadMoreView {

    private Callback mCallback;

    public LoadMoreView(Callback callback) {
        mCallback = callback;
    }

    @LoadMore
    private void onLastItemShown() {
        mCallback.onLoadMore();
    }

    public interface Callback {
        void onLoadMore();
    }
}
