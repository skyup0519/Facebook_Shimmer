package com.example.tp1606008.app_function;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.shimmer.ShimmerFrameLayout;

public class MainActivity extends AppCompatActivity {
    private ShimmerFrameLayout mShimmer;
    private ShimmerFrameLayout mShimmer2;
    private ShimmerFrameLayout mShimmer3;
    private ShimmerFrameLayout mShimmer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findId();
        shimmer();

    }
    public void findId(){

        mShimmer = (ShimmerFrameLayout) findViewById(R.id.shimmer_view_container);
        mShimmer2 = (ShimmerFrameLayout) findViewById(R.id.shimmer_view_container2);
        mShimmer3 = (ShimmerFrameLayout) findViewById(R.id.shimmer_view_container3);
        mShimmer4 = (ShimmerFrameLayout) findViewById(R.id.shimmer_view_container4);
    }

    public void  shimmer(){

        mShimmer.setDuration(5000);
        mShimmer.setRepeatMode(ObjectAnimator.REVERSE);


        mShimmer2.setBaseAlpha(0.1f);
        mShimmer2.setDropoff(0.1f);
        mShimmer2.setTilt(10);
        mShimmer2.setDuration(4000);


        mShimmer3.setAngle(ShimmerFrameLayout.MaskAngle.CW_90);
        mShimmer3.setDuration(500);
        mShimmer4.setDropoff(0.3f);
        mShimmer4.setIntensity(0.6f);


        mShimmer4.setBaseAlpha(0);
        mShimmer4.setDuration(5000);
        mShimmer4.setDropoff(0.1f);
        mShimmer4.setIntensity(0.35f);
        mShimmer4.setMaskShape(ShimmerFrameLayout.MaskShape.RADIAL);

    }


    @Override
    protected void onStart() {
        super.onStart();

        mShimmer.startShimmerAnimation();
        mShimmer2.startShimmerAnimation();
        mShimmer3.startShimmerAnimation();
        mShimmer4.startShimmerAnimation();
    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onPause() {
        mShimmer.stopShimmerAnimation();
        mShimmer2.stopShimmerAnimation();
        mShimmer3.stopShimmerAnimation();
        mShimmer4.stopShimmerAnimation();

        super.onPause();
    }
}
