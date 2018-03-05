package com.example.picasso;

import android.content.Context;
import android.widget.AbsListView;

import com.squareup.picasso.Picasso;

public class SampleScrollListener implements AbsListView.OnScrollListener {
  private final Context context;
  private final Picasso picasso;

  public SampleScrollListener(Context context, Picasso picasso) {
    this.context = context;
    this.picasso = picasso;
  }

  @Override
  public void onScrollStateChanged(AbsListView view, int scrollState) {
    if (scrollState == SCROLL_STATE_IDLE || scrollState == SCROLL_STATE_TOUCH_SCROLL) {
      picasso.resumeTag(context);
    } else {
      picasso.pauseTag(context);
    }
  }

  @Override
  public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount,
                       int totalItemCount) {
    // Do nothing.
  }
}
