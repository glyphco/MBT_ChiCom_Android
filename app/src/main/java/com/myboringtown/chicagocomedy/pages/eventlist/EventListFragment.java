package com.myboringtown.chicagocomedy.pages.eventlist;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.mindorks.placeholderview.InfinitePlaceHolderView;
import com.myboringtown.chicagocomedy.R;

import java.util.List;

/**
 * Created by john on 11/16/17.
 */

public class EventListFragment
        extends Fragment
        implements LoadMoreView.Callback {

    private InfinitePlaceHolderView mInfiniteView;

    private OnFragmentInteractionListener mListener;

    private int count = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Do stuff with the bundle that gets passed
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.event_list_fragment, container, false);
        mInfiniteView = view.findViewById(R.id.loadMoreView);
        setupView();
        return view;
    }

    private void setupView() {
        //mInfiniteView.setLoadMoreResolver(new LoadMoreView(this));
        onLoadMore();
    }

    /**
     * Api response for the list is being send from mocky.io
     * Call the api with page number for the real api call
     */
    @Override
    public void onLoadMore() {
        // simulation of 5 pages is done
        if (count++ == 2) {
            mInfiniteView.noMoreToLoad();
        }
        AndroidNetworking.get("https://api.myboringtown.com/api/chicagocomedy/events")
                .build()
                .getAsObjectList(InfiniteFeedInfo.class, new ParsedRequestListener<List<InfiniteFeedInfo>>() {
                    @Override
                    public void onResponse(List<InfiniteFeedInfo> response) {
                        if (response != null && response.size() > 0) {
                            for (InfiniteFeedInfo infiniteFeedInfo : response) {
                                mInfiniteView.addView(new EventItemView(infiniteFeedInfo));
                            }
                        }
                        mInfiniteView.loadingDone();
                    }

                    @Override
                    public void onError(ANError anError) {

                    }
                });
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed() {

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction();
    }
}
