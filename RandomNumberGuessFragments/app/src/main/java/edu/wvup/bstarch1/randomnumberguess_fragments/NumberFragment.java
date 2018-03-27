package edu.wvup.bstarch1.randomnumberguess_fragments;

/**
 * Created by brady on 3/26/2018.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NumberFragment extends Fragment
{
    public NumberFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_layout, container, false);
    }
}
