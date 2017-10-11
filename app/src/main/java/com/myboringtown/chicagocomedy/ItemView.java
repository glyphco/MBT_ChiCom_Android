package com.myboringtown.chicagocomedy;

import android.widget.TextView;

import com.androidnetworking.widget.ANImageView;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;


/**
 * Created by janisharali on 24/08/16.
 */
@Layout(R.layout.item_view)
public class ItemView {

    @View(R.id.titleTxt)
    private TextView titleTxt;

    @View(R.id.captionTxt)
    private TextView captionTxt;

    @View(R.id.timeTxt)
    private TextView timeTxt;

    @View(R.id.imageView)
    private ANImageView anImageView;

    private InfiniteFeedInfo mInfo;

    public ItemView(InfiniteFeedInfo info) {
        mInfo = info;
    }

    @Resolve
    private void onResolved() {
        titleTxt.setText(mInfo.getName() );
        captionTxt.setText(mInfo.getDescription());
        timeTxt.setText(mInfo.getLocalStartDate() + " " +  mInfo.getVenueName() + " " + mInfo.getLocalStartTime());
        anImageView.setImageUrl(mInfo.getImageSm());
    }
}
